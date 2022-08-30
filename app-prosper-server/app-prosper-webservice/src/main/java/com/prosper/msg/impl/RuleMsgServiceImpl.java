package com.prosper.msg.impl;

import com.google.common.collect.Maps;
import com.prosper.common.RequestTimeRedis;
import com.prosper.common.util.DateUtils;
import com.prosper.msg.FillMsgService;
import com.prosper.msg.RuleMsgService;
import com.prosper.sale.entity.TransSale;
import com.prosper.sale.entity.TransSaleb;
import com.prosper.sale.entity.TransSalec;
import com.prosper.sale.service.TransSaleService;
import com.prosper.sale.service.TransSalebService;
import com.prosper.sale.service.TransSalecService;
import com.prosper.ws.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class RuleMsgServiceImpl implements RuleMsgService {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    @Value("${app.ws.cusno}")
    private String cusno;
    @Value("${app.ws.offest}")
    private String offest;
    @Value("${app.ws.delay}")
    private String delay;
    @Autowired
    private TransSaleService transSaleService;
    @Autowired
    private TransSalebService transSalebService;
    @Autowired
    private TransSalecService transSalecService;
    @Autowired
    private FillMsgService fillMsgService;
    @Autowired
    private RequestTimeRedis requestTimeRedis;

    private final static SalestransLocator locator = new SalestransLocator();
    private final static Postsalescreaterequest postsalescreaterequest = new Postsalescreaterequest();

    @Override
    public boolean push(Date timeDate) {
        Map<String, Object> map = this.getTime(timeDate);
        String sDate = (String) map.get("sDate");
        String eDate = (String) map.get("eDate");
        return this.pushMsg(sDate, eDate);
    }

    @Override
    public boolean pushMsg(String sDate, String eDate) {
        try {
            List<TransSale> transSales = transSaleService.queryListByTime(sDate, eDate, cusno);
            if (transSales == null || transSales.isEmpty()) {
                logger.info("开始处理推送交易明细报文，共计" + 0 + "笔");
                return true;
            }
            logger.info("开始处理推送交易明细报文，共计" + transSales.size() + "笔");
            int successIndex = 0, errorIndex = 0;
            StringBuffer successSB = new StringBuffer();
            StringBuffer errorSB = new StringBuffer();
            SalestransSoap_PortType service = locator.getsalestransSoap12();
            for (TransSale transSale : transSales) {
                try {
                    Requestheader requestheader = fillMsgService.initHeader();
                    postsalescreaterequest.setHeader(requestheader);
                    Saleshdr saleshdr = fillMsgService.setSaleshdr(transSale);
                    postsalescreaterequest.setSalestotal(saleshdr);
                    List<TransSaleb> transSalebs = transSalebService.queryListByNos(transSale.getNos());
                    Salesitem[] salesitems = fillMsgService.setSalesitems(transSalebs);
                    postsalescreaterequest.setSalesitems(salesitems);
                    List<TransSalec> transSalecs = transSalecService.queryListByNos(transSale.getNos());
                    Salestender[] salestenders = fillMsgService.setSalestenders(transSalecs);
                    postsalescreaterequest.setSalestenders(salestenders);
                    //发送请求报文
                    logger.info("发送请求报文交易明细" + transSale.toString());
                    Postsalescreateresponse postsalescreateresponse = service.postsalescreate(postsalescreaterequest);
                    logger.info("接收到响应报文：" + postsalescreateresponse.getHeader().getResponsemessage());
                    successIndex += 1;
                    successSB.append(transSale.getNos()).append(",");
//                  Thread.sleep(200);
                } catch (Exception e) {
                    errorIndex += 1;
                    errorSB.append(transSale.getNos()).append(",");
                    logger.error("推送交易明细信息失败，错误原因" + e.toString());
                }
            }
            logger.info("完成处理推送交易明细报文，其中：成功" + successIndex + "笔，明细{" + successSB.toString() + "},失败" + errorIndex + "笔，明细{" + errorSB.toString() + "}");
        } catch (Exception e) {
            logger.error("组装推送交易报文信息失败，错误原因" + e.toString());
            logger.info("开始时间" + sDate + ",结束时间" + eDate + ",发送交易明细请求报文" + ("失败"));
            return false;
        } finally {
            requestTimeRedis.saveOrUpdate(DateUtils.format(DateUtils.stringToDate(eDate, "yyyyMMdd HH:mm:ss"), "yyyyMMddHHmmss"));
        }
        logger.info("开始时间" + sDate + ",结束时间" + eDate + ",发送交易明细请求报文" + ("成功"));
        return true;
    }

    private Map<String, Object> getTime(Date timeDate) {
//        String offestTimeStr = requestTimeRedis.get();
        String offestTimeStr = null;
        int offest = Integer.parseInt(this.offest);
        int delay = Integer.parseInt(this.delay);
        String sDate;
        if (offestTimeStr == null || "".equals(offestTimeStr)) {
            int offestTime = offest + delay;
            sDate = DateUtils.format(DateUtils.addDateMinutes(timeDate, offestTime), "yyyyMMdd HH:mm:ss");
        } else {
            sDate = DateUtils.format(DateUtils.stringToDate(offestTimeStr, "yyyyMMddHHmmss"), "yyyyMMdd HH:mm:ss");
        }
        String eDate = DateUtils.format(DateUtils.addDateMinutes(timeDate, delay), "yyyyMMdd HH:mm:ss");
        Map<String, Object> map = Maps.newHashMap();
        map.put("sDate", sDate);
        map.put("eDate", eDate);
        return map;
    }
}
