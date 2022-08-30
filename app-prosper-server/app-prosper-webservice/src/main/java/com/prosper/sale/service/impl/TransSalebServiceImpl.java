package com.prosper.sale.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.prosper.sale.dao.TransSalebDao;
import com.prosper.sale.entity.TransSaleb;
import com.prosper.sale.service.TransSalebService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransSalebServiceImpl extends ServiceImpl<TransSalebDao, TransSaleb> implements TransSalebService {


    @Override
    public List<TransSaleb> queryListByNos(String nos) {
        return this.baseMapper.queryListByNos(nos);
    }
}
