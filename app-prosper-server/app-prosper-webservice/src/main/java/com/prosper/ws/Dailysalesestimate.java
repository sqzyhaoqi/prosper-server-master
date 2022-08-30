/**
 * Dailysalesestimate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class Dailysalesestimate  implements java.io.Serializable {
    private java.lang.String localstorecode;

    private java.lang.String txdate_yyyymmdd;

    private java.lang.String txtime_hhmmss;

    private java.lang.String mallid;

    private java.lang.String storecode;

    private java.lang.String tillid;

    private java.lang.String txdocno;

    private java.math.BigDecimal estsalesqty;

    private java.math.BigDecimal estsalesamt;

    private int estdoccount;

    private java.lang.String cashier;

    private java.lang.String issuedate_yyyymmdd;

    private java.lang.String remarks;

    public Dailysalesestimate() {
    }

    public Dailysalesestimate(
           java.lang.String localstorecode,
           java.lang.String txdate_yyyymmdd,
           java.lang.String txtime_hhmmss,
           java.lang.String mallid,
           java.lang.String storecode,
           java.lang.String tillid,
           java.lang.String txdocno,
           java.math.BigDecimal estsalesqty,
           java.math.BigDecimal estsalesamt,
           int estdoccount,
           java.lang.String cashier,
           java.lang.String issuedate_yyyymmdd,
           java.lang.String remarks) {
           this.localstorecode = localstorecode;
           this.txdate_yyyymmdd = txdate_yyyymmdd;
           this.txtime_hhmmss = txtime_hhmmss;
           this.mallid = mallid;
           this.storecode = storecode;
           this.tillid = tillid;
           this.txdocno = txdocno;
           this.estsalesqty = estsalesqty;
           this.estsalesamt = estsalesamt;
           this.estdoccount = estdoccount;
           this.cashier = cashier;
           this.issuedate_yyyymmdd = issuedate_yyyymmdd;
           this.remarks = remarks;
    }


    /**
     * Gets the localstorecode value for this Dailysalesestimate.
     * 
     * @return localstorecode
     */
    public java.lang.String getLocalstorecode() {
        return localstorecode;
    }


    /**
     * Sets the localstorecode value for this Dailysalesestimate.
     * 
     * @param localstorecode
     */
    public void setLocalstorecode(java.lang.String localstorecode) {
        this.localstorecode = localstorecode;
    }


    /**
     * Gets the txdate_yyyymmdd value for this Dailysalesestimate.
     * 
     * @return txdate_yyyymmdd
     */
    public java.lang.String getTxdate_yyyymmdd() {
        return txdate_yyyymmdd;
    }


    /**
     * Sets the txdate_yyyymmdd value for this Dailysalesestimate.
     * 
     * @param txdate_yyyymmdd
     */
    public void setTxdate_yyyymmdd(java.lang.String txdate_yyyymmdd) {
        this.txdate_yyyymmdd = txdate_yyyymmdd;
    }


    /**
     * Gets the txtime_hhmmss value for this Dailysalesestimate.
     * 
     * @return txtime_hhmmss
     */
    public java.lang.String getTxtime_hhmmss() {
        return txtime_hhmmss;
    }


    /**
     * Sets the txtime_hhmmss value for this Dailysalesestimate.
     * 
     * @param txtime_hhmmss
     */
    public void setTxtime_hhmmss(java.lang.String txtime_hhmmss) {
        this.txtime_hhmmss = txtime_hhmmss;
    }


    /**
     * Gets the mallid value for this Dailysalesestimate.
     * 
     * @return mallid
     */
    public java.lang.String getMallid() {
        return mallid;
    }


    /**
     * Sets the mallid value for this Dailysalesestimate.
     * 
     * @param mallid
     */
    public void setMallid(java.lang.String mallid) {
        this.mallid = mallid;
    }


    /**
     * Gets the storecode value for this Dailysalesestimate.
     * 
     * @return storecode
     */
    public java.lang.String getStorecode() {
        return storecode;
    }


    /**
     * Sets the storecode value for this Dailysalesestimate.
     * 
     * @param storecode
     */
    public void setStorecode(java.lang.String storecode) {
        this.storecode = storecode;
    }


    /**
     * Gets the tillid value for this Dailysalesestimate.
     * 
     * @return tillid
     */
    public java.lang.String getTillid() {
        return tillid;
    }


    /**
     * Sets the tillid value for this Dailysalesestimate.
     * 
     * @param tillid
     */
    public void setTillid(java.lang.String tillid) {
        this.tillid = tillid;
    }


    /**
     * Gets the txdocno value for this Dailysalesestimate.
     * 
     * @return txdocno
     */
    public java.lang.String getTxdocno() {
        return txdocno;
    }


    /**
     * Sets the txdocno value for this Dailysalesestimate.
     * 
     * @param txdocno
     */
    public void setTxdocno(java.lang.String txdocno) {
        this.txdocno = txdocno;
    }


    /**
     * Gets the estsalesqty value for this Dailysalesestimate.
     * 
     * @return estsalesqty
     */
    public java.math.BigDecimal getEstsalesqty() {
        return estsalesqty;
    }


    /**
     * Sets the estsalesqty value for this Dailysalesestimate.
     * 
     * @param estsalesqty
     */
    public void setEstsalesqty(java.math.BigDecimal estsalesqty) {
        this.estsalesqty = estsalesqty;
    }


    /**
     * Gets the estsalesamt value for this Dailysalesestimate.
     * 
     * @return estsalesamt
     */
    public java.math.BigDecimal getEstsalesamt() {
        return estsalesamt;
    }


    /**
     * Sets the estsalesamt value for this Dailysalesestimate.
     * 
     * @param estsalesamt
     */
    public void setEstsalesamt(java.math.BigDecimal estsalesamt) {
        this.estsalesamt = estsalesamt;
    }


    /**
     * Gets the estdoccount value for this Dailysalesestimate.
     * 
     * @return estdoccount
     */
    public int getEstdoccount() {
        return estdoccount;
    }


    /**
     * Sets the estdoccount value for this Dailysalesestimate.
     * 
     * @param estdoccount
     */
    public void setEstdoccount(int estdoccount) {
        this.estdoccount = estdoccount;
    }


    /**
     * Gets the cashier value for this Dailysalesestimate.
     * 
     * @return cashier
     */
    public java.lang.String getCashier() {
        return cashier;
    }


    /**
     * Sets the cashier value for this Dailysalesestimate.
     * 
     * @param cashier
     */
    public void setCashier(java.lang.String cashier) {
        this.cashier = cashier;
    }


    /**
     * Gets the issuedate_yyyymmdd value for this Dailysalesestimate.
     * 
     * @return issuedate_yyyymmdd
     */
    public java.lang.String getIssuedate_yyyymmdd() {
        return issuedate_yyyymmdd;
    }


    /**
     * Sets the issuedate_yyyymmdd value for this Dailysalesestimate.
     * 
     * @param issuedate_yyyymmdd
     */
    public void setIssuedate_yyyymmdd(java.lang.String issuedate_yyyymmdd) {
        this.issuedate_yyyymmdd = issuedate_yyyymmdd;
    }


    /**
     * Gets the remarks value for this Dailysalesestimate.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this Dailysalesestimate.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dailysalesestimate)) return false;
        Dailysalesestimate other = (Dailysalesestimate) obj;
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
            ((this.txdocno==null && other.getTxdocno()==null) || 
             (this.txdocno!=null &&
              this.txdocno.equals(other.getTxdocno()))) &&
            ((this.estsalesqty==null && other.getEstsalesqty()==null) || 
             (this.estsalesqty!=null &&
              this.estsalesqty.equals(other.getEstsalesqty()))) &&
            ((this.estsalesamt==null && other.getEstsalesamt()==null) || 
             (this.estsalesamt!=null &&
              this.estsalesamt.equals(other.getEstsalesamt()))) &&
            this.estdoccount == other.getEstdoccount() &&
            ((this.cashier==null && other.getCashier()==null) || 
             (this.cashier!=null &&
              this.cashier.equals(other.getCashier()))) &&
            ((this.issuedate_yyyymmdd==null && other.getIssuedate_yyyymmdd()==null) || 
             (this.issuedate_yyyymmdd!=null &&
              this.issuedate_yyyymmdd.equals(other.getIssuedate_yyyymmdd()))) &&
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
        if (getLocalstorecode() != null) {
            _hashCode += getLocalstorecode().hashCode();
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
        if (getTxdocno() != null) {
            _hashCode += getTxdocno().hashCode();
        }
        if (getEstsalesqty() != null) {
            _hashCode += getEstsalesqty().hashCode();
        }
        if (getEstsalesamt() != null) {
            _hashCode += getEstsalesamt().hashCode();
        }
        _hashCode += getEstdoccount();
        if (getCashier() != null) {
            _hashCode += getCashier().hashCode();
        }
        if (getIssuedate_yyyymmdd() != null) {
            _hashCode += getIssuedate_yyyymmdd().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dailysalesestimate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "dailysalesestimate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localstorecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "localstorecode"));
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
        elemField.setFieldName("txdocno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "txdocno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estsalesqty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "estsalesqty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estsalesamt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "estsalesamt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estdoccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "estdoccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("issuedate_yyyymmdd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "issuedate_yyyymmdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
