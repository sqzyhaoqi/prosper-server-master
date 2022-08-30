/**
 * SalestransSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.prosper.ws;

public interface SalestransSoap_PortType extends java.rmi.Remote {
    public int test_a_plus_b(int al_value1, int al_value2) throws java.rmi.RemoteException;
    public java.lang.String getversion() throws java.rmi.RemoteException;
    public java.lang.String getcompanyname() throws java.rmi.RemoteException;
    public Postsalescreateresponse postsalescreate(Postsalescreaterequest astr_request) throws java.rmi.RemoteException;
    public Postdailysalessummaryresponse postdailysalessummary(Postdailysalessummaryrequest astr_request) throws java.rmi.RemoteException;
    public Postdailysalessummary2Response postdailysalessummary2(Postdailysalessummary2Request astr_request) throws java.rmi.RemoteException;
    public Postdailysalesestimatecreateresponse postdailysalesestimatecreate(Postdailysalesestimatecreaterequest astr_request) throws java.rmi.RemoteException;
    public Postmalldailysalessummaryresponse postmalldailysalessummary(Postmalldailysalessummaryrequest astr_request) throws java.rmi.RemoteException;
    public Postesalescreateresponse postesalescreate(Postesalescreaterequest astr_request) throws java.rmi.RemoteException;
}
