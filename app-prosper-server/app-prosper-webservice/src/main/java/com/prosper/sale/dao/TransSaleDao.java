package com.prosper.sale.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.prosper.datasource.annotation.DataSource;
import com.prosper.sale.entity.TransSale;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface TransSaleDao extends BaseMapper<TransSale> {

    @DataSource("sybase")
    @Transactional(readOnly = true)
    List<TransSale> queryListByTime(@Param("sDate") String sDate, @Param("eDate") String eDate, @Param("cusno") String cusno);
}
