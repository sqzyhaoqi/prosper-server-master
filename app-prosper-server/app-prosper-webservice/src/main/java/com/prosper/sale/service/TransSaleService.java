package com.prosper.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prosper.sale.entity.TransSale;

import java.util.List;

public interface TransSaleService extends IService<TransSale> {

    /**
     * 根据时间获取店铺交易明细
     * @param sDate 开始时间
     * @param eDate 结束时间
     * @param cusno 店铺编号
     * @return
     */
    List<TransSale> queryListByTime(String sDate, String eDate, String cusno);

}
