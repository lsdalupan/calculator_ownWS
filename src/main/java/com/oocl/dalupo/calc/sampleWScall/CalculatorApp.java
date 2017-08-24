package com.oocl.dalupo.calc.sampleWScall;

import com.oocl.daluplo.calc.webService.*;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorService calc = new CalculatorService();
		Calculator calculator = calc.getCalculatorPort();
		System.out.println(calculator.add(5, 4));
		
	}

}
