/**
 * Salespromtion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class Salespromtion  implements java.io.Serializable {
    private java.lang.String promotionid;

    private java.math.BigDecimal promotionuseqty;

    private java.math.BigDecimal promotionless;

    private java.math.BigDecimal promotionpkgcount;

    public Salespromtion() {
    }

    public Salespromtion(
           java.lang.String promotionid,
           java.math.BigDecimal promotionuseqty,
           java.math.BigDecimal promotionless,
           java.math.BigDecimal promotionpkgcount) {
           this.promotionid = promotionid;
           this.promotionuseqty = promotionuseqty;
           this.promotionless = promotionless;
           this.promotionpkgcount = promotionpkgcount;
    }


    /**
     * Gets the promotionid value for this Salespromtion.
     * 
     * @return promotionid
     */
    public java.lang.String getPromotionid() {
        return promotionid;
    }


    /**
     * Sets the promotionid value for this Salespromtion.
     * 
     * @param promotionid
     */
    public void setPromotionid(java.lang.String promotionid) {
        this.promotionid = promotionid;
    }


    /**
     * Gets the promotionuseqty value for this Salespromtion.
     * 
     * @return promotionuseqty
     */
    public java.math.BigDecimal getPromotionuseqty() {
        return promotionuseqty;
    }


    /**
     * Sets the promotionuseqty value for this Salespromtion.
     * 
     * @param promotionuseqty
     */
    public void setPromotionuseqty(java.math.BigDecimal promotionuseqty) {
        this.promotionuseqty = promotionuseqty;
    }


    /**
     * Gets the promotionless value for this Salespromtion.
     * 
     * @return promotionless
     */
    public java.math.BigDecimal getPromotionless() {
        return promotionless;
    }


    /**
     * Sets the promotionless value for this Salespromtion.
     * 
     * @param promotionless
     */
    public void setPromotionless(java.math.BigDecimal promotionless) {
        this.promotionless = promotionless;
    }


    /**
     * Gets the promotionpkgcount value for this Salespromtion.
     * 
     * @return promotionpkgcount
     */
    public java.math.BigDecimal getPromotionpkgcount() {
        return promotionpkgcount;
    }


    /**
     * Sets the promotionpkgcount value for this Salespromtion.
     * 
     * @param promotionpkgcount
     */
    public void setPromotionpkgcount(java.math.BigDecimal promotionpkgcount) {
        this.promotionpkgcount = promotionpkgcount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Salespromtion)) return false;
        Salespromtion other = (Salespromtion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.promotionid==null && other.getPromotionid()==null) || 
             (this.promotionid!=null &&
              this.promotionid.equals(other.getPromotionid()))) &&
            ((this.promotionuseqty==null && other.getPromotionuseqty()==null) || 
             (this.promotionuseqty!=null &&
              this.promotionuseqty.equals(other.getPromotionuseqty()))) &&
            ((this.promotionless==null && other.getPromotionless()==null) || 
             (this.promotionless!=null &&
              this.promotionless.equals(other.getPromotionless()))) &&
            ((this.promotionpkgcount==null && other.getPromotionpkgcount()==null) || 
             (this.promotionpkgcount!=null &&
              this.promotionpkgcount.equals(other.getPromotionpkgcount())));
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
        if (getPromotionid() != null) {
            _hashCode += getPromotionid().hashCode();
        }
        if (getPromotionuseqty() != null) {
            _hashCode += getPromotionuseqty().hashCode();
        }
        if (getPromotionless() != null) {
            _hashCode += getPromotionless().hashCode();
        }
        if (getPromotionpkgcount() != null) {
            _hashCode += getPromotionpkgcount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Salespromtion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempurl.org", "salespromtion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "promotionid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionuseqty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "promotionuseqty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionless");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "promotionless"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionpkgcount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempurl.org", "promotionpkgcount"));
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
