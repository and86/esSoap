/**
 * CalcolatriceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.andrea;

public class CalcolatriceServiceLocator extends org.apache.axis.client.Service implements it.alfasoft.andrea.CalcolatriceService {

    public CalcolatriceServiceLocator() {
    }


    public CalcolatriceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalcolatriceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Calcolatrice
    private java.lang.String Calcolatrice_address = "http://localhost:8085/primoSoap/services/Calcolatrice";

    public java.lang.String getCalcolatriceAddress() {
        return Calcolatrice_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalcolatriceWSDDServiceName = "Calcolatrice";

    public java.lang.String getCalcolatriceWSDDServiceName() {
        return CalcolatriceWSDDServiceName;
    }

    public void setCalcolatriceWSDDServiceName(java.lang.String name) {
        CalcolatriceWSDDServiceName = name;
    }

    public it.alfasoft.andrea.Calcolatrice getCalcolatrice() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Calcolatrice_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalcolatrice(endpoint);
    }

    public it.alfasoft.andrea.Calcolatrice getCalcolatrice(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.alfasoft.andrea.CalcolatriceSoapBindingStub _stub = new it.alfasoft.andrea.CalcolatriceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalcolatriceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalcolatriceEndpointAddress(java.lang.String address) {
        Calcolatrice_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.alfasoft.andrea.Calcolatrice.class.isAssignableFrom(serviceEndpointInterface)) {
                it.alfasoft.andrea.CalcolatriceSoapBindingStub _stub = new it.alfasoft.andrea.CalcolatriceSoapBindingStub(new java.net.URL(Calcolatrice_address), this);
                _stub.setPortName(getCalcolatriceWSDDServiceName());
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
        if ("Calcolatrice".equals(inputPortName)) {
            return getCalcolatrice();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://andrea.alfasoft.it", "CalcolatriceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://andrea.alfasoft.it", "Calcolatrice"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Calcolatrice".equals(portName)) {
            setCalcolatriceEndpointAddress(address);
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
