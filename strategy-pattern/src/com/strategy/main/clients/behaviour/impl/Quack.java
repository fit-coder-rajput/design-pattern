package com.strategy.main.clients.behaviour.impl;

import com.strategy.main.clients.behaviour.IQuackBehaviour;

public class Quack implements IQuackBehaviour{

	@Override
	public void quack() {
		System.out.println("quack quack.. uack quack");
		
	}

}
