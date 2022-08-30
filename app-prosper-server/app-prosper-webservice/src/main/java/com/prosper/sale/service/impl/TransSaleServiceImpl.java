package com.prosper.sale.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.prosper.sale.dao.TransSaleDao;
import com.prosper.sale.entity.TransSale;
import com.prosper.sale.service.TransSaleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransSaleServiceImpl extends ServiceImpl<TransSaleDao, TransSale> implements TransSaleService {
    @Override
    public List<TransSale> queryListByTime(String sDate, String eDate, String cusno) {
        return this.baseMapper.queryListByTime(sDate, eDate, cusno);
    }
}
