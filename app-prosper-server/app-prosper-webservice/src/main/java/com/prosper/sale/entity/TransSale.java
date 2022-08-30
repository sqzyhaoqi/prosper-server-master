package com.prosper.sale.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("u2sale")
public class TransSale implements Serializable {

    @TableId
    @TableField("NOS")
    private String nos;

    @TableField("NB")
    private int nb;

    @TableField("SALESCODE")
    private String salescode;

    @TableField("OUTDATE")
    private String outdate;

    @TableField("MONEY")
    private BigDecimal money;

    @TableField("GXRQ")
    private Date gxrq;
}
