package com.strategy.main.clients.behaviour.impl;

import com.strategy.main.clients.behaviour.IQuackBehaviour;

public class MuteQuack implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("mute--------");
		
	}

}
