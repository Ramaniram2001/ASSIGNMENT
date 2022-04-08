package com.training.model;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {
	
	
	
	@Override
	public String getColor() {
//String color = "red";
		return "red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 1934254;
	}


}
