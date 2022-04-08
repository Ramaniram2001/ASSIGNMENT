package com.training;
import com.training.model.*;
import com.training.ifaces.Automobile;

import com.training.model.ObjectFactory;

public class Application {

	public static void main(String[] args) {
		ObjectFactory factory=new ObjectFactory();
		Automobile Maru= factory.getObject(1);
		Automobile Toyo =  factory.getObject(2);
		System.out.println(Automobile.showRoom);
		factory.printQuote(Toyo);
		factory.printQuote(Maru);
		
		
		
		

	

	}

}