package com.decorator.main;

public class TomatoSauceDecorator extends DecoratorForPizza {

	TomatoSauceDecorator(Pizza pizza) {
		super(pizza);
		System.out.println("Adding tomato sauce ....");
	}
	
	public String getDescription() {
		return  pizza.getDescription() + " added tomato sauce";
	}
	
	public double getCost() {
		System.out.println("cost of  tomato sauce : "+40.0);
		return pizza.getCost() + 40.0;
	}

}
