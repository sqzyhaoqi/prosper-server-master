package com.prosper.sale.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName("u2salec")
public class TransSalec implements Serializable {

    @TableField("NOS")
    private String nos;

    @TableField("PAYCODE")
    private String paycode;

    @TableField("MONEY")
    private BigDecimal money;
}
