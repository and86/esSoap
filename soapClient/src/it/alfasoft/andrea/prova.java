package it.alfasoft.andrea;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class prova {

	public static void main(String[] args){
		
		CalcolatriceServiceLocator locator=new CalcolatriceServiceLocator();
		
		try{
			
			Calcolatrice c=locator.getCalcolatrice();
			
			int res=c.add(10, 8);
			System.out.println(res);
		
		} catch(ServiceException e){
			e.printStackTrace();
		}catch(RemoteException e){
			e.printStackTrace();
		}
		

	}

}
