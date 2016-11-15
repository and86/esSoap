package it.alfasoft.andrea;

public class CalcolatriceProxy implements it.alfasoft.andrea.Calcolatrice {
  private String _endpoint = null;
  private it.alfasoft.andrea.Calcolatrice calcolatrice = null;
  
  public CalcolatriceProxy() {
    _initCalcolatriceProxy();
  }
  
  public CalcolatriceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalcolatriceProxy();
  }
  
  private void _initCalcolatriceProxy() {
    try {
      calcolatrice = (new it.alfasoft.andrea.CalcolatriceServiceLocator()).getCalcolatrice();
      if (calcolatrice != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calcolatrice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calcolatrice)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calcolatrice != null)
      ((javax.xml.rpc.Stub)calcolatrice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.alfasoft.andrea.Calcolatrice getCalcolatrice() {
    if (calcolatrice == null)
      _initCalcolatriceProxy();
    return calcolatrice;
  }
  
  public int add(int num1, int num2) throws java.rmi.RemoteException{
    if (calcolatrice == null)
      _initCalcolatriceProxy();
    return calcolatrice.add(num1, num2);
  }
  
  
}