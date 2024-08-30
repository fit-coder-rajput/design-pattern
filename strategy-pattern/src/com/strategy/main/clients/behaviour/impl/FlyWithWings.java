package com.strategy.main.clients.behaviour.impl;

import com.strategy.main.clients.behaviour.IFlyBehaviour;

public class FlyWithWings implements IFlyBehaviour{

	@Override
	public void fly() {
		System.out.println("Hurray I am flying with the wings ........");
		
	}

}
