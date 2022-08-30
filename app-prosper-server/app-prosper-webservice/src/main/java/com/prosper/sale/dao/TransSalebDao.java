package com.prosper.sale.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.prosper.datasource.annotation.DataSource;
import com.prosper.sale.entity.TransSaleb;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface TransSalebDao extends BaseMapper<TransSaleb> {

    @DataSource("sybase")
    @Transactional(readOnly = true)
    List<TransSaleb> queryListByNos(@Param("nos") String nos);
}
