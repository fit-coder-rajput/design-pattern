package com.strategy.main.clients.behaviour.impl;

import com.strategy.main.clients.behaviour.IFlyBehaviour;

public class FlyNoWay implements IFlyBehaviour{
	@Override
	public void fly() {
		System.out.println("I can't fly .....");
		
	}
}


