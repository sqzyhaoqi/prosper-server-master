package com.prosper.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prosper.sale.entity.TransSalec;

import java.util.List;

public interface TransSalecService extends IService<TransSalec> {

    /**
     * 根据POS单号获取支付明细
     * @param nos
     * @return
     */
    List<TransSalec> queryListByNos(String nos);
}
