package com.strategy.main.clients.behaviour.impl;

import com.strategy.main.clients.behaviour.IFlyBehaviour;

public class FlyWithRockets implements IFlyBehaviour {

	@Override
	public void fly() {
		System.out.println("now i am able fly with the help of rockets");
		
	}

}
