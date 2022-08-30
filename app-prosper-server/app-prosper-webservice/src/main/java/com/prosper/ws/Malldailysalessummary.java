/**
 * Malldailysalessummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class Malldailysalessummary  implements java.io.Serializable {
    private java.lang.String mallstorecode;

    private java.lang.String mallid;

    private java.lang.String txdate_yyyymmdd;

    private java.lang.String txtime_hhmmss;

    private java.math.BigDecimal ttlsalesqty;

    private java.math.BigDecimal ttlsalesamt;

    private int ttldoccount;

    private int salesstorecount;

    private int missuploadcount;

    private int storemodifycount;

    private java.lang.String remarks;

    public Malldailysalessummary() {
    }

    public Malldailysalessummary(
           java.lang.String mallstorecode,
           java.lang.String mallid,
           java.lang.String txdate_yyyymmdd,
           java.lang.String txtime_hhmmss,
           java.math.BigDecimal ttlsalesqty,
           java.math.BigDecimal ttlsalesamt,
           int ttldoccount,
           int salesstorecount,
           int missuploadcount,
           int storemodifycount,
           java.lang.String remarks) {
           this.mallstorecode = mallstorecode;
           this.mallid = mallid;
           this.txdate_yyyymmdd = txdate_yyyymmdd;
           this.txtime_hhmmss = txtime_hhmmss;
           this.ttlsalesqty = ttlsalesqty;
           this.ttlsalesamt = ttlsalesamt;
           this.ttldoccount = ttldoccount;
           this.salesstorecount = salesstorecount;
           this.missuploadcount = missuploadcount;
           this.storemodifycount = storemodifycount;
           this.remarks = remarks;
    }


    /**
     * Gets the mallstorecode value for this Malldailysalessummary.
     * 
     * @return mallstorecode
     */
    public java.lang.String getMallstorecode() {
        return mallstorecode;
    }


    /**
     * Sets the mallstorecode value for this Malldailysalessummary.
     * 
     * @param mallstorecode
     */
    public void setMallstorecode(java.lang.String mallstorecode) {
        this.mallstorecode = mallstorecode;
    }


    /**
     * Gets the mallid value for this Malldailysalessummary.
     * 
     * @return mallid
     */
    public java.lang.String getMallid() {
        return mallid;
    }


    /**
     * Sets the mallid value for this Malldailysalessummary.
     * 
     * @param mallid
     */
    public void setMallid(java.lang.String mallid) {
        this.mallid = mallid;
    }


    /**
     * Gets the txdate_yyyymmdd value for this Malldailysalessummary.
     * 
     * @return txdate_yyyymmdd
     */
    public java.lang.String getTxdate_yyyymmdd() {
        return txdate_yyyymmdd;
    }


    /**
     * Sets the txdate_yyyymmdd value for this Malldailysalessummary.
     * 
     * @param txdate_yyyymmdd
     */
    public void setTxdate_yyyymmdd(java.lang.String txdate_yyyymmdd) {
        this.txdate_yyyymmdd = txdate_yyyymmdd;
    }


    /**
     * Gets the txtime_hhmmss value for this Malldailysalessummary.
     * 
     * @return txtime_hhmmss
     */
    public java.lang.String getTxtime_hhmmss() {
        return txtime_hhmmss;
    }


    /**
     * Sets the txtime_hhmmss value for this Malldailysalessummary.
     * 
     * @param txtime_hhmmss
     */
    public void setTxtime_hhmmss(java.lang.String txtime_hhmmss) {
        this.txtime_hhmmss = txtime_hhmmss;
    }


    /**
     * Gets the ttlsalesqty value for this Malldailysalessummary.
     * 
     * @return ttlsalesqty
     */
    public java.math.BigDecimal getTtlsalesqty() {
        return ttlsalesqty;
    }


    /**
     * Sets the ttlsalesqty value for this Malldailysalessummary.
     * 
     * @param ttlsalesqty
     */
    public void setTtlsalesqty(java.math.BigDecimal ttlsalesqty) {
        this.ttlsalesqty = ttlsalesqty;
    }


    /**
     * Gets the ttlsalesamt value for this Malldailysalessummary.
     * 
     * @return ttlsalesamt
     */
    public java.math.BigDecimal getTtlsalesamt() {
        return ttlsalesamt;
    }


    /**
     * Sets the ttlsalesamt value for this Malldailysalessummary.
     * 
     * @param ttlsalesamt
     */
    public void setTtlsalesamt(java.math.BigDecimal ttlsalesamt) {
        this.ttlsalesamt = ttlsalesamt;
    }


    /**
     * Gets the ttldoccount value for this Malldailysalessummary.
     * 
     * @return ttldoccount
     */
    public int getTtldoccount() {
        return ttldoccount;
    }


    /**
     * Sets the ttldoccount value for this Malldailysalessummary.
     * 
     * @param ttldoccount
     */
    public void setTtldoccount(int ttldoccount) {
        this.ttldoccount = ttldoccount;
    }


    /**
     * Gets the salesstorecount value for this Malldailysalessummary.
     * 
     * @return salesstorecount
     */
    public int getSalesstorecount() {
        return salesstorecount;
    }


    /**
     * Sets the salesstorecount value for this Malldailysalessummary.
     * 
     * @param salesstorecount
     */
    public void setSalesstorecount(int salesstorecount) {
        this.salesstorecount = salesstorecount;
    }


    /**
     * Gets the missuploadcount value for this Malldailysalessummary.
     * 
     * @return missuploadcount
     */
    public int getMissuploadcount() {
        return missuploadcount;
    }


    /**
     * Sets the missuploadcount value for this Malldailysalessummary.
     * 
     * @param missuploadcount
     */
    public void setMissuploadcount(int missuploadcount) {
        this.missuploadcount = missuploadcount;
    }


    /**
     * Gets the storemodifycount value for this Malldailysalessummary.
     * 
     * @return storemodifycount
     */
    public int getStoremodifycount() {
        return storemodifycount;
    }


    /**
     * Sets the storemodifycount value for this Malldailysalessummary.
     * 
     * @param storemodifycount
     */
    public void setStoremodifycount(int storemodifycount) {
        this.storemodifycount = storemodifycount;
    }


    /**
     * Gets the remarks value for this Malldailysalessummary.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this Malldailysalessummary.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Malldailysalessummary)) return false;
        Malldailysalessummary other = (Malldailysalessummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mallstorecode==null && other.getMallstorecode()==null) || 
             (this.mallstorecode!=null &&
              this.mallstorecode.equals(other.getMallstorecode()))) &&
            ((this.mallid==null && other.getMallid()==null) || 
             (this.mallid!=null &&
              this.mallid.equals(other.getMallid()))) &&
            ((this.txdate_yyyymmdd==null && other.getTxdate_yyyymmdd()==null) || 
             (this.txdate_yyyymmdd!=null &&
              this.txdate_yyyymmdd.equals(other.getTxdate_yyyymmdd()))) &&
            ((this.txtime_hhmmss==null && other.getTxtime_hhmmss()==null) || 
             (this.txtime_hhmmss!=null &&
              this.txtime_hhmmss.equals(other.getTxtime_hhmmss()))) &&
            ((this.ttlsalesqty==null && other.getTtlsalesqty()==null) || 
             (this.ttlsalesqty!=null &&
              this.ttlsalesqty.equals(other.getTtlsalesqty()))) &&
            ((this.ttlsalesamt==null && other.getTtlsalesamt()==null) || 
             (this.ttlsalesamt!=null &&
              this.ttlsalesamt.equals(other.getTtlsalesamt()))) &&
            this.ttldoccount == other.getTtldoccount() &&
            this.salesstorecount == other.getSalesstorecount() &&
            this.missuploadcount == other.getMissuploadcount() &&
            this.storemodifycount == other.getStoremodifycount() &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks())));
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
        if (getMallstorecode() != null) {
            _hashCode += getMallstorecode().hashCode();
        }
        if (getMallid() != null) {
            _hashCode += getMallid().hashCode();
        }
        if (getTxdate_yyyymmdd() != null) {
            _hashCode += getTxdate_yyyymmdd().hashCode();
        }
        if (getTxtime_hhmmss() != null) {
            _hashCode += getTxtime_hhmmss().hashCode();
        }
        if (getTtlsalesqty() != null) {
            _hashCode += getTtlsalesqty().hashCode();
        }
        if (getTtlsalesamt() != null) {
            _hashCode += getTtlsalesamt().hashCode();
        }
        _hashCode += getTtldoccount();
        _hashCode += getSalesstorecount();
        _hashCode += getMissuploadcount();
        _hashCode += getStoremodifycount();
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Malldailysalessummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "malldailysalessummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mallstorecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "mallstorecode"));
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
        elemField.setFieldName("ttlsalesqty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "ttlsalesqty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttlsalesamt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "ttlsalesamt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttldoccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "ttldoccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesstorecount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "salesstorecount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missuploadcount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "missuploadcount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storemodifycount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "storemodifycount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "remarks"));
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
