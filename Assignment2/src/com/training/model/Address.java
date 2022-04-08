package com.training.model;

public class Address {
	
	//generating property
	private int doorNumber;
	private String streetName;
	private String landMark;
	private int pinCode;
	
	
	//generating superclass
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//generating constructors from fields
	public Address(int doorNumber, String streetName, String landMark, int pinCode) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.landMark = landMark;
		this.pinCode = pinCode;
	}
	
	
	//generating getters and setters
	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return this.doorNumber +","+this.streetName +","+this.landMark +"," +this.pinCode;
	}
	


	
	
	
	
	
	

}
