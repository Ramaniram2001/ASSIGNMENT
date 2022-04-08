package com.task.model2;

public class Hotel {
	private String hotelName;
	private String hotelLocation;
	private int pinCode;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelName, String hotelLocation, int pinCode) {
		super();
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
		this.pinCode = pinCode;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	

}
