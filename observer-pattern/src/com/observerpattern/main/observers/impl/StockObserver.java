package com.observerpattern.main.observers.impl;

import com.observerpattern.main.observable.Observable;
import com.observerpattern.main.observable.impl.StockGrabber;
import com.observerpattern.main.observers.Observer;

public class StockObserver implements Observer{
		
	Double googPrice = 0.0; Double applePrice = 0.0; Double ibmPrice = 0.0;
	public static Integer observeID = 1;
	private int id=0;
	Observable observable;
	public StockObserver(Observable observable) {
		this.observable = observable;
		observable.register(this);
		id = observeID++;
	}
	
	@Override
	public void update() {
		this.googPrice = ((StockGrabber)observable).getGoogPrice();
		this.applePrice = ((StockGrabber)observable).getApplePrice();
		this.ibmPrice = ((StockGrabber)observable).getIbmPrice();
		printTheUpdates();
	}
	
	void printTheUpdates() {System.out.println("---------Observer "+id+"----------");
		System.out.println("GOOG :"+googPrice+"\nAPPL: "+applePrice+"\nIBM: "+ibmPrice);
		 System.out.println("-----------------------------------------");
	}

}
