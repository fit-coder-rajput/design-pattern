package com.strategy.main.clients;

import com.strategy.main.clients.behaviour.IFlyBehaviour;
import com.strategy.main.clients.behaviour.IQuackBehaviour;

public class RubberDuck extends Duck {

	public RubberDuck(IQuackBehaviour qb, IFlyBehaviour fb) {
		super(qb, fb);
	}

	@Override
	public void display() {
		System.out.println("I am a Rubber Duck !!!!");
		
	}

}
