package com.prosper.msg;

import com.prosper.sale.entity.TransSale;
import com.prosper.sale.entity.TransSaleb;
import com.prosper.sale.entity.TransSalec;
import com.prosper.ws.Requestheader;
import com.prosper.ws.Saleshdr;
import com.prosper.ws.Salesitem;
import com.prosper.ws.Salestender;

import java.util.List;

/**
 * 报文封装服务类
 */
public interface FillMsgService {
    /**
     * 初始化请求报文头
     *
     * @return
     */
    Requestheader initHeader();

    /**
     * 这是销售单主表
     * @param transSale
     * @return
     */
    Saleshdr setSaleshdr(TransSale transSale);

    /**
     * 销售单货品明细表
     * @param transSalebs
     * @return
     */
    Salesitem[] setSalesitems(List<TransSaleb> transSalebs);

    /**
     * 销售单付款明细表
     * @param transSalebs
     * @return
     */
    Salestender[] setSalestenders(List<TransSalec> transSalebs);
}
