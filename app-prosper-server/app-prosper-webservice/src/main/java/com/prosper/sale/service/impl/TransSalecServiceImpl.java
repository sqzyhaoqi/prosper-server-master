package com.prosper.sale.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.prosper.sale.dao.TransSalecDao;
import com.prosper.sale.entity.TransSalec;
import com.prosper.sale.service.TransSalecService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransSalecServiceImpl extends ServiceImpl<TransSalecDao, TransSalec> implements TransSalecService {
    @Override
    public List<TransSalec> queryListByNos(String nos) {
        return this.baseMapper.queryListByNos(nos);
    }
}
