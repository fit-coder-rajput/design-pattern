package com.strategy.main.clients;

import com.strategy.main.clients.behaviour.IFlyBehaviour;
import com.strategy.main.clients.behaviour.IQuackBehaviour;

public class MallardDuck extends Duck {

	public MallardDuck(IQuackBehaviour qb, IFlyBehaviour fb) {
		super(qb, fb);
	}

	@Override
	public void display() {
		System.out.println("1 2 check this is mallard are you guys listening im mallard duck");
		
	}

}
