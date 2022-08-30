/**
 * Salestax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class Salestax  implements java.io.Serializable {
    private java.math.BigDecimal taxrate;

    private java.math.BigDecimal taxamount;

    public Salestax() {
    }

    public Salestax(
           java.math.BigDecimal taxrate,
           java.math.BigDecimal taxamount) {
           this.taxrate = taxrate;
           this.taxamount = taxamount;
    }


    /**
     * Gets the taxrate value for this Salestax.
     * 
     * @return taxrate
     */
    public java.math.BigDecimal getTaxrate() {
        return taxrate;
    }


    /**
     * Sets the taxrate value for this Salestax.
     * 
     * @param taxrate
     */
    public void setTaxrate(java.math.BigDecimal taxrate) {
        this.taxrate = taxrate;
    }


    /**
     * Gets the taxamount value for this Salestax.
     * 
     * @return taxamount
     */
    public java.math.BigDecimal getTaxamount() {
        return taxamount;
    }


    /**
     * Sets the taxamount value for this Salestax.
     * 
     * @param taxamount
     */
    public void setTaxamount(java.math.BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Salestax)) return false;
        Salestax other = (Salestax) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxrate==null && other.getTaxrate()==null) || 
             (this.taxrate!=null &&
              this.taxrate.equals(other.getTaxrate()))) &&
            ((this.taxamount==null && other.getTaxamount()==null) || 
             (this.taxamount!=null &&
              this.taxamount.equals(other.getTaxamount())));
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
        if (getTaxrate() != null) {
            _hashCode += getTaxrate().hashCode();
        }
        if (getTaxamount() != null) {
            _hashCode += getTaxamount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Salestax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "salestax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "taxrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "taxamount"));
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
