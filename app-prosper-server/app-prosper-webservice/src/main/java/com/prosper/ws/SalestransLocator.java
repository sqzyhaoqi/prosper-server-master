/**
 * SalestransLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public class SalestransLocator extends org.apache.axis.client.Service implements Salestrans {

    public SalestransLocator() {
    }

    public SalestransLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SalestransLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for salestransSoap
    private java.lang.String salestransSoap_address = "https://ggwpos.hanglung.com.cn:8380/HLD/salestrans.asmx";

    public java.lang.String getsalestransSoapAddress() {
        return salestransSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String salestransSoapWSDDServiceName = "salestransSoap";

    public java.lang.String getsalestransSoapWSDDServiceName() {
        return salestransSoapWSDDServiceName;
    }

    public void setsalestransSoapWSDDServiceName(java.lang.String name) {
        salestransSoapWSDDServiceName = name;
    }

    public SalestransSoap_PortType getsalestransSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(salestransSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsalestransSoap(endpoint);
    }

    public SalestransSoap_PortType getsalestransSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            SalestransSoap_BindingStub _stub = new SalestransSoap_BindingStub(portAddress, this);
            _stub.setPortName(getsalestransSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsalestransSoapEndpointAddress(java.lang.String address) {
        salestransSoap_address = address;
    }


    // Use to get a proxy class for salestransSoap12
    private java.lang.String salestransSoap12_address = "https://ggwpos.hanglung.com.cn:8380/HLD/salestrans12.asmx";

    public java.lang.String getsalestransSoap12Address() {
        return salestransSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String salestransSoap12WSDDServiceName = "salestransSoap12";

    public java.lang.String getsalestransSoap12WSDDServiceName() {
        return salestransSoap12WSDDServiceName;
    }

    public void setsalestransSoap12WSDDServiceName(java.lang.String name) {
        salestransSoap12WSDDServiceName = name;
    }

    public SalestransSoap_PortType getsalestransSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(salestransSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsalestransSoap12(endpoint);
    }

    public SalestransSoap_PortType getsalestransSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            SalestransSoap12Stub _stub = new SalestransSoap12Stub(portAddress, this);
            _stub.setPortName(getsalestransSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsalestransSoap12EndpointAddress(java.lang.String address) {
        salestransSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (SalestransSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                SalestransSoap_BindingStub _stub = new SalestransSoap_BindingStub(new java.net.URL(salestransSoap_address), this);
                _stub.setPortName(getsalestransSoapWSDDServiceName());
                return _stub;
            }
            if (SalestransSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                SalestransSoap12Stub _stub = new SalestransSoap12Stub(new java.net.URL(salestransSoap12_address), this);
                _stub.setPortName(getsalestransSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("salestransSoap".equals(inputPortName)) {
            return getsalestransSoap();
        }
        else if ("salestransSoap12".equals(inputPortName)) {
            return getsalestransSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempurl.org", "salestrans");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempurl.org", "salestransSoap"));
            ports.add(new javax.xml.namespace.QName("http://tempurl.org", "salestransSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("salestransSoap".equals(portName)) {
            setsalestransSoapEndpointAddress(address);
        }
        else 
if ("salestransSoap12".equals(portName)) {
            setsalestransSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
