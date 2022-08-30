/**
 * Saleshdr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class Saleshdr  implements java.io.Serializable {
    private java.lang.String localstorecode;

    private java.lang.String reservedocno;

    private java.lang.String txdate_yyyymmdd;

    private java.lang.String txtime_hhmmss;

    private java.lang.String mallid;

    private java.lang.String storecode;

    private java.lang.String tillid;

    private java.lang.String salestype;

    private java.lang.String txdocno;

    private java.lang.String orgtxdate_yyyymmdd;

    private java.lang.String orgstorecode;

    private java.lang.String orgtillid;

    private java.lang.String orgtxdocno;

    private java.lang.String mallitemcode;

    private java.lang.String cashier;

    private java.lang.String vipcode;

    private java.lang.String salesman;

    private java.lang.String demographiccode;

    private java.lang.String demographicdata;

    private java.math.BigDecimal netqty;

    private java.math.BigDecimal originalamount;

    private java.math.BigDecimal sellingamount;

    private java.lang.String couponnumber;

    private java.lang.String coupongroup;

    private java.lang.String coupontype;

    private short couponqty;

    private Salesdiscount[] totaldiscount;

    private java.math.BigDecimal ttltaxamount1;

    private java.math.BigDecimal ttltaxamount2;

    private java.math.BigDecimal netamount;

    private java.math.BigDecimal paidamount;

    private java.math.BigDecimal changeamount;

    private java.lang.String priceincludetax;

    private java.lang.String shoptaxgroup;

    private java.lang.String extendparam;

    private java.lang.String invoicetitle;

    private java.lang.String invoicecontent;

    private java.lang.String issueby;

    private java.lang.String issuedate_yyyymmdd;

    private java.lang.String issuetime_hhmmss;

    private java.lang.String ecorderno;

    private java.lang.String buyerremark;

    private java.lang.String orderremark;

    private java.lang.String status;

    private java.lang.String ttpossalesdocno;

    public Saleshdr() {
    }

    public Saleshdr(
           java.lang.String localstorecode,
           java.lang.String reservedocno,
           java.lang.String txdate_yyyymmdd,
           java.lang.String txtime_hhmmss,
           java.lang.String mallid,
           java.lang.String storecode,
           java.lang.String tillid,
           java.lang.String salestype,
           java.lang.String txdocno,
           java.lang.String orgtxdate_yyyymmdd,
           java.lang.String orgstorecode,
           java.lang.String orgtillid,
           java.lang.String orgtxdocno,
           java.lang.String mallitemcode,
           java.lang.String cashier,
           java.lang.String vipcode,
           java.lang.String salesman,
           java.lang.String demographiccode,
           java.lang.String demographicdata,
           java.math.BigDecimal netqty,
           java.math.BigDecimal originalamount,
           java.math.BigDecimal sellingamount,
           java.lang.String couponnumber,
           java.lang.String coupongroup,
           java.lang.String coupontype,
           short couponqty,
           Salesdiscount[] totaldiscount,
           java.math.BigDecimal ttltaxamount1,
           java.math.BigDecimal ttltaxamount2,
           java.math.BigDecimal netamount,
           java.math.BigDecimal paidamount,
           java.math.BigDecimal changeamount,
           java.lang.String priceincludetax,
           java.lang.String shoptaxgroup,
           java.lang.String extendparam,
           java.lang.String invoicetitle,
           java.lang.String invoicecontent,
           java.lang.String issueby,
           java.lang.String issuedate_yyyymmdd,
           java.lang.String issuetime_hhmmss,
           java.lang.String ecorderno,
           java.lang.String buyerremark,
           java.lang.String orderremark,
           java.lang.String status,
           java.lang.String ttpossalesdocno) {
           this.localstorecode = localstorecode;
           this.reservedocno = reservedocno;
           this.txdate_yyyymmdd = txdate_yyyymmdd;
           this.txtime_hhmmss = txtime_hhmmss;
           this.mallid = mallid;
           this.storecode = storecode;
           this.tillid = tillid;
           this.salestype = salestype;
           this.txdocno = txdocno;
           this.orgtxdate_yyyymmdd = orgtxdate_yyyymmdd;
           this.orgstorecode = orgstorecode;
           this.orgtillid = orgtillid;
           this.orgtxdocno = orgtxdocno;
           this.mallitemcode = mallitemcode;
           this.cashier = cashier;
           this.vipcode = vipcode;
           this.salesman = salesman;
           this.demographiccode = demographiccode;
           this.demographicdata = demographicdata;
           this.netqty = netqty;
           this.originalamount = originalamount;
           this.sellingamount = sellingamount;
           this.couponnumber = couponnumber;
           this.coupongroup = coupongroup;
           this.coupontype = coupontype;
           this.couponqty = couponqty;
           this.totaldiscount = totaldiscount;
           this.ttltaxamount1 = ttltaxamount1;
           this.ttltaxamount2 = ttltaxamount2;
           this.netamount = netamount;
           this.paidamount = paidamount;
           this.changeamount = changeamount;
           this.priceincludetax = priceincludetax;
           this.shoptaxgroup = shoptaxgroup;
           this.extendparam = extendparam;
           this.invoicetitle = invoicetitle;
           this.invoicecontent = invoicecontent;
           this.issueby = issueby;
           this.issuedate_yyyymmdd = issuedate_yyyymmdd;
           this.issuetime_hhmmss = issuetime_hhmmss;
           this.ecorderno = ecorderno;
           this.buyerremark = buyerremark;
           this.orderremark = orderremark;
           this.status = status;
           this.ttpossalesdocno = ttpossalesdocno;
    }


    /**
     * Gets the localstorecode value for this Saleshdr.
     * 
     * @return localstorecode
     */
    public java.lang.String getLocalstorecode() {
        return localstorecode;
    }


    /**
     * Sets the localstorecode value for this Saleshdr.
     * 
     * @param localstorecode
     */
    public void setLocalstorecode(java.lang.String localstorecode) {
        this.localstorecode = localstorecode;
    }


    /**
     * Gets the reservedocno value for this Saleshdr.
     * 
     * @return reservedocno
     */
    public java.lang.String getReservedocno() {
        return reservedocno;
    }


    /**
     * Sets the reservedocno value for this Saleshdr.
     * 
     * @param reservedocno
     */
    public void setReservedocno(java.lang.String reservedocno) {
        this.reservedocno = reservedocno;
    }


    /**
     * Gets the txdate_yyyymmdd value for this Saleshdr.
     * 
     * @return txdate_yyyymmdd
     */
    public java.lang.String getTxdate_yyyymmdd() {
        return txdate_yyyymmdd;
    }


    /**
     * Sets the txdate_yyyymmdd value for this Saleshdr.
     * 
     * @param txdate_yyyymmdd
     */
    public void setTxdate_yyyymmdd(java.lang.String txdate_yyyymmdd) {
        this.txdate_yyyymmdd = txdate_yyyymmdd;
    }


    /**
     * Gets the txtime_hhmmss value for this Saleshdr.
     * 
     * @return txtime_hhmmss
     */
    public java.lang.String getTxtime_hhmmss() {
        return txtime_hhmmss;
    }


    /**
     * Sets the txtime_hhmmss value for this Saleshdr.
     * 
     * @param txtime_hhmmss
     */
    public void setTxtime_hhmmss(java.lang.String txtime_hhmmss) {
        this.txtime_hhmmss = txtime_hhmmss;
    }


    /**
     * Gets the mallid value for this Saleshdr.
     * 
     * @return mallid
     */
    public java.lang.String getMallid() {
        return mallid;
    }


    /**
     * Sets the mallid value for this Saleshdr.
     * 
     * @param mallid
     */
    public void setMallid(java.lang.String mallid) {
        this.mallid = mallid;
    }


    /**
     * Gets the storecode value for this Saleshdr.
     * 
     * @return storecode
     */
    public java.lang.String getStorecode() {
        return storecode;
    }


    /**
     * Sets the storecode value for this Saleshdr.
     * 
     * @param storecode
     */
    public void setStorecode(java.lang.String storecode) {
        this.storecode = storecode;
    }


    /**
     * Gets the tillid value for this Saleshdr.
     * 
     * @return tillid
     */
    public java.lang.String getTillid() {
        return tillid;
    }


    /**
     * Sets the tillid value for this Saleshdr.
     * 
     * @param tillid
     */
    public void setTillid(java.lang.String tillid) {
        this.tillid = tillid;
    }


    /**
     * Gets the salestype value for this Saleshdr.
     * 
     * @return salestype
     */
    public java.lang.String getSalestype() {
        return salestype;
    }


    /**
     * Sets the salestype value for this Saleshdr.
     * 
     * @param salestype
     */
    public void setSalestype(java.lang.String salestype) {
        this.salestype = salestype;
    }


    /**
     * Gets the txdocno value for this Saleshdr.
     * 
     * @return txdocno
     */
    public java.lang.String getTxdocno() {
        return txdocno;
    }


    /**
     * Sets the txdocno value for this Saleshdr.
     * 
     * @param txdocno
     */
    public void setTxdocno(java.lang.String txdocno) {
        this.txdocno = txdocno;
    }


    /**
     * Gets the orgtxdate_yyyymmdd value for this Saleshdr.
     * 
     * @return orgtxdate_yyyymmdd
     */
    public java.lang.String getOrgtxdate_yyyymmdd() {
        return orgtxdate_yyyymmdd;
    }


    /**
     * Sets the orgtxdate_yyyymmdd value for this Saleshdr.
     * 
     * @param orgtxdate_yyyymmdd
     */
    public void setOrgtxdate_yyyymmdd(java.lang.String orgtxdate_yyyymmdd) {
        this.orgtxdate_yyyymmdd = orgtxdate_yyyymmdd;
    }


    /**
     * Gets the orgstorecode value for this Saleshdr.
     * 
     * @return orgstorecode
     */
    public java.lang.String getOrgstorecode() {
        return orgstorecode;
    }


    /**
     * Sets the orgstorecode value for this Saleshdr.
     * 
     * @param orgstorecode
     */
    public void setOrgstorecode(java.lang.String orgstorecode) {
        this.orgstorecode = orgstorecode;
    }


    /**
     * Gets the orgtillid value for this Saleshdr.
     * 
     * @return orgtillid
     */
    public java.lang.String getOrgtillid() {
        return orgtillid;
    }


    /**
     * Sets the orgtillid value for this Saleshdr.
     * 
     * @param orgtillid
     */
    public void setOrgtillid(java.lang.String orgtillid) {
        this.orgtillid = orgtillid;
    }


    /**
     * Gets the orgtxdocno value for this Saleshdr.
     * 
     * @return orgtxdocno
     */
    public java.lang.String getOrgtxdocno() {
        return orgtxdocno;
    }


    /**
     * Sets the orgtxdocno value for this Saleshdr.
     * 
     * @param orgtxdocno
     */
    public void setOrgtxdocno(java.lang.String orgtxdocno) {
        this.orgtxdocno = orgtxdocno;
    }


    /**
     * Gets the mallitemcode value for this Saleshdr.
     * 
     * @return mallitemcode
     */
    public java.lang.String getMallitemcode() {
        return mallitemcode;
    }


    /**
     * Sets the mallitemcode value for this Saleshdr.
     * 
     * @param mallitemcode
     */
    public void setMallitemcode(java.lang.String mallitemcode) {
        this.mallitemcode = mallitemcode;
    }


    /**
     * Gets the cashier value for this Saleshdr.
     * 
     * @return cashier
     */
    public java.lang.String getCashier() {
        return cashier;
    }


    /**
     * Sets the cashier value for this Saleshdr.
     * 
     * @param cashier
     */
    public void setCashier(java.lang.String cashier) {
        this.cashier = cashier;
    }


    /**
     * Gets the vipcode value for this Saleshdr.
     * 
     * @return vipcode
     */
    public java.lang.String getVipcode() {
        return vipcode;
    }


    /**
     * Sets the vipcode value for this Saleshdr.
     * 
     * @param vipcode
     */
    public void setVipcode(java.lang.String vipcode) {
        this.vipcode = vipcode;
    }


    /**
     * Gets the salesman value for this Saleshdr.
     * 
     * @return salesman
     */
    public java.lang.String getSalesman() {
        return salesman;
    }


    /**
     * Sets the salesman value for this Saleshdr.
     * 
     * @param salesman
     */
    public void setSalesman(java.lang.String salesman) {
        this.salesman = salesman;
    }


    /**
     * Gets the demographiccode value for this Saleshdr.
     * 
     * @return demographiccode
     */
    public java.lang.String getDemographiccode() {
        return demographiccode;
    }


    /**
     * Sets the demographiccode value for this Saleshdr.
     * 
     * @param demographiccode
     */
    public void setDemographiccode(java.lang.String demographiccode) {
        this.demographiccode = demographiccode;
    }


    /**
     * Gets the demographicdata value for this Saleshdr.
     * 
     * @return demographicdata
     */
    public java.lang.String getDemographicdata() {
        return demographicdata;
    }


    /**
     * Sets the demographicdata value for this Saleshdr.
     * 
     * @param demographicdata
     */
    public void setDemographicdata(java.lang.String demographicdata) {
        this.demographicdata = demographicdata;
    }


    /**
     * Gets the netqty value for this Saleshdr.
     * 
     * @return netqty
     */
    public java.math.BigDecimal getNetqty() {
        return netqty;
    }


    /**
     * Sets the netqty value for this Saleshdr.
     * 
     * @param netqty
     */
    public void setNetqty(java.math.BigDecimal netqty) {
        this.netqty = netqty;
    }


    /**
     * Gets the originalamount value for this Saleshdr.
     * 
     * @return originalamount
     */
    public java.math.BigDecimal getOriginalamount() {
        return originalamount;
    }


    /**
     * Sets the originalamount value for this Saleshdr.
     * 
     * @param originalamount
     */
    public void setOriginalamount(java.math.BigDecimal originalamount) {
        this.originalamount = originalamount;
    }


    /**
     * Gets the sellingamount value for this Saleshdr.
     * 
     * @return sellingamount
     */
    public java.math.BigDecimal getSellingamount() {
        return sellingamount;
    }


    /**
     * Sets the sellingamount value for this Saleshdr.
     * 
     * @param sellingamount
     */
    public void setSellingamount(java.math.BigDecimal sellingamount) {
        this.sellingamount = sellingamount;
    }


    /**
     * Gets the couponnumber value for this Saleshdr.
     * 
     * @return couponnumber
     */
    public java.lang.String getCouponnumber() {
        return couponnumber;
    }


    /**
     * Sets the couponnumber value for this Saleshdr.
     * 
     * @param couponnumber
     */
    public void setCouponnumber(java.lang.String couponnumber) {
        this.couponnumber = couponnumber;
    }


    /**
     * Gets the coupongroup value for this Saleshdr.
     * 
     * @return coupongroup
     */
    public java.lang.String getCoupongroup() {
        return coupongroup;
    }


    /**
     * Sets the coupongroup value for this Saleshdr.
     * 
     * @param coupongroup
     */
    public void setCoupongroup(java.lang.String coupongroup) {
        this.coupongroup = coupongroup;
    }


    /**
     * Gets the coupontype value for this Saleshdr.
     * 
     * @return coupontype
     */
    public java.lang.String getCoupontype() {
        return coupontype;
    }


    /**
     * Sets the coupontype value for this Saleshdr.
     * 
     * @param coupontype
     */
    public void setCoupontype(java.lang.String coupontype) {
        this.coupontype = coupontype;
    }


    /**
     * Gets the couponqty value for this Saleshdr.
     * 
     * @return couponqty
     */
    public short getCouponqty() {
        return couponqty;
    }


    /**
     * Sets the couponqty value for this Saleshdr.
     * 
     * @param couponqty
     */
    public void setCouponqty(short couponqty) {
        this.couponqty = couponqty;
    }


    /**
     * Gets the totaldiscount value for this Saleshdr.
     * 
     * @return totaldiscount
     */
    public Salesdiscount[] getTotaldiscount() {
        return totaldiscount;
    }


    /**
     * Sets the totaldiscount value for this Saleshdr.
     * 
     * @param totaldiscount
     */
    public void setTotaldiscount(Salesdiscount[] totaldiscount) {
        this.totaldiscount = totaldiscount;
    }


    /**
     * Gets the ttltaxamount1 value for this Saleshdr.
     * 
     * @return ttltaxamount1
     */
    public java.math.BigDecimal getTtltaxamount1() {
        return ttltaxamount1;
    }


    /**
     * Sets the ttltaxamount1 value for this Saleshdr.
     * 
     * @param ttltaxamount1
     */
    public void setTtltaxamount1(java.math.BigDecimal ttltaxamount1) {
        this.ttltaxamount1 = ttltaxamount1;
    }


    /**
     * Gets the ttltaxamount2 value for this Saleshdr.
     * 
     * @return ttltaxamount2
     */
    public java.math.BigDecimal getTtltaxamount2() {
        return ttltaxamount2;
    }


    /**
     * Sets the ttltaxamount2 value for this Saleshdr.
     * 
     * @param ttltaxamount2
     */
    public void setTtltaxamount2(java.math.BigDecimal ttltaxamount2) {
        this.ttltaxamount2 = ttltaxamount2;
    }


    /**
     * Gets the netamount value for this Saleshdr.
     * 
     * @return netamount
     */
    public java.math.BigDecimal getNetamount() {
        return netamount;
    }


    /**
     * Sets the netamount value for this Saleshdr.
     * 
     * @param netamount
     */
    public void setNetamount(java.math.BigDecimal netamount) {
        this.netamount = netamount;
    }


    /**
     * Gets the paidamount value for this Saleshdr.
     * 
     * @return paidamount
     */
    public java.math.BigDecimal getPaidamount() {
        return paidamount;
    }


    /**
     * Sets the paidamount value for this Saleshdr.
     * 
     * @param paidamount
     */
    public void setPaidamount(java.math.BigDecimal paidamount) {
        this.paidamount = paidamount;
    }


    /**
     * Gets the changeamount value for this Saleshdr.
     * 
     * @return changeamount
     */
    public java.math.BigDecimal getChangeamount() {
        return changeamount;
    }


    /**
     * Sets the changeamount value for this Saleshdr.
     * 
     * @param changeamount
     */
    public void setChangeamount(java.math.BigDecimal changeamount) {
        this.changeamount = changeamount;
    }


    /**
     * Gets the priceincludetax value for this Saleshdr.
     * 
     * @return priceincludetax
     */
    public java.lang.String getPriceincludetax() {
        return priceincludetax;
    }


    /**
     * Sets the priceincludetax value for this Saleshdr.
     * 
     * @param priceincludetax
     */
    public void setPriceincludetax(java.lang.String priceincludetax) {
        this.priceincludetax = priceincludetax;
    }


    /**
     * Gets the shoptaxgroup value for this Saleshdr.
     * 
     * @return shoptaxgroup
     */
    public java.lang.String getShoptaxgroup() {
        return shoptaxgroup;
    }


    /**
     * Sets the shoptaxgroup value for this Saleshdr.
     * 
     * @param shoptaxgroup
     */
    public void setShoptaxgroup(java.lang.String shoptaxgroup) {
        this.shoptaxgroup = shoptaxgroup;
    }


    /**
     * Gets the extendparam value for this Saleshdr.
     * 
     * @return extendparam
     */
    public java.lang.String getExtendparam() {
        return extendparam;
    }


    /**
     * Sets the extendparam value for this Saleshdr.
     * 
     * @param extendparam
     */
    public void setExtendparam(java.lang.String extendparam) {
        this.extendparam = extendparam;
    }


    /**
     * Gets the invoicetitle value for this Saleshdr.
     * 
     * @return invoicetitle
     */
    public java.lang.String getInvoicetitle() {
        return invoicetitle;
    }


    /**
     * Sets the invoicetitle value for this Saleshdr.
     * 
     * @param invoicetitle
     */
    public void setInvoicetitle(java.lang.String invoicetitle) {
        this.invoicetitle = invoicetitle;
    }


    /**
     * Gets the invoicecontent value for this Saleshdr.
     * 
     * @return invoicecontent
     */
    public java.lang.String getInvoicecontent() {
        return invoicecontent;
    }


    /**
     * Sets the invoicecontent value for this Saleshdr.
     * 
     * @param invoicecontent
     */
    public void setInvoicecontent(java.lang.String invoicecontent) {
        this.invoicecontent = invoicecontent;
    }


    /**
     * Gets the issueby value for this Saleshdr.
     * 
     * @return issueby
     */
    public java.lang.String getIssueby() {
        return issueby;
    }


    /**
     * Sets the issueby value for this Saleshdr.
     * 
     * @param issueby
     */
    public void setIssueby(java.lang.String issueby) {
        this.issueby = issueby;
    }


    /**
     * Gets the issuedate_yyyymmdd value for this Saleshdr.
     * 
     * @return issuedate_yyyymmdd
     */
    public java.lang.String getIssuedate_yyyymmdd() {
        return issuedate_yyyymmdd;
    }


    /**
     * Sets the issuedate_yyyymmdd value for this Saleshdr.
     * 
     * @param issuedate_yyyymmdd
     */
    public void setIssuedate_yyyymmdd(java.lang.String issuedate_yyyymmdd) {
        this.issuedate_yyyymmdd = issuedate_yyyymmdd;
    }


    /**
     * Gets the issuetime_hhmmss value for this Saleshdr.
     * 
     * @return issuetime_hhmmss
     */
    public java.lang.String getIssuetime_hhmmss() {
        return issuetime_hhmmss;
    }


    /**
     * Sets the issuetime_hhmmss value for this Saleshdr.
     * 
     * @param issuetime_hhmmss
     */
    public void setIssuetime_hhmmss(java.lang.String issuetime_hhmmss) {
        this.issuetime_hhmmss = issuetime_hhmmss;
    }


    /**
     * Gets the ecorderno value for this Saleshdr.
     * 
     * @return ecorderno
     */
    public java.lang.String getEcorderno() {
        return ecorderno;
    }


    /**
     * Sets the ecorderno value for this Saleshdr.
     * 
     * @param ecorderno
     */
    public void setEcorderno(java.lang.String ecorderno) {
        this.ecorderno = ecorderno;
    }


    /**
     * Gets the buyerremark value for this Saleshdr.
     * 
     * @return buyerremark
     */
    public java.lang.String getBuyerremark() {
        return buyerremark;
    }


    /**
     * Sets the buyerremark value for this Saleshdr.
     * 
     * @param buyerremark
     */
    public void setBuyerremark(java.lang.String buyerremark) {
        this.buyerremark = buyerremark;
    }


    /**
     * Gets the orderremark value for this Saleshdr.
     * 
     * @return orderremark
     */
    public java.lang.String getOrderremark() {
        return orderremark;
    }


    /**
     * Sets the orderremark value for this Saleshdr.
     * 
     * @param orderremark
     */
    public void setOrderremark(java.lang.String orderremark) {
        this.orderremark = orderremark;
    }


    /**
     * Gets the status value for this Saleshdr.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Saleshdr.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the ttpossalesdocno value for this Saleshdr.
     * 
     * @return ttpossalesdocno
     */
    public java.lang.String getTtpossalesdocno() {
        return ttpossalesdocno;
    }


    /**
     * Sets the ttpossalesdocno value for this Saleshdr.
     * 
     * @param ttpossalesdocno
     */
    public void setTtpossalesdocno(java.lang.String ttpossalesdocno) {
        this.ttpossalesdocno = ttpossalesdocno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Saleshdr)) return false;
        Saleshdr other = (Saleshdr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.localstorecode==null && other.getLocalstorecode()==null) || 
             (this.localstorecode!=null &&
              this.localstorecode.equals(other.getLocalstorecode()))) &&
            ((this.reservedocno==null && other.getReservedocno()==null) || 
             (this.reservedocno!=null &&
              this.reservedocno.equals(other.getReservedocno()))) &&
            ((this.txdate_yyyymmdd==null && other.getTxdate_yyyymmdd()==null) || 
             (this.txdate_yyyymmdd!=null &&
              this.txdate_yyyymmdd.equals(other.getTxdate_yyyymmdd()))) &&
            ((this.txtime_hhmmss==null && other.getTxtime_hhmmss()==null) || 
             (this.txtime_hhmmss!=null &&
              this.txtime_hhmmss.equals(other.getTxtime_hhmmss()))) &&
            ((this.mallid==null && other.getMallid()==null) || 
             (this.mallid!=null &&
              this.mallid.equals(other.getMallid()))) &&
            ((this.storecode==null && other.getStorecode()==null) || 
             (this.storecode!=null &&
              this.storecode.equals(other.getStorecode()))) &&
            ((this.tillid==null && other.getTillid()==null) || 
             (this.tillid!=null &&
              this.tillid.equals(other.getTillid()))) &&
            ((this.salestype==null && other.getSalestype()==null) || 
             (this.salestype!=null &&
              this.salestype.equals(other.getSalestype()))) &&
            ((this.txdocno==null && other.getTxdocno()==null) || 
             (this.txdocno!=null &&
              this.txdocno.equals(other.getTxdocno()))) &&
            ((this.orgtxdate_yyyymmdd==null && other.getOrgtxdate_yyyymmdd()==null) || 
             (this.orgtxdate_yyyymmdd!=null &&
              this.orgtxdate_yyyymmdd.equals(other.getOrgtxdate_yyyymmdd()))) &&
            ((this.orgstorecode==null && other.getOrgstorecode()==null) || 
             (this.orgstorecode!=null &&
              this.orgstorecode.equals(other.getOrgstorecode()))) &&
            ((this.orgtillid==null && other.getOrgtillid()==null) || 
             (this.orgtillid!=null &&
              this.orgtillid.equals(other.getOrgtillid()))) &&
            ((this.orgtxdocno==null && other.getOrgtxdocno()==null) || 
             (this.orgtxdocno!=null &&
              this.orgtxdocno.equals(other.getOrgtxdocno()))) &&
            ((this.mallitemcode==null && other.getMallitemcode()==null) || 
             (this.mallitemcode!=null &&
              this.mallitemcode.equals(other.getMallitemcode()))) &&
            ((this.cashier==null && other.getCashier()==null) || 
             (this.cashier!=null &&
              this.cashier.equals(other.getCashier()))) &&
            ((this.vipcode==null && other.getVipcode()==null) || 
             (this.vipcode!=null &&
              this.vipcode.equals(other.getVipcode()))) &&
            ((this.salesman==null && other.getSalesman()==null) || 
             (this.salesman!=null &&
              this.salesman.equals(other.getSalesman()))) &&
            ((this.demographiccode==null && other.getDemographiccode()==null) || 
             (this.demographiccode!=null &&
              this.demographiccode.equals(other.getDemographiccode()))) &&
            ((this.demographicdata==null && other.getDemographicdata()==null) || 
             (this.demographicdata!=null &&
              this.demographicdata.equals(other.getDemographicdata()))) &&
            ((this.netqty==null && other.getNetqty()==null) || 
             (this.netqty!=null &&
              this.netqty.equals(other.getNetqty()))) &&
            ((this.originalamount==null && other.getOriginalamount()==null) || 
             (this.originalamount!=null &&
              this.originalamount.equals(other.getOriginalamount()))) &&
            ((this.sellingamount==null && other.getSellingamount()==null) || 
             (this.sellingamount!=null &&
              this.sellingamount.equals(other.getSellingamount()))) &&
            ((this.couponnumber==null && other.getCouponnumber()==null) || 
             (this.couponnumber!=null &&
              this.couponnumber.equals(other.getCouponnumber()))) &&
            ((this.coupongroup==null && other.getCoupongroup()==null) || 
             (this.coupongroup!=null &&
              this.coupongroup.equals(other.getCoupongroup()))) &&
            ((this.coupontype==null && other.getCoupontype()==null) || 
             (this.coupontype!=null &&
              this.coupontype.equals(other.getCoupontype()))) &&
            this.couponqty == other.getCouponqty() &&
            ((this.totaldiscount==null && other.getTotaldiscount()==null) || 
             (this.totaldiscount!=null &&
              java.util.Arrays.equals(this.totaldiscount, other.getTotaldiscount()))) &&
            ((this.ttltaxamount1==null && other.getTtltaxamount1()==null) || 
             (this.ttltaxamount1!=null &&
              this.ttltaxamount1.equals(other.getTtltaxamount1()))) &&
            ((this.ttltaxamount2==null && other.getTtltaxamount2()==null) || 
             (this.ttltaxamount2!=null &&
              this.ttltaxamount2.equals(other.getTtltaxamount2()))) &&
            ((this.netamount==null && other.getNetamount()==null) || 
             (this.netamount!=null &&
              this.netamount.equals(other.getNetamount()))) &&
            ((this.paidamount==null && other.getPaidamount()==null) || 
             (this.paidamount!=null &&
              this.paidamount.equals(other.getPaidamount()))) &&
            ((this.changeamount==null && other.getChangeamount()==null) || 
             (this.changeamount!=null &&
              this.changeamount.equals(other.getChangeamount()))) &&
            ((this.priceincludetax==null && other.getPriceincludetax()==null) || 
             (this.priceincludetax!=null &&
              this.priceincludetax.equals(other.getPriceincludetax()))) &&
            ((this.shoptaxgroup==null && other.getShoptaxgroup()==null) || 
             (this.shoptaxgroup!=null &&
              this.shoptaxgroup.equals(other.getShoptaxgroup()))) &&
            ((this.extendparam==null && other.getExtendparam()==null) || 
             (this.extendparam!=null &&
              this.extendparam.equals(other.getExtendparam()))) &&
            ((this.invoicetitle==null && other.getInvoicetitle()==null) || 
             (this.invoicetitle!=null &&
              this.invoicetitle.equals(other.getInvoicetitle()))) &&
            ((this.invoicecontent==null && other.getInvoicecontent()==null) || 
             (this.invoicecontent!=null &&
              this.invoicecontent.equals(other.getInvoicecontent()))) &&
            ((this.issueby==null && other.getIssueby()==null) || 
             (this.issueby!=null &&
              this.issueby.equals(other.getIssueby()))) &&
            ((this.issuedate_yyyymmdd==null && other.getIssuedate_yyyymmdd()==null) || 
             (this.issuedate_yyyymmdd!=null &&
              this.issuedate_yyyymmdd.equals(other.getIssuedate_yyyymmdd()))) &&
            ((this.issuetime_hhmmss==null && other.getIssuetime_hhmmss()==null) || 
             (this.issuetime_hhmmss!=null &&
              this.issuetime_hhmmss.equals(other.getIssuetime_hhmmss()))) &&
            ((this.ecorderno==null && other.getEcorderno()==null) || 
             (this.ecorderno!=null &&
              this.ecorderno.equals(other.getEcorderno()))) &&
            ((this.buyerremark==null && other.getBuyerremark()==null) || 
             (this.buyerremark!=null &&
              this.buyerremark.equals(other.getBuyerremark()))) &&
            ((this.orderremark==null && other.getOrderremark()==null) || 
             (this.orderremark!=null &&
              this.orderremark.equals(other.getOrderremark()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.ttpossalesdocno==null && other.getTtpossalesdocno()==null) || 
             (this.ttpossalesdocno!=null &&
              this.ttpossalesdocno.equals(other.getTtpossalesdocno())));
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
        if (getLocalstorecode() != null) {
            _hashCode += getLocalstorecode().hashCode();
        }
        if (getReservedocno() != null) {
            _hashCode += getReservedocno().hashCode();
        }
        if (getTxdate_yyyymmdd() != null) {
            _hashCode += getTxdate_yyyymmdd().hashCode();
        }
        if (getTxtime_hhmmss() != null) {
            _hashCode += getTxtime_hhmmss().hashCode();
        }
        if (getMallid() != null) {
            _hashCode += getMallid().hashCode();
        }
        if (getStorecode() != null) {
            _hashCode += getStorecode().hashCode();
        }
        if (getTillid() != null) {
            _hashCode += getTillid().hashCode();
        }
        if (getSalestype() != null) {
            _hashCode += getSalestype().hashCode();
        }
        if (getTxdocno() != null) {
            _hashCode += getTxdocno().hashCode();
        }
        if (getOrgtxdate_yyyymmdd() != null) {
            _hashCode += getOrgtxdate_yyyymmdd().hashCode();
        }
        if (getOrgstorecode() != null) {
            _hashCode += getOrgstorecode().hashCode();
        }
        if (getOrgtillid() != null) {
            _hashCode += getOrgtillid().hashCode();
        }
        if (getOrgtxdocno() != null) {
            _hashCode += getOrgtxdocno().hashCode();
        }
        if (getMallitemcode() != null) {
            _hashCode += getMallitemcode().hashCode();
        }
        if (getCashier() != null) {
            _hashCode += getCashier().hashCode();
        }
        if (getVipcode() != null) {
            _hashCode += getVipcode().hashCode();
        }
        if (getSalesman() != null) {
            _hashCode += getSalesman().hashCode();
        }
        if (getDemographiccode() != null) {
            _hashCode += getDemographiccode().hashCode();
        }
        if (getDemographicdata() != null) {
            _hashCode += getDemographicdata().hashCode();
        }
        if (getNetqty() != null) {
            _hashCode += getNetqty().hashCode();
        }
        if (getOriginalamount() != null) {
            _hashCode += getOriginalamount().hashCode();
        }
        if (getSellingamount() != null) {
            _hashCode += getSellingamount().hashCode();
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
        _hashCode += getCouponqty();
        if (getTotaldiscount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotaldiscount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotaldiscount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTtltaxamount1() != null) {
            _hashCode += getTtltaxamount1().hashCode();
        }
        if (getTtltaxamount2() != null) {
            _hashCode += getTtltaxamount2().hashCode();
        }
        if (getNetamount() != null) {
            _hashCode += getNetamount().hashCode();
        }
        if (getPaidamount() != null) {
            _hashCode += getPaidamount().hashCode();
        }
        if (getChangeamount() != null) {
            _hashCode += getChangeamount().hashCode();
        }
        if (getPriceincludetax() != null) {
            _hashCode += getPriceincludetax().hashCode();
        }
        if (getShoptaxgroup() != null) {
            _hashCode += getShoptaxgroup().hashCode();
        }
        if (getExtendparam() != null) {
            _hashCode += getExtendparam().hashCode();
        }
        if (getInvoicetitle() != null) {
            _hashCode += getInvoicetitle().hashCode();
        }
        if (getInvoicecontent() != null) {
            _hashCode += getInvoicecontent().hashCode();
        }
        if (getIssueby() != null) {
            _hashCode += getIssueby().hashCode();
        }
        if (getIssuedate_yyyymmdd() != null) {
            _hashCode += getIssuedate_yyyymmdd().hashCode();
        }
        if (getIssuetime_hhmmss() != null) {
            _hashCode += getIssuetime_hhmmss().hashCode();
        }
        if (getEcorderno() != null) {
            _hashCode += getEcorderno().hashCode();
        }
        if (getBuyerremark() != null) {
            _hashCode += getBuyerremark().hashCode();
        }
        if (getOrderremark() != null) {
            _hashCode += getOrderremark().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTtpossalesdocno() != null) {
            _hashCode += getTtpossalesdocno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Saleshdr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "saleshdr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localstorecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "localstorecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedocno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "reservedocno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txdate_yyyymmdd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "txdate_yyyymmdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txtime_hhmmss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "txtime_hhmmss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mallid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "mallid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("tillid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "tillid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salestype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "salestype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txdocno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "txdocno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgtxdate_yyyymmdd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "orgtxdate_yyyymmdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgstorecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "orgstorecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgtillid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "orgtillid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgtxdocno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "orgtxdocno"));
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
        elemField.setFieldName("cashier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "cashier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "vipcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesman");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "salesman"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demographiccode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "demographiccode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demographicdata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "demographicdata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netqty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "netqty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "originalamount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellingamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "sellingamount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("couponqty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "couponqty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaldiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "totaldiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "salesdiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempurl.org", "salesdiscount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttltaxamount1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "ttltaxamount1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttltaxamount2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "ttltaxamount2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "netamount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "paidamount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "changeamount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceincludetax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "priceincludetax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoptaxgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "shoptaxgroup"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoicetitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "invoicetitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoicecontent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "invoicecontent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueby");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "issueby"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuedate_yyyymmdd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "issuedate_yyyymmdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuetime_hhmmss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "issuetime_hhmmss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecorderno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "ecorderno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerremark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "buyerremark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderremark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "orderremark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttpossalesdocno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "ttpossalesdocno"));
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
