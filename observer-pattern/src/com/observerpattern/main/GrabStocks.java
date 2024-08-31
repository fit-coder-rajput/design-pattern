package com.observerpattern.main;

import com.observerpattern.main.observable.Observable;
import com.observerpattern.main.observable.impl.StockGrabber;
import com.observerpattern.main.observers.Observer;
import com.observerpattern.main.observers.impl.StockObserver;

public class GrabStocks {

	public static void main(String[] args) {
		
		
		StockGrabber stockGrabber = new StockGrabber();
		Observer ob1 = new  StockObserver(stockGrabber); // registerd observer 1
		
		
		stockGrabber.setGoogPrice(116.6);
		stockGrabber.setApplePrice(121.3);
		stockGrabber.setIbmPrice(220.0);
		
		Observer ob2 =new StockObserver(stockGrabber);  // registered observer 2
		
		stockGrabber.setGoogPrice(116.6);
		stockGrabber.setApplePrice(121.3);
		stockGrabber.setIbmPrice(220.0);
		
		// unregistering observer
//		stockGrabber.unregister(ob2);
//		
//		stockGrabber.setGoogPrice(116.6);
		
		
		// not related to observer pattern -- just updating stock price with multithreading
		
		 new Thread(new GetTheStocks(stockGrabber, "GOOG", 120.4)).start();
		 new Thread(new GetTheStocks(stockGrabber, "APPL", 140.4)).start();
		 new Thread(new GetTheStocks(stockGrabber, "IBM", 150.4)).start();
		
	}
	

}
