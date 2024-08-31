package com.decorator.main;

public abstract class DecoratorForPizza implements Pizza {
		protected Pizza pizza;
	DecoratorForPizza(Pizza pizza){
		this.pizza = pizza;
	}
	
	public String getDescription() {
		return pizza.getDescription();
	}
	public double getCost() {
		return pizza.getCost();
	}

}
