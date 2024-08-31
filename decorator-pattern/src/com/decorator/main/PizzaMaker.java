package com.decorator.main;

public class PizzaMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizza  = new MozzeralaDecorator(new TomatoSauceDecorator(new SimplePizza()));
		
		System.out.println("Ingredients : "+pizza.getDescription());
		System.out.println("Total Cost: "+pizza.getCost());
		
		
		//  other way of making only tomato sauce pizza
		Pizza pizza2 = new SimplePizza();
		pizza2 = new TomatoSauceDecorator(pizza2);
		System.out.println("Ingredients : "+pizza2.getDescription());
		System.out.println("Total Cost: "+pizza2.getCost());
		
		// with the help of decorator pattern we can extends the functionality eith modifying existing logic we can add as many and any combination
		// eg: on;y tomato sauce pizza or only mozzerala pizza or both combination
	

	}

}
