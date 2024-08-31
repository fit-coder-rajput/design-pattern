package com.decorator.main;

public class MozzeralaDecorator extends DecoratorForPizza{

	MozzeralaDecorator(Pizza pizza) {
		super(pizza);
		System.out.println("Adding moz ....");
	}
	
	public String getDescription() {
		return pizza.getDescription()+" added mozzerala";
	}
	
	public double getCost() {
		System.out.println("cost od mozz : "+50.0);
		return pizza.getCost() + 50.0;
	}

}
