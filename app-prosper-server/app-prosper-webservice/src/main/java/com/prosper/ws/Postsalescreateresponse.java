/**
 * Postsalescreateresponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class Postsalescreateresponse  implements java.io.Serializable {
    private Responseheader header;

    private Saleshdr salestotal;

    public Postsalescreateresponse() {
    }

    public Postsalescreateresponse(
           Responseheader header,
           Saleshdr salestotal) {
           this.header = header;
           this.salestotal = salestotal;
    }


    /**
     * Gets the header value for this Postsalescreateresponse.
     * 
     * @return header
     */
    public Responseheader getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Postsalescreateresponse.
     * 
     * @param header
     */
    public void setHeader(Responseheader header) {
        this.header = header;
    }


    /**
     * Gets the salestotal value for this Postsalescreateresponse.
     * 
     * @return salestotal
     */
    public Saleshdr getSalestotal() {
        return salestotal;
    }


    /**
     * Sets the salestotal value for this Postsalescreateresponse.
     * 
     * @param salestotal
     */
    public void setSalestotal(Saleshdr salestotal) {
        this.salestotal = salestotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Postsalescreateresponse)) return false;
        Postsalescreateresponse other = (Postsalescreateresponse) obj;
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
            ((this.salestotal==null && other.getSalestotal()==null) || 
             (this.salestotal!=null &&
              this.salestotal.equals(other.getSalestotal())));
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
        if (getSalestotal() != null) {
            _hashCode += getSalestotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Postsalescreateresponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "postsalescreateresponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "responseheader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salestotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "salestotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "saleshdr"));
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
