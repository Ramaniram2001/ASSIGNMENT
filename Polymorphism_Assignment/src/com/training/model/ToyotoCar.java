package com.training.model;

import com.training.ifaces.Automobile;

public class ToyotoCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "green";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Bens";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 3423454;
	}

}
