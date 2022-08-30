package com.prosper.sale.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName("u2saleb")
public class TransSaleb implements Serializable {
    @TableField("NOS")
    private String nos;

    @TableField("NB")
    private int nb;

    @TableField("MONEY")
    private BigDecimal money;
}
