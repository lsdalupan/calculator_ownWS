package com.oocl.daluplo.calc;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {
	
	@WebMethod
	public Double add(double x, double y) {
		return x+y;
	}
	
	@WebMethod
	public Double subtract(double x, double y) {
		return x-y;
	}
	
	@WebMethod
	public Double multiply(double x, double y) {
		return x*y;
	}
	
	@WebMethod
	public Double divide(double x, double y) {
		return x/y;
		
	}
	
	@WebMethod
	public Double modulo(double x, double y) {
		return x%y;
	}
	
//	@WebMethod
//	public Double calc(String op, double x, double y) {
//		op = op.toLowerCase();
//		
//		if(op=="add")  return add(x,y);
//		else if(op=="subtract")  return subtract(x,y);
//		else if(op=="multiply")  return multiply(x,y);
//		else if(op=="divide")  return divide(x,y);
//		else if(op=="modulo")  return modulo(x,y);
//	}
	
	
	
}
