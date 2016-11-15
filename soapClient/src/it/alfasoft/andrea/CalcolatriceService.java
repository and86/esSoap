/**
 * CalcolatriceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.andrea;

public interface CalcolatriceService extends javax.xml.rpc.Service {
    public java.lang.String getCalcolatriceAddress();

    public it.alfasoft.andrea.Calcolatrice getCalcolatrice() throws javax.xml.rpc.ServiceException;

    public it.alfasoft.andrea.Calcolatrice getCalcolatrice(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
