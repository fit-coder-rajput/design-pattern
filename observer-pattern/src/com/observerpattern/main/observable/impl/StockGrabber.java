package com.observerpattern.main.observable.impl;

import java.util.ArrayList;
import java.util.List;

import com.observerpattern.main.observable.Observable;
import com.observerpattern.main.observers.Observer;

public class StockGrabber implements Observable{
	
	List<Observer> observers = new ArrayList<>();
	Double googPrice = 0.0; Double applePrice = 0.0; Double ibmPrice = 0.0;
	
	public Double getApplePrice() {
		return applePrice;
	}
	
	public Double getGoogPrice() {
		return googPrice;
	}

	public Double getIbmPrice() {
		return ibmPrice;
	}

	public void setApplePrice(Double applePrice) {
		this.applePrice = applePrice;
		notifyObservers();
	}

	public void setGoogPrice(Double googPrice) {
		this.googPrice = googPrice;
		notifyObservers();
	}

	public void setIbmPrice(Double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObservers();
	}

	
	@Override
	public void register(Observer obs) {
		observers.add(obs);	
	}

	@Override
	public void unregister(Observer obs) {
		 int obsNo = observers.indexOf(obs)+1;
		 System.out.println("removing .. observer "+obsNo);
		 observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs: observers) {
			obs.update();
		}	
	}

}
