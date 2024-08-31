package com.observerpattern.main.observable;

import com.observerpattern.main.observers.Observer;

public interface Observable {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObservers();

}
