package it.alfasoft.andrea;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ICalcolatrice {

	@WebMethod
	public abstract int add(int num1, int num2);

}