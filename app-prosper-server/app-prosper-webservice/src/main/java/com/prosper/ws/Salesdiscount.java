/**
 * Salesdiscount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class Salesdiscount  implements java.io.Serializable {
    private java.lang.String discountapprove;

    private java.lang.String discountmode;

    private java.math.BigDecimal discountvalue;

    private java.math.BigDecimal discountless;

    public Salesdiscount() {
    }

    public Salesdiscount(
           java.lang.String discountapprove,
           java.lang.String discountmode,
           java.math.BigDecimal discountvalue,
           java.math.BigDecimal discountless) {
           this.discountapprove = discountapprove;
           this.discountmode = discountmode;
           this.discountvalue = discountvalue;
           this.discountless = discountless;
    }


    /**
     * Gets the discountapprove value for this Salesdiscount.
     * 
     * @return discountapprove
     */
    public java.lang.String getDiscountapprove() {
        return discountapprove;
    }


    /**
     * Sets the discountapprove value for this Salesdiscount.
     * 
     * @param discountapprove
     */
    public void setDiscountapprove(java.lang.String discountapprove) {
        this.discountapprove = discountapprove;
    }


    /**
     * Gets the discountmode value for this Salesdiscount.
     * 
     * @return discountmode
     */
    public java.lang.String getDiscountmode() {
        return discountmode;
    }


    /**
     * Sets the discountmode value for this Salesdiscount.
     * 
     * @param discountmode
     */
    public void setDiscountmode(java.lang.String discountmode) {
        this.discountmode = discountmode;
    }


    /**
     * Gets the discountvalue value for this Salesdiscount.
     * 
     * @return discountvalue
     */
    public java.math.BigDecimal getDiscountvalue() {
        return discountvalue;
    }


    /**
     * Sets the discountvalue value for this Salesdiscount.
     * 
     * @param discountvalue
     */
    public void setDiscountvalue(java.math.BigDecimal discountvalue) {
        this.discountvalue = discountvalue;
    }


    /**
     * Gets the discountless value for this Salesdiscount.
     * 
     * @return discountless
     */
    public java.math.BigDecimal getDiscountless() {
        return discountless;
    }


    /**
     * Sets the discountless value for this Salesdiscount.
     * 
     * @param discountless
     */
    public void setDiscountless(java.math.BigDecimal discountless) {
        this.discountless = discountless;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Salesdiscount)) return false;
        Salesdiscount other = (Salesdiscount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.discountapprove==null && other.getDiscountapprove()==null) || 
             (this.discountapprove!=null &&
              this.discountapprove.equals(other.getDiscountapprove()))) &&
            ((this.discountmode==null && other.getDiscountmode()==null) || 
             (this.discountmode!=null &&
              this.discountmode.equals(other.getDiscountmode()))) &&
            ((this.discountvalue==null && other.getDiscountvalue()==null) || 
             (this.discountvalue!=null &&
              this.discountvalue.equals(other.getDiscountvalue()))) &&
            ((this.discountless==null && other.getDiscountless()==null) || 
             (this.discountless!=null &&
              this.discountless.equals(other.getDiscountless())));
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
        if (getDiscountapprove() != null) {
            _hashCode += getDiscountapprove().hashCode();
        }
        if (getDiscountmode() != null) {
            _hashCode += getDiscountmode().hashCode();
        }
        if (getDiscountvalue() != null) {
            _hashCode += getDiscountvalue().hashCode();
        }
        if (getDiscountless() != null) {
            _hashCode += getDiscountless().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Salesdiscount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "salesdiscount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountapprove");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "discountapprove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountmode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "discountmode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "discountvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountless");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "discountless"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
