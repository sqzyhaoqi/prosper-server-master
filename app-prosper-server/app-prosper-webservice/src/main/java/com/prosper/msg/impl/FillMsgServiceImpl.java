package com.prosper.msg.impl;

import com.prosper.common.Constants;
import com.prosper.common.util.DateUtils;
import com.prosper.msg.FillMsgService;
import com.prosper.sale.entity.TransSale;
import com.prosper.sale.entity.TransSaleb;
import com.prosper.sale.entity.TransSalec;
import com.prosper.ws.Requestheader;
import com.prosper.ws.Saleshdr;
import com.prosper.ws.Salesitem;
import com.prosper.ws.Salestender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class FillMsgServiceImpl implements FillMsgService {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${app.ws.shoper}")
    private String shoper;

    @Override
    public Requestheader initHeader() {
        Requestheader requestheader = new Requestheader();
        //报文头
        requestheader.setMessagetype(Constants.WsMsg.messagetype);// 固定值
        requestheader.setMessageid(Constants.WsMsg.messageid);
        requestheader.setVersion(Constants.WsMsg.version);
        return requestheader;
    }
    /**
     * 这是销售单主表
     *
     * @param transSale
     * @return
     */
    @Override
    public Saleshdr setSaleshdr(TransSale transSale) {
        Saleshdr saleshdr = new Saleshdr();
        try {
            saleshdr.setTxdate_yyyymmdd(transSale.getOutdate());//日期
            saleshdr.setTxtime_hhmmss(DateUtils.format(transSale.getGxrq(), "HHmmss"));//时间
            saleshdr.setMallid(Constants.WsMsg.mallid); //商场编号
            saleshdr.setStorecode(Constants.WsMsg.storecode); //店铺号
            saleshdr.setTillid(Constants.WsMsg.tillid);//默认值 01 有多台收银机，请联系商场提供代码 Web 服务系统需要校验该收银机编号的有效性
            saleshdr.setSalestype(Constants.SalesType.getSalesType(transSale.getNb()).getValue()); //长度:2 SA:店内销售（销售总金额为正数时） SR:店内退货/取消交易（销售总金额为负数时）
            saleshdr.setTxdocno(transSale.getNos()); // 销售单号
            saleshdr.setMallitemcode(Constants.WsMsg.mallitemcode); //RMS 货号
            saleshdr.setCashier(transSale.getSalescode());  // 收银员编号
            saleshdr.setNetqty(new BigDecimal(transSale.getNb())); // 净数量   ----
            saleshdr.setSellingamount(transSale.getMoney()); // 销售金额
            saleshdr.setNetamount(transSale.getMoney());     // 净金额
            saleshdr.setPaidamount(transSale.getMoney());    // 付款金额
            saleshdr.setIssueby(shoper);       // 创建人
            saleshdr.setIssuedate_yyyymmdd(DateUtils.format(DateUtils.getCurrentTimeStamp(), "yyyyMMdd")); // 创建日期
            saleshdr.setIssuetime_hhmmss(DateUtils.format(DateUtils.getCurrentTimeStamp(), "HHmmss")); // 创建时间
        } catch (Exception e) {
            logger.error("组装这是销售单主表发生失败，错误原因" + e.toString());
        }
        return saleshdr;
    }

    @Override
    public Salesitem[] setSalesitems(List<TransSaleb> transSalebs) {
        List<Salesitem> salesitemList = new ArrayList<>();
        try {
            AtomicInteger index = new AtomicInteger();
            transSalebs.forEach(item -> {
                index.addAndGet(1);
                Salesitem salesitem = new Salesitem();
                salesitem.setIscounteritemcode(Constants.WsMsg.iscounteritemcode); // 是否专柜货号
                salesitem.setLineno(index.intValue()); // 行号
                salesitem.setStorecode(Constants.WsMsg.storecode); //店铺号
                salesitem.setMallitemcode(Constants.WsMsg.mallitemcode); //货号
                salesitem.setCounteritemcode(Constants.WsMsg.mallitemcode); //货号
                salesitem.setItemcode(Constants.WsMsg.mallitemcode);//货号
                salesitem.setPlucode(Constants.WsMsg.mallitemcode);//货号
                salesitem.setQty(new BigDecimal(item.getNb())); // 数量
                salesitem.setNetamount(item.getMoney()); // 净金额
                salesitemList.add(salesitem);
            });
        } catch (Exception e) {
            logger.error("组装销售单货品明细表发生失败，错误原因" + e.toString());
        }
        return salesitemList.toArray(new Salesitem[salesitemList.size()]);
    }

    @Override
    public Salestender[] setSalestenders(List<TransSalec> transSalecs) {
        List<Salestender> salestenderList = new ArrayList<>();
        try {
            AtomicInteger index = new AtomicInteger();
            transSalecs.forEach(item -> {
                index.addAndGet(1);
                Salestender salesTender = new Salestender();
                salesTender.setLineno(index.intValue()); // 行号
                salesTender.setTendercode(Constants.PayWay.getBeanByPayWay(item.getPaycode()).getWsPayWay()); // 付款代码
                salesTender.setPayamount(item.getMoney()); // 付款金额
                salestenderList.add(salesTender);
            });
        } catch (Exception e) {
            logger.error("组装销售单付款明细表发生失败，错误原因" + e.toString());
        }
        return salestenderList.toArray(new Salestender[salestenderList.size()]);
    }
}
