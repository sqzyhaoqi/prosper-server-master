/**
 * Postmalldailysalessummaryrequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class Postmalldailysalessummaryrequest  implements java.io.Serializable {
    private Requestheader header;

    private Malldailysalessummary salessummary;

    public Postmalldailysalessummaryrequest() {
    }

    public Postmalldailysalessummaryrequest(
           Requestheader header,
           Malldailysalessummary salessummary) {
           this.header = header;
           this.salessummary = salessummary;
    }


    /**
     * Gets the header value for this Postmalldailysalessummaryrequest.
     * 
     * @return header
     */
    public Requestheader getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Postmalldailysalessummaryrequest.
     * 
     * @param header
     */
    public void setHeader(Requestheader header) {
        this.header = header;
    }


    /**
     * Gets the salessummary value for this Postmalldailysalessummaryrequest.
     * 
     * @return salessummary
     */
    public Malldailysalessummary getSalessummary() {
        return salessummary;
    }


    /**
     * Sets the salessummary value for this Postmalldailysalessummaryrequest.
     * 
     * @param salessummary
     */
    public void setSalessummary(Malldailysalessummary salessummary) {
        this.salessummary = salessummary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Postmalldailysalessummaryrequest)) return false;
        Postmalldailysalessummaryrequest other = (Postmalldailysalessummaryrequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.salessummary==null && other.getSalessummary()==null) || 
             (this.salessummary!=null &&
              this.salessummary.equals(other.getSalessummary())));
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
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getSalessummary() != null) {
            _hashCode += getSalessummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Postmalldailysalessummaryrequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "postmalldailysalessummaryrequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "requestheader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salessummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "salessummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "malldailysalessummary"));
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
