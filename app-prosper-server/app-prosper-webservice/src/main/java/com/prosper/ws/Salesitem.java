/**
 * Salesitem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class Salesitem  implements java.io.Serializable {
    private java.lang.String iscounteritemcode;

    private int lineno;

    private java.lang.String storecode;

    private java.lang.String mallitemcode;

    private java.lang.String counteritemcode;

    private java.lang.String itemcode;

    private java.lang.String producttype;

    private java.lang.String productname;

    private java.lang.String plucode;

    private java.lang.String colorcode;

    private java.lang.String sizecode;

    private java.lang.String itemlotnum;

    private java.lang.String serialnum;

    private java.lang.String isdeposit;

    private java.lang.String iswholesale;

    private short invttype;

    private java.math.BigDecimal qty;

    private java.math.BigDecimal exstk2Sales;

    private java.math.BigDecimal originalprice;

    private java.math.BigDecimal sellingprice;

    private java.lang.String pricemode;

    private java.lang.String priceapprove;

    private java.lang.String couponnumber;

    private java.lang.String coupongroup;

    private java.lang.String coupontype;

    private Salesdiscount[] itemdiscount;

    private java.math.BigDecimal vipdiscountpercent;

    private java.math.BigDecimal vipdiscountless;

    private Salespromtion[] promotion;

    private java.math.BigDecimal totaldiscountless1;

    private java.math.BigDecimal totaldiscountless2;

    private java.math.BigDecimal totaldiscountless;

    private Salestax[] tax;

    private java.math.BigDecimal netamount;

    private java.math.BigDecimal bonusearn;

    private java.lang.String salesitemremark;

    private java.lang.String refundreasoncode;

    private java.lang.String extendparam;

    public Salesitem() {
    }

    public Salesitem(
           java.lang.String iscounteritemcode,
           int lineno,
           java.lang.String storecode,
           java.lang.String mallitemcode,
           java.lang.String counteritemcode,
           java.lang.String itemcode,
           java.lang.String producttype,
           java.lang.String productname,
           java.lang.String plucode,
           java.lang.String colorcode,
           java.lang.String sizecode,
           java.lang.String itemlotnum,
           java.lang.String serialnum,
           java.lang.String isdeposit,
           java.lang.String iswholesale,
           short invttype,
           java.math.BigDecimal qty,
           java.math.BigDecimal exstk2Sales,
           java.math.BigDecimal originalprice,
           java.math.BigDecimal sellingprice,
           java.lang.String pricemode,
           java.lang.String priceapprove,
           java.lang.String couponnumber,
           java.lang.String coupongroup,
           java.lang.String coupontype,
           Salesdiscount[] itemdiscount,
           java.math.BigDecimal vipdiscountpercent,
           java.math.BigDecimal vipdiscountless,
           Salespromtion[] promotion,
           java.math.BigDecimal totaldiscountless1,
           java.math.BigDecimal totaldiscountless2,
           java.math.BigDecimal totaldiscountless,
           Salestax[] tax,
           java.math.BigDecimal netamount,
           java.math.BigDecimal bonusearn,
           java.lang.String salesitemremark,
           java.lang.String refundreasoncode,
           java.lang.String extendparam) {
           this.iscounteritemcode = iscounteritemcode;
           this.lineno = lineno;
           this.storecode = storecode;
           this.mallitemcode = mallitemcode;
           this.counteritemcode = counteritemcode;
           this.itemcode = itemcode;
           this.producttype = producttype;
           this.productname = productname;
           this.plucode = plucode;
           this.colorcode = colorcode;
           this.sizecode = sizecode;
           this.itemlotnum = itemlotnum;
           this.serialnum = serialnum;
           this.isdeposit = isdeposit;
           this.iswholesale = iswholesale;
           this.invttype = invttype;
           this.qty = qty;
           this.exstk2Sales = exstk2Sales;
           this.originalprice = originalprice;
           this.sellingprice = sellingprice;
           this.pricemode = pricemode;
           this.priceapprove = priceapprove;
           this.couponnumber = couponnumber;
           this.coupongroup = coupongroup;
           this.coupontype = coupontype;
           this.itemdiscount = itemdiscount;
           this.vipdiscountpercent = vipdiscountpercent;
           this.vipdiscountless = vipdiscountless;
           this.promotion = promotion;
           this.totaldiscountless1 = totaldiscountless1;
           this.totaldiscountless2 = totaldiscountless2;
           this.totaldiscountless = totaldiscountless;
           this.tax = tax;
           this.netamount = netamount;
           this.bonusearn = bonusearn;
           this.salesitemremark = salesitemremark;
           this.refundreasoncode = refundreasoncode;
           this.extendparam = extendparam;
    }


    /**
     * Gets the iscounteritemcode value for this Salesitem.
     * 
     * @return iscounteritemcode
     */
    public java.lang.String getIscounteritemcode() {
        return iscounteritemcode;
    }


    /**
     * Sets the iscounteritemcode value for this Salesitem.
     * 
     * @param iscounteritemcode
     */
    public void setIscounteritemcode(java.lang.String iscounteritemcode) {
        this.iscounteritemcode = iscounteritemcode;
    }


    /**
     * Gets the lineno value for this Salesitem.
     * 
     * @return lineno
     */
    public int getLineno() {
        return lineno;
    }


    /**
     * Sets the lineno value for this Salesitem.
     * 
     * @param lineno
     */
    public void setLineno(int lineno) {
        this.lineno = lineno;
    }


    /**
     * Gets the storecode value for this Salesitem.
     * 
     * @return storecode
     */
    public java.lang.String getStorecode() {
        return storecode;
    }


    /**
     * Sets the storecode value for this Salesitem.
     * 
     * @param storecode
     */
    public void setStorecode(java.lang.String storecode) {
        this.storecode = storecode;
    }


    /**
     * Gets the mallitemcode value for this Salesitem.
     * 
     * @return mallitemcode
     */
    public java.lang.String getMallitemcode() {
        return mallitemcode;
    }


    /**
     * Sets the mallitemcode value for this Salesitem.
     * 
     * @param mallitemcode
     */
    public void setMallitemcode(java.lang.String mallitemcode) {
        this.mallitemcode = mallitemcode;
    }


    /**
     * Gets the counteritemcode value for this Salesitem.
     * 
     * @return counteritemcode
     */
    public java.lang.String getCounteritemcode() {
        return counteritemcode;
    }


    /**
     * Sets the counteritemcode value for this Salesitem.
     * 
     * @param counteritemcode
     */
    public void setCounteritemcode(java.lang.String counteritemcode) {
        this.counteritemcode = counteritemcode;
    }


    /**
     * Gets the itemcode value for this Salesitem.
     * 
     * @return itemcode
     */
    public java.lang.String getItemcode() {
        return itemcode;
    }


    /**
     * Sets the itemcode value for this Salesitem.
     * 
     * @param itemcode
     */
    public void setItemcode(java.lang.String itemcode) {
        this.itemcode = itemcode;
    }


    /**
     * Gets the producttype value for this Salesitem.
     * 
     * @return producttype
     */
    public java.lang.String getProducttype() {
        return producttype;
    }


    /**
     * Sets the producttype value for this Salesitem.
     * 
     * @param producttype
     */
    public void setProducttype(java.lang.String producttype) {
        this.producttype = producttype;
    }


    /**
     * Gets the productname value for this Salesitem.
     * 
     * @return productname
     */
    public java.lang.String getProductname() {
        return productname;
    }


    /**
     * Sets the productname value for this Salesitem.
     * 
     * @param productname
     */
    public void setProductname(java.lang.String productname) {
        this.productname = productname;
    }


    /**
     * Gets the plucode value for this Salesitem.
     * 
     * @return plucode
     */
    public java.lang.String getPlucode() {
        return plucode;
    }


    /**
     * Sets the plucode value for this Salesitem.
     * 
     * @param plucode
     */
    public void setPlucode(java.lang.String plucode) {
        this.plucode = plucode;
    }


    /**
     * Gets the colorcode value for this Salesitem.
     * 
     * @return colorcode
     */
    public java.lang.String getColorcode() {
        return colorcode;
    }


    /**
     * Sets the colorcode value for this Salesitem.
     * 
     * @param colorcode
     */
    public void setColorcode(java.lang.String colorcode) {
        this.colorcode = colorcode;
    }


    /**
     * Gets the sizecode value for this Salesitem.
     * 
     * @return sizecode
     */
    public java.lang.String getSizecode() {
        return sizecode;
    }


    /**
     * Sets the sizecode value for this Salesitem.
     * 
     * @param sizecode
     */
    public void setSizecode(java.lang.String sizecode) {
        this.sizecode = sizecode;
    }


    /**
     * Gets the itemlotnum value for this Salesitem.
     * 
     * @return itemlotnum
     */
    public java.lang.String getItemlotnum() {
        return itemlotnum;
    }


    /**
     * Sets the itemlotnum value for this Salesitem.
     * 
     * @param itemlotnum
     */
    public void setItemlotnum(java.lang.String itemlotnum) {
        this.itemlotnum = itemlotnum;
    }


    /**
     * Gets the serialnum value for this Salesitem.
     * 
     * @return serialnum
     */
    public java.lang.String getSerialnum() {
        return serialnum;
    }


    /**
     * Sets the serialnum value for this Salesitem.
     * 
     * @param serialnum
     */
    public void setSerialnum(java.lang.String serialnum) {
        this.serialnum = serialnum;
    }


    /**
     * Gets the isdeposit value for this Salesitem.
     * 
     * @return isdeposit
     */
    public java.lang.String getIsdeposit() {
        return isdeposit;
    }


    /**
     * Sets the isdeposit value for this Salesitem.
     * 
     * @param isdeposit
     */
    public void setIsdeposit(java.lang.String isdeposit) {
        this.isdeposit = isdeposit;
    }


    /**
     * Gets the iswholesale value for this Salesitem.
     * 
     * @return iswholesale
     */
    public java.lang.String getIswholesale() {
        return iswholesale;
    }


    /**
     * Sets the iswholesale value for this Salesitem.
     * 
     * @param iswholesale
     */
    public void setIswholesale(java.lang.String iswholesale) {
        this.iswholesale = iswholesale;
    }


    /**
     * Gets the invttype value for this Salesitem.
     * 
     * @return invttype
     */
    public short getInvttype() {
        return invttype;
    }


    /**
     * Sets the invttype value for this Salesitem.
     * 
     * @param invttype
     */
    public void setInvttype(short invttype) {
        this.invttype = invttype;
    }


    /**
     * Gets the qty value for this Salesitem.
     * 
     * @return qty
     */
    public java.math.BigDecimal getQty() {
        return qty;
    }


    /**
     * Sets the qty value for this Salesitem.
     * 
     * @param qty
     */
    public void setQty(java.math.BigDecimal qty) {
        this.qty = qty;
    }


    /**
     * Gets the exstk2Sales value for this Salesitem.
     * 
     * @return exstk2Sales
     */
    public java.math.BigDecimal getExstk2Sales() {
        return exstk2Sales;
    }


    /**
     * Sets the exstk2Sales value for this Salesitem.
     * 
     * @param exstk2Sales
     */
    public void setExstk2Sales(java.math.BigDecimal exstk2Sales) {
        this.exstk2Sales = exstk2Sales;
    }


    /**
     * Gets the originalprice value for this Salesitem.
     * 
     * @return originalprice
     */
    public java.math.BigDecimal getOriginalprice() {
        return originalprice;
    }


    /**
     * Sets the originalprice value for this Salesitem.
     * 
     * @param originalprice
     */
    public void setOriginalprice(java.math.BigDecimal originalprice) {
        this.originalprice = originalprice;
    }


    /**
     * Gets the sellingprice value for this Salesitem.
     * 
     * @return sellingprice
     */
    public java.math.BigDecimal getSellingprice() {
        return sellingprice;
    }


    /**
     * Sets the sellingprice value for this Salesitem.
     * 
     * @param sellingprice
     */
    public void setSellingprice(java.math.BigDecimal sellingprice) {
        this.sellingprice = sellingprice;
    }


    /**
     * Gets the pricemode value for this Salesitem.
     * 
     * @return pricemode
     */
    public java.lang.String getPricemode() {
        return pricemode;
    }


    /**
     * Sets the pricemode value for this Salesitem.
     * 
     * @param pricemode
     */
    public void setPricemode(java.lang.String pricemode) {
        this.pricemode = pricemode;
    }


    /**
     * Gets the priceapprove value for this Salesitem.
     * 
     * @return priceapprove
     */
    public java.lang.String getPriceapprove() {
        return priceapprove;
    }


    /**
     * Sets the priceapprove value for this Salesitem.
     * 
     * @param priceapprove
     */
    public void setPriceapprove(java.lang.String priceapprove) {
        this.priceapprove = priceapprove;
    }


    /**
     * Gets the couponnumber value for this Salesitem.
     * 
     * @return couponnumber
     */
    public java.lang.String getCouponnumber() {
        return couponnumber;
    }


    /**
     * Sets the couponnumber value for this Salesitem.
     * 
     * @param couponnumber
     */
    public void setCouponnumber(java.lang.String couponnumber) {
        this.couponnumber = couponnumber;
    }


    /**
     * Gets the coupongroup value for this Salesitem.
     * 
     * @return coupongroup
     */
    public java.lang.String getCoupongroup() {
        return coupongroup;
    }


    /**
     * Sets the coupongroup value for this Salesitem.
     * 
     * @param coupongroup
     */
    public void setCoupongroup(java.lang.String coupongroup) {
        this.coupongroup = coupongroup;
    }


    /**
     * Gets the coupontype value for this Salesitem.
     * 
     * @return coupontype
     */
    public java.lang.String getCoupontype() {
        return coupontype;
    }


    /**
     * Sets the coupontype value for this Salesitem.
     * 
     * @param coupontype
     */
    public void setCoupontype(java.lang.String coupontype) {
        this.coupontype = coupontype;
    }


    /**
     * Gets the itemdiscount value for this Salesitem.
     * 
     * @return itemdiscount
     */
    public Salesdiscount[] getItemdiscount() {
        return itemdiscount;
    }


    /**
     * Sets the itemdiscount value for this Salesitem.
     * 
     * @param itemdiscount
     */
    public void setItemdiscount(Salesdiscount[] itemdiscount) {
        this.itemdiscount = itemdiscount;
    }


    /**
     * Gets the vipdiscountpercent value for this Salesitem.
     * 
     * @return vipdiscountpercent
     */
    public java.math.BigDecimal getVipdiscountpercent() {
        return vipdiscountpercent;
    }


    /**
     * Sets the vipdiscountpercent value for this Salesitem.
     * 
     * @param vipdiscountpercent
     */
    public void setVipdiscountpercent(java.math.BigDecimal vipdiscountpercent) {
        this.vipdiscountpercent = vipdiscountpercent;
    }


    /**
     * Gets the vipdiscountless value for this Salesitem.
     * 
     * @return vipdiscountless
     */
    public java.math.BigDecimal getVipdiscountless() {
        return vipdiscountless;
    }


    /**
     * Sets the vipdiscountless value for this Salesitem.
     * 
     * @param vipdiscountless
     */
    public void setVipdiscountless(java.math.BigDecimal vipdiscountless) {
        this.vipdiscountless = vipdiscountless;
    }


    /**
     * Gets the promotion value for this Salesitem.
     * 
     * @return promotion
     */
    public Salespromtion[] getPromotion() {
        return promotion;
    }


    /**
     * Sets the promotion value for this Salesitem.
     * 
     * @param promotion
     */
    public void setPromotion(Salespromtion[] promotion) {
        this.promotion = promotion;
    }


    /**
     * Gets the totaldiscountless1 value for this Salesitem.
     * 
     * @return totaldiscountless1
     */
    public java.math.BigDecimal getTotaldiscountless1() {
        return totaldiscountless1;
    }


    /**
     * Sets the totaldiscountless1 value for this Salesitem.
     * 
     * @param totaldiscountless1
     */
    public void setTotaldiscountless1(java.math.BigDecimal totaldiscountless1) {
        this.totaldiscountless1 = totaldiscountless1;
    }


    /**
     * Gets the totaldiscountless2 value for this Salesitem.
     * 
     * @return totaldiscountless2
     */
    public java.math.BigDecimal getTotaldiscountless2() {
        return totaldiscountless2;
    }


    /**
     * Sets the totaldiscountless2 value for this Salesitem.
     * 
     * @param totaldiscountless2
     */
    public void setTotaldiscountless2(java.math.BigDecimal totaldiscountless2) {
        this.totaldiscountless2 = totaldiscountless2;
    }


    /**
     * Gets the totaldiscountless value for this Salesitem.
     * 
     * @return totaldiscountless
     */
    public java.math.BigDecimal getTotaldiscountless() {
        return totaldiscountless;
    }


    /**
     * Sets the totaldiscountless value for this Salesitem.
     * 
     * @param totaldiscountless
     */
    public void setTotaldiscountless(java.math.BigDecimal totaldiscountless) {
        this.totaldiscountless = totaldiscountless;
    }


    /**
     * Gets the tax value for this Salesitem.
     * 
     * @return tax
     */
    public Salestax[] getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this Salesitem.
     * 
     * @param tax
     */
    public void setTax(Salestax[] tax) {
        this.tax = tax;
    }


    /**
     * Gets the netamount value for this Salesitem.
     * 
     * @return netamount
     */
    public java.math.BigDecimal getNetamount() {
        return netamount;
    }


    /**
     * Sets the netamount value for this Salesitem.
     * 
     * @param netamount
     */
    public void setNetamount(java.math.BigDecimal netamount) {
        this.netamount = netamount;
    }


    /**
     * Gets the bonusearn value for this Salesitem.
     * 
     * @return bonusearn
     */
    public java.math.BigDecimal getBonusearn() {
        return bonusearn;
    }


    /**
     * Sets the bonusearn value for this Salesitem.
     * 
     * @param bonusearn
     */
    public void setBonusearn(java.math.BigDecimal bonusearn) {
        this.bonusearn = bonusearn;
    }


    /**
     * Gets the salesitemremark value for this Salesitem.
     * 
     * @return salesitemremark
     */
    public java.lang.String getSalesitemremark() {
        return salesitemremark;
    }


    /**
     * Sets the salesitemremark value for this Salesitem.
     * 
     * @param salesitemremark
     */
    public void setSalesitemremark(java.lang.String salesitemremark) {
        this.salesitemremark = salesitemremark;
    }


    /**
     * Gets the refundreasoncode value for this Salesitem.
     * 
     * @return refundreasoncode
     */
    public java.lang.String getRefundreasoncode() {
        return refundreasoncode;
    }


    /**
     * Sets the refundreasoncode value for this Salesitem.
     * 
     * @param refundreasoncode
     */
    public void setRefundreasoncode(java.lang.String refundreasoncode) {
        this.refundreasoncode = refundreasoncode;
    }


    /**
     * Gets the extendparam value for this Salesitem.
     * 
     * @return extendparam
     */
    public java.lang.String getExtendparam() {
        return extendparam;
    }


    /**
     * Sets the extendparam value for this Salesitem.
     * 
     * @param extendparam
     */
    public void setExtendparam(java.lang.String extendparam) {
        this.extendparam = extendparam;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Salesitem)) return false;
        Salesitem other = (Salesitem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.iscounteritemcode==null && other.getIscounteritemcode()==null) || 
             (this.iscounteritemcode!=null &&
              this.iscounteritemcode.equals(other.getIscounteritemcode()))) &&
            this.lineno == other.getLineno() &&
            ((this.storecode==null && other.getStorecode()==null) || 
             (this.storecode!=null &&
              this.storecode.equals(other.getStorecode()))) &&
            ((this.mallitemcode==null && other.getMallitemcode()==null) || 
             (this.mallitemcode!=null &&
              this.mallitemcode.equals(other.getMallitemcode()))) &&
            ((this.counteritemcode==null && other.getCounteritemcode()==null) || 
             (this.counteritemcode!=null &&
              this.counteritemcode.equals(other.getCounteritemcode()))) &&
            ((this.itemcode==null && other.getItemcode()==null) || 
             (this.itemcode!=null &&
              this.itemcode.equals(other.getItemcode()))) &&
            ((this.producttype==null && other.getProducttype()==null) || 
             (this.producttype!=null &&
              this.producttype.equals(other.getProducttype()))) &&
            ((this.productname==null && other.getProductname()==null) || 
             (this.productname!=null &&
              this.productname.equals(other.getProductname()))) &&
            ((this.plucode==null && other.getPlucode()==null) || 
             (this.plucode!=null &&
              this.plucode.equals(other.getPlucode()))) &&
            ((this.colorcode==null && other.getColorcode()==null) || 
             (this.colorcode!=null &&
              this.colorcode.equals(other.getColorcode()))) &&
            ((this.sizecode==null && other.getSizecode()==null) || 
             (this.sizecode!=null &&
              this.sizecode.equals(other.getSizecode()))) &&
            ((this.itemlotnum==null && other.getItemlotnum()==null) || 
             (this.itemlotnum!=null &&
              this.itemlotnum.equals(other.getItemlotnum()))) &&
            ((this.serialnum==null && other.getSerialnum()==null) || 
             (this.serialnum!=null &&
              this.serialnum.equals(other.getSerialnum()))) &&
            ((this.isdeposit==null && other.getIsdeposit()==null) || 
             (this.isdeposit!=null &&
              this.isdeposit.equals(other.getIsdeposit()))) &&
            ((this.iswholesale==null && other.getIswholesale()==null) || 
             (this.iswholesale!=null &&
              this.iswholesale.equals(other.getIswholesale()))) &&
            this.invttype == other.getInvttype() &&
            ((this.qty==null && other.getQty()==null) || 
             (this.qty!=null &&
              this.qty.equals(other.getQty()))) &&
            ((this.exstk2Sales==null && other.getExstk2Sales()==null) || 
             (this.exstk2Sales!=null &&
              this.exstk2Sales.equals(other.getExstk2Sales()))) &&
            ((this.originalprice==null && other.getOriginalprice()==null) || 
             (this.originalprice!=null &&
              this.originalprice.equals(other.getOriginalprice()))) &&
            ((this.sellingprice==null && other.getSellingprice()==null) || 
             (this.sellingprice!=null &&
              this.sellingprice.equals(other.getSellingprice()))) &&
            ((this.pricemode==null && other.getPricemode()==null) || 
             (this.pricemode!=null &&
              this.pricemode.equals(other.getPricemode()))) &&
            ((this.priceapprove==null && other.getPriceapprove()==null) || 
             (this.priceapprove!=null &&
              this.priceapprove.equals(other.getPriceapprove()))) &&
            ((this.couponnumber==null && other.getCouponnumber()==null) || 
             (this.couponnumber!=null &&
              this.couponnumber.equals(other.getCouponnumber()))) &&
            ((this.coupongroup==null && other.getCoupongroup()==null) || 
             (this.coupongroup!=null &&
              this.coupongroup.equals(other.getCoupongroup()))) &&
            ((this.coupontype==null && other.getCoupontype()==null) || 
             (this.coupontype!=null &&
              this.coupontype.equals(other.getCoupontype()))) &&
            ((this.itemdiscount==null && other.getItemdiscount()==null) || 
             (this.itemdiscount!=null &&
              java.util.Arrays.equals(this.itemdiscount, other.getItemdiscount()))) &&
            ((this.vipdiscountpercent==null && other.getVipdiscountpercent()==null) || 
             (this.vipdiscountpercent!=null &&
              this.vipdiscountpercent.equals(other.getVipdiscountpercent()))) &&
            ((this.vipdiscountless==null && other.getVipdiscountless()==null) || 
             (this.vipdiscountless!=null &&
              this.vipdiscountless.equals(other.getVipdiscountless()))) &&
            ((this.promotion==null && other.getPromotion()==null) || 
             (this.promotion!=null &&
              java.util.Arrays.equals(this.promotion, other.getPromotion()))) &&
            ((this.totaldiscountless1==null && other.getTotaldiscountless1()==null) || 
             (this.totaldiscountless1!=null &&
              this.totaldiscountless1.equals(other.getTotaldiscountless1()))) &&
            ((this.totaldiscountless2==null && other.getTotaldiscountless2()==null) || 
             (this.totaldiscountless2!=null &&
              this.totaldiscountless2.equals(other.getTotaldiscountless2()))) &&
            ((this.totaldiscountless==null && other.getTotaldiscountless()==null) || 
             (this.totaldiscountless!=null &&
              this.totaldiscountless.equals(other.getTotaldiscountless()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              java.util.Arrays.equals(this.tax, other.getTax()))) &&
            ((this.netamount==null && other.getNetamount()==null) || 
             (this.netamount!=null &&
              this.netamount.equals(other.getNetamount()))) &&
            ((this.bonusearn==null && other.getBonusearn()==null) || 
             (this.bonusearn!=null &&
              this.bonusearn.equals(other.getBonusearn()))) &&
            ((this.salesitemremark==null && other.getSalesitemremark()==null) || 
             (this.salesitemremark!=null &&
              this.salesitemremark.equals(other.getSalesitemremark()))) &&
            ((this.refundreasoncode==null && other.getRefundreasoncode()==null) || 
             (this.refundreasoncode!=null &&
              this.refundreasoncode.equals(other.getRefundreasoncode()))) &&
            ((this.extendparam==null && other.getExtendparam()==null) || 
             (this.extendparam!=null &&
              this.extendparam.equals(other.getExtendparam())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIscounteritemcode() != null) {
            _hashCode += getIscounteritemcode().hashCode();
        }
        _hashCode += getLineno();
        if (getStorecode() != null) {
            _hashCode += getStorecode().hashCode();
        }
        if (getMallitemcode() != null) {
            _hashCode += getMallitemcode().hashCode();
        }
        if (getCounteritemcode() != null) {
            _hashCode += getCounteritemcode().hashCode();
        }
        if (getItemcode() != null) {
            _hashCode += getItemcode().hashCode();
        }
        if (getProducttype() != null) {
            _hashCode += getProducttype().hashCode();
        }
        if (getProductname() != null) {
            _hashCode += getProductname().hashCode();
        }
        if (getPlucode() != null) {
            _hashCode += getPlucode().hashCode();
        }
        if (getColorcode() != null) {
            _hashCode += getColorcode().hashCode();
        }
        if (getSizecode() != null) {
            _hashCode += getSizecode().hashCode();
        }
        if (getItemlotnum() != null) {
            _hashCode += getItemlotnum().hashCode();
        }
        if (getSerialnum() != null) {
            _hashCode += getSerialnum().hashCode();
        }
        if (getIsdeposit() != null) {
            _hashCode += getIsdeposit().hashCode();
        }
        if (getIswholesale() != null) {
            _hashCode += getIswholesale().hashCode();
        }
        _hashCode += getInvttype();
        if (getQty() != null) {
            _hashCode += getQty().hashCode();
        }
        if (getExstk2Sales() != null) {
            _hashCode += getExstk2Sales().hashCode();
        }
        if (getOriginalprice() != null) {
            _hashCode += getOriginalprice().hashCode();
        }
        if (getSellingprice() != null) {
            _hashCode += getSellingprice().hashCode();
        }
        if (getPricemode() != null) {
            _hashCode += getPricemode().hashCode();
        }
        if (getPriceapprove() != null) {
            _hashCode += getPriceapprove().hashCode();
        }
        if (getCouponnumber() != null) {
            _hashCode += getCouponnumber().hashCode();
        }
        if (getCoupongroup() != null) {
            _hashCode += getCoupongroup().hashCode();
        }
        if (getCoupontype() != null) {
            _hashCode += getCoupontype().hashCode();
        }
        if (getItemdiscount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemdiscount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemdiscount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVipdiscountpercent() != null) {
            _hashCode += getVipdiscountpercent().hashCode();
        }
        if (getVipdiscountless() != null) {
            _hashCode += getVipdiscountless().hashCode();
        }
        if (getPromotion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotaldiscountless1() != null) {
            _hashCode += getTotaldiscountless1().hashCode();
        }
        if (getTotaldiscountless2() != null) {
            _hashCode += getTotaldiscountless2().hashCode();
        }
        if (getTotaldiscountless() != null) {
            _hashCode += getTotaldiscountless().hashCode();
        }
        if (getTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetamount() != null) {
            _hashCode += getNetamount().hashCode();
        }
        if (getBonusearn() != null) {
            _hashCode += getBonusearn().hashCode();
        }
        if (getSalesitemremark() != null) {
            _hashCode += getSalesitemremark().hashCode();
        }
        if (getRefundreasoncode() != null) {
            _hashCode += getRefundreasoncode().hashCode();
        }
        if (getExtendparam() != null) {
            _hashCode += getExtendparam().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Salesitem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "salesitem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iscounteritemcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "iscounteritemcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "lineno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "storecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mallitemcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "mallitemcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counteritemcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "counteritemcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "itemcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producttype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "producttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "productname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plucode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "plucode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "colorcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "sizecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemlotnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "itemlotnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "serialnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isdeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "isdeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iswholesale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "iswholesale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invttype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "invttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "qty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exstk2Sales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "exstk2sales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalprice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "originalprice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellingprice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "sellingprice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricemode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "pricemode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceapprove");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "priceapprove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "couponnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupongroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "coupongroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupontype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "coupontype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemdiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "itemdiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "salesdiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempurl.org", "salesdiscount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vipdiscountpercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "vipdiscountpercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vipdiscountless");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "vipdiscountless"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "promotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "salespromtion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempurl.org", "salespromtion"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaldiscountless1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "totaldiscountless1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaldiscountless2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "totaldiscountless2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaldiscountless");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "totaldiscountless"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "salestax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempurl.org", "salestax"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "netamount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusearn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "bonusearn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesitemremark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "salesitemremark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundreasoncode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "refundreasoncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendparam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "extendparam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
