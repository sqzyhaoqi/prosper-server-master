/**
 * Postdailysalessummaryrequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class Postdailysalessummaryrequest  implements java.io.Serializable {
    private Requestheader header;

    private Dailysalessummary salessummary;

    public Postdailysalessummaryrequest() {
    }

    public Postdailysalessummaryrequest(
           Requestheader header,
           Dailysalessummary salessummary) {
           this.header = header;
           this.salessummary = salessummary;
    }


    /**
     * Gets the header value for this Postdailysalessummaryrequest.
     * 
     * @return header
     */
    public Requestheader getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Postdailysalessummaryrequest.
     * 
     * @param header
     */
    public void setHeader(Requestheader header) {
        this.header = header;
    }


    /**
     * Gets the salessummary value for this Postdailysalessummaryrequest.
     * 
     * @return salessummary
     */
    public Dailysalessummary getSalessummary() {
        return salessummary;
    }


    /**
     * Sets the salessummary value for this Postdailysalessummaryrequest.
     * 
     * @param salessummary
     */
    public void setSalessummary(Dailysalessummary salessummary) {
        this.salessummary = salessummary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Postdailysalessummaryrequest)) return false;
        Postdailysalessummaryrequest other = (Postdailysalessummaryrequest) obj;
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
        new org.apache.axis.description.TypeDesc(Postdailysalessummaryrequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "postdailysalessummaryrequest"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "dailysalessummary"));
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
