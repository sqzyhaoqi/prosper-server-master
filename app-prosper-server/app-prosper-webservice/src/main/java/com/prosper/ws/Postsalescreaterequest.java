/**
 * Postsalescreaterequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class Postsalescreaterequest  implements java.io.Serializable {
    private Requestheader header;

    private Saleshdr salestotal;

    private Salesitem[] salesitems;

    private Salestender[] salestenders;

    private Salesdelivery salesdlvy;

    public Postsalescreaterequest() {
    }

    public Postsalescreaterequest(
           Requestheader header,
           Saleshdr salestotal,
           Salesitem[] salesitems,
           Salestender[] salestenders,
           Salesdelivery salesdlvy) {
           this.header = header;
           this.salestotal = salestotal;
           this.salesitems = salesitems;
           this.salestenders = salestenders;
           this.salesdlvy = salesdlvy;
    }


    /**
     * Gets the header value for this Postsalescreaterequest.
     * 
     * @return header
     */
    public Requestheader getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Postsalescreaterequest.
     * 
     * @param header
     */
    public void setHeader(Requestheader header) {
        this.header = header;
    }


    /**
     * Gets the salestotal value for this Postsalescreaterequest.
     * 
     * @return salestotal
     */
    public Saleshdr getSalestotal() {
        return salestotal;
    }


    /**
     * Sets the salestotal value for this Postsalescreaterequest.
     * 
     * @param salestotal
     */
    public void setSalestotal(Saleshdr salestotal) {
        this.salestotal = salestotal;
    }


    /**
     * Gets the salesitems value for this Postsalescreaterequest.
     * 
     * @return salesitems
     */
    public Salesitem[] getSalesitems() {
        return salesitems;
    }


    /**
     * Sets the salesitems value for this Postsalescreaterequest.
     * 
     * @param salesitems
     */
    public void setSalesitems(Salesitem[] salesitems) {
        this.salesitems = salesitems;
    }


    /**
     * Gets the salestenders value for this Postsalescreaterequest.
     * 
     * @return salestenders
     */
    public Salestender[] getSalestenders() {
        return salestenders;
    }


    /**
     * Sets the salestenders value for this Postsalescreaterequest.
     * 
     * @param salestenders
     */
    public void setSalestenders(Salestender[] salestenders) {
        this.salestenders = salestenders;
    }


    /**
     * Gets the salesdlvy value for this Postsalescreaterequest.
     * 
     * @return salesdlvy
     */
    public Salesdelivery getSalesdlvy() {
        return salesdlvy;
    }


    /**
     * Sets the salesdlvy value for this Postsalescreaterequest.
     * 
     * @param salesdlvy
     */
    public void setSalesdlvy(Salesdelivery salesdlvy) {
        this.salesdlvy = salesdlvy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Postsalescreaterequest)) return false;
        Postsalescreaterequest other = (Postsalescreaterequest) obj;
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
              this.salestotal.equals(other.getSalestotal()))) &&
            ((this.salesitems==null && other.getSalesitems()==null) || 
             (this.salesitems!=null &&
              java.util.Arrays.equals(this.salesitems, other.getSalesitems()))) &&
            ((this.salestenders==null && other.getSalestenders()==null) || 
             (this.salestenders!=null &&
              java.util.Arrays.equals(this.salestenders, other.getSalestenders()))) &&
            ((this.salesdlvy==null && other.getSalesdlvy()==null) || 
             (this.salesdlvy!=null &&
              this.salesdlvy.equals(other.getSalesdlvy())));
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
        if (getSalesitems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesitems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesitems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalestenders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalestenders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalestenders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesdlvy() != null) {
            _hashCode += getSalesdlvy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Postsalescreaterequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "postsalescreaterequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "requestheader"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesitems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "salesitems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "salesitem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempurl.org", "salesitem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salestenders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "salestenders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "salestender"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempurl.org", "salestender"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesdlvy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "salesdlvy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "salesdelivery"));
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
