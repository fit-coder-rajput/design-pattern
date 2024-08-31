package com.decorator.main;

public class SimplePizza implements Pizza {

	String description="";
	
	@Override
	public String getDescription() {
		return "Thin dough, ";
	}

	@Override
	public double getCost() {
		System.out.println("cost of thin dough: "+100.0);
		return 100.00;
	}

}
