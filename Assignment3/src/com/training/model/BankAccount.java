package com.training.model;

public abstract class BankAccount {
	
	//generate properties
	private double balance;
	private double minBalance;
	
	//generate constructors
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//generate parameterized constructors
    public BankAccount(double balance, double minBalance) {
		super();
		this.balance = balance;
		this.minBalance = minBalance;
	}
    
  //generating getters and setters
    public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	//abstract methods that to be implemented on the other two subclasses
	public abstract double deposit(double amount);
	public abstract double withdraw(double amount);
	
    
    
	
	
	
	
	

}
