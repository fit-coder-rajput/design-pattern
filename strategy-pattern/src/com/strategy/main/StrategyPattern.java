package com.strategy.main;

import com.strategy.main.clients.Duck;
import com.strategy.main.clients.MallardDuck;
import com.strategy.main.clients.RubberDuck;
import com.strategy.main.clients.behaviour.impl.FlyNoWay;
import com.strategy.main.clients.behaviour.impl.FlyWithRockets;
import com.strategy.main.clients.behaviour.impl.FlyWithWings;
import com.strategy.main.clients.behaviour.impl.MuteQuack;
import com.strategy.main.clients.behaviour.impl.Squeak;

public class StrategyPattern {

	public static void main(String[] args) {
		Duck mDuck = new MallardDuck(new Squeak(), new FlyWithWings());
		mDuck.display();
		mDuck.performQuack();
		mDuck.performFly();
		
		Duck rDuck = new RubberDuck(new MuteQuack(), new FlyNoWay());
		rDuck.display();
		rDuck.performFly();
		rDuck.performQuack();
		rDuck.setFlyBehaviour(new FlyWithRockets());
		rDuck.performFly();
		

	}

}
