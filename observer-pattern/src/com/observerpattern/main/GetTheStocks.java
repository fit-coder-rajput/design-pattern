package com.observerpattern.main;

import java.text.DecimalFormat;
import java.util.Random;

import com.observerpattern.main.observable.impl.StockGrabber;

public class GetTheStocks  implements Runnable {
	
	StockGrabber stockGrabber;
	String stock = "";
	double stockPrice=0.0;
	public GetTheStocks(StockGrabber stockGrabber, String stock, double startPrice) {
		this.stockGrabber = stockGrabber;
		this.stock = stock;
		this.stockPrice = startPrice;
	}

	@Override
	public void run() {
		
		for(int i=0; i<20; i++) {
			
			try {
				Thread.sleep(3000);
			}catch(InterruptedException ex) {}
			
			 // Generates a random number between -.03 and .03
			 double randNum = (Math.random() * (.06)) - .03;
			 DecimalFormat df = new DecimalFormat("#.##");
			 
			 double price = Double.valueOf(df.format(randNum+stockPrice));
			 System.out.println("*****************************");
			 System.out.println(stock + " : "+price +" "+df.format(randNum));
			 System.out.println("*****************************");
			 
			 
			 switch(stock) {
			 case "GOOG" : stockGrabber.setGoogPrice(price); break;
			 				
			 case "APPL" : stockGrabber.setApplePrice(price); break;
			 
			 case "IBM" : stockGrabber.setIbmPrice(price); break;
			 
			 default: System.out.println("Invalid Stock.....try another stock...");
			 }
			 
			

		}
		
	}

}
