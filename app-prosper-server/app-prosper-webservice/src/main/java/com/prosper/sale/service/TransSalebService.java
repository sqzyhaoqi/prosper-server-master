package com.prosper.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prosper.sale.entity.TransSaleb;

import java.util.List;

public interface TransSalebService extends IService<TransSaleb> {

    /**
     * 根据单据编号获取POS货品明细
     * @param nos
     * @return
     */
    List<TransSaleb> queryListByNos(String nos);
}
