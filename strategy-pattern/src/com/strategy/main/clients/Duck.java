package com.strategy.main.clients;

import com.strategy.main.clients.behaviour.IFlyBehaviour;
import com.strategy.main.clients.behaviour.IQuackBehaviour;

public abstract class Duck {
	IQuackBehaviour quackBehave;
	IFlyBehaviour flyBeahve;
	
	Duck(IQuackBehaviour qb, IFlyBehaviour fb){
		this.quackBehave = qb;
		this.flyBeahve = fb;
	}
	
  public  abstract void display();
    void swim() {
    	System.out.println("Every Duck can swim !!!");
    }
	public void performFly() {
		flyBeahve.fly();
	}
    public void performQuack() {
    	quackBehave.quack();
	}
    public void setFlyBehaviour(IFlyBehaviour flyBeahve) {
    	System.out.println("seeting fly behaviour...");
    	this.flyBeahve = flyBeahve;
    }
    
    public void setquackBehaviour(IQuackBehaviour quackBehave) {
    	System.out.println("seeting quack behaviour...");
    	this.quackBehave = quackBehave;
    }
	

}
