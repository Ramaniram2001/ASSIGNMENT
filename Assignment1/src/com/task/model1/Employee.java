package com.task.model1;

public class Employee {
	private String employeeName;
	private int employeeID;
	private int employeeSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, int employeeID, int employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	


}
