/**
 * Salestender.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class Salestender  implements java.io.Serializable {
    private int lineno;

    private java.lang.String tendercode;

    private short tendertype;

    private short tendercategory;

    private java.math.BigDecimal payamount;

    private java.math.BigDecimal baseamount;

    private java.math.BigDecimal excessamount;

    private java.lang.String extendparam;

    private java.lang.String remark;

    public Salestender() {
    }

    public Salestender(
           int lineno,
           java.lang.String tendercode,
           short tendertype,
           short tendercategory,
           java.math.BigDecimal payamount,
           java.math.BigDecimal baseamount,
           java.math.BigDecimal excessamount,
           java.lang.String extendparam,
           java.lang.String remark) {
           this.lineno = lineno;
           this.tendercode = tendercode;
           this.tendertype = tendertype;
           this.tendercategory = tendercategory;
           this.payamount = payamount;
           this.baseamount = baseamount;
           this.excessamount = excessamount;
           this.extendparam = extendparam;
           this.remark = remark;
    }


    /**
     * Gets the lineno value for this Salestender.
     * 
     * @return lineno
     */
    public int getLineno() {
        return lineno;
    }


    /**
     * Sets the lineno value for this Salestender.
     * 
     * @param lineno
     */
    public void setLineno(int lineno) {
        this.lineno = lineno;
    }


    /**
     * Gets the tendercode value for this Salestender.
     * 
     * @return tendercode
     */
    public java.lang.String getTendercode() {
        return tendercode;
    }


    /**
     * Sets the tendercode value for this Salestender.
     * 
     * @param tendercode
     */
    public void setTendercode(java.lang.String tendercode) {
        this.tendercode = tendercode;
    }


    /**
     * Gets the tendertype value for this Salestender.
     * 
     * @return tendertype
     */
    public short getTendertype() {
        return tendertype;
    }


    /**
     * Sets the tendertype value for this Salestender.
     * 
     * @param tendertype
     */
    public void setTendertype(short tendertype) {
        this.tendertype = tendertype;
    }


    /**
     * Gets the tendercategory value for this Salestender.
     * 
     * @return tendercategory
     */
    public short getTendercategory() {
        return tendercategory;
    }


    /**
     * Sets the tendercategory value for this Salestender.
     * 
     * @param tendercategory
     */
    public void setTendercategory(short tendercategory) {
        this.tendercategory = tendercategory;
    }


    /**
     * Gets the payamount value for this Salestender.
     * 
     * @return payamount
     */
    public java.math.BigDecimal getPayamount() {
        return payamount;
    }


    /**
     * Sets the payamount value for this Salestender.
     * 
     * @param payamount
     */
    public void setPayamount(java.math.BigDecimal payamount) {
        this.payamount = payamount;
    }


    /**
     * Gets the baseamount value for this Salestender.
     * 
     * @return baseamount
     */
    public java.math.BigDecimal getBaseamount() {
        return baseamount;
    }


    /**
     * Sets the baseamount value for this Salestender.
     * 
     * @param baseamount
     */
    public void setBaseamount(java.math.BigDecimal baseamount) {
        this.baseamount = baseamount;
    }


    /**
     * Gets the excessamount value for this Salestender.
     * 
     * @return excessamount
     */
    public java.math.BigDecimal getExcessamount() {
        return excessamount;
    }


    /**
     * Sets the excessamount value for this Salestender.
     * 
     * @param excessamount
     */
    public void setExcessamount(java.math.BigDecimal excessamount) {
        this.excessamount = excessamount;
    }


    /**
     * Gets the extendparam value for this Salestender.
     * 
     * @return extendparam
     */
    public java.lang.String getExtendparam() {
        return extendparam;
    }


    /**
     * Sets the extendparam value for this Salestender.
     * 
     * @param extendparam
     */
    public void setExtendparam(java.lang.String extendparam) {
        this.extendparam = extendparam;
    }


    /**
     * Gets the remark value for this Salestender.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this Salestender.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Salestender)) return false;
        Salestender other = (Salestender) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.lineno == other.getLineno() &&
            ((this.tendercode==null && other.getTendercode()==null) || 
             (this.tendercode!=null &&
              this.tendercode.equals(other.getTendercode()))) &&
            this.tendertype == other.getTendertype() &&
            this.tendercategory == other.getTendercategory() &&
            ((this.payamount==null && other.getPayamount()==null) || 
             (this.payamount!=null &&
              this.payamount.equals(other.getPayamount()))) &&
            ((this.baseamount==null && other.getBaseamount()==null) || 
             (this.baseamount!=null &&
              this.baseamount.equals(other.getBaseamount()))) &&
            ((this.excessamount==null && other.getExcessamount()==null) || 
             (this.excessamount!=null &&
              this.excessamount.equals(other.getExcessamount()))) &&
            ((this.extendparam==null && other.getExtendparam()==null) || 
             (this.extendparam!=null &&
              this.extendparam.equals(other.getExtendparam()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark())));
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
        _hashCode += getLineno();
        if (getTendercode() != null) {
            _hashCode += getTendercode().hashCode();
        }
        _hashCode += getTendertype();
        _hashCode += getTendercategory();
        if (getPayamount() != null) {
            _hashCode += getPayamount().hashCode();
        }
        if (getBaseamount() != null) {
            _hashCode += getBaseamount().hashCode();
        }
        if (getExcessamount() != null) {
            _hashCode += getExcessamount().hashCode();
        }
        if (getExtendparam() != null) {
            _hashCode += getExtendparam().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Salestender.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "salestender"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "lineno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tendercode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "tendercode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tendertype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "tendertype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tendercategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "tendercategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "payamount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "baseamount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excessamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "excessamount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "remark"));
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
