package com.epam.DesignPrinciples;

public class Math {
	Double x,y;
	Math(double a,double b){
		x = a;
		y = b;
		
	}
	public void Add() {
		System.out.println("Addition of "+x+"+"+y+"="+(x+y));
	}
	public void Sub() {
		System.out.println("Subtraction of "+x+"-"+y+"="+(x-y));
	}
	public void Multiply() {
		System.out.println("Multiplication of "+x+"*"+y+"="+(x*y));
		
	}
	public void Div() {
		if(y == 0)
			throw new ArithmeticException("Division by zero error \n please enter proper value");
		else
			System.out.println("Division of "+x+"/"+y+"="+(x/y));
		
	}
	

}
