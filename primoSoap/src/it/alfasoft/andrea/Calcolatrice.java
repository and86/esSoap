package it.alfasoft.andrea;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class Calcolatrice implements ICalcolatrice {

	@Override
	@WebMethod
	public int add(int num1, int num2){
		return num1+num2;
	}

}
