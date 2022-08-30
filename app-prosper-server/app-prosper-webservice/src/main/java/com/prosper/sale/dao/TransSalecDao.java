package com.prosper.sale.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.prosper.datasource.annotation.DataSource;
import com.prosper.sale.entity.TransSalec;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface TransSalecDao extends BaseMapper<TransSalec> {

    @DataSource("sybase")
    @Transactional(readOnly = true)
    List<TransSalec> queryListByNos(@Param("nos") String nos);
}
