package com.training.model;

public class Customer {
	private int customerId;
	private String customerName;
	private int phoneNumber;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public Customer(int customerId, String customerName, int phoneNumber, String email) throws InvalidEmailException{
		super();
		if(email.contains("@")|| email.contains(".com")||email.contains(".org")|| email.contains(".in")) {
			this.email=email;
			
		
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}else {
		try {
			throw new InvalidEmailException("enter the proper email");
	}
	catch(InvalidEmailException e) {
		e.printStackTrace();
	}
	}
	}


	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail() {
		if(email.contains("@")||email.contains(".com")||email.contains(".org")||email.contains(".in"))
		{
			this.email=email;
		}else {
			try {
				throw new InvalidEmailException("enter the proper email");
		}
		catch(InvalidEmailException e) {
			e.printStackTrace();
		}}
	}
		
			
		
			
							
									
			
		}
			
		
	 
	


