package com.task;
import java.util.*;
import com.task.model.*;
import com.task.model1.*;
import com.task.model2.*;
import com.task.model3.*;

public class Application {

	public static void main(String[] args) {
		
		Customer arch = new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name ");
		String name=sc.next();
	       arch.setCustomerName(name);
	       
	       System.out.println("Enter the number");
	       int number = sc.nextInt();
	       arch.setCustomerId(number);
	       
	       System.out.println("Enter the mobile number ");
	       int mobile=sc.nextInt();
	       arch.setCustomerPhone(mobile);
	       
	       System.out.println("Enter the location ");
	       String location=sc.next();
	       arch.setLocation(location);
	       System.out.println("Customer id is " + arch.getCustomerId());
			System.out.println("Customer name is " + arch.getCustomerName());
			System.out.println("Customer mobile number is " + arch.getCustomerPhone());
			System.out.println("Customer location is " + arch.getLocation());
			
			Employee details=new Employee("aaa",66,7675);
			System.out.println("employee name is"+details.getEmployeeName());
			System.out.println("employee id is"+details.getEmployeeID());
			System.out.println("employee salary is"+details.getEmployeeSalary());
			
			Hotel del=new Hotel("Srinivasa","Bangalore",7675);
			System.out.println("hotel name is"+del.getHotelName());
			System.out.println("hotel location is"+del.getHotelLocation());
			System.out.println("hotel pincode is"+del.getPinCode());
			
			EmployeeService obj=new EmployeeService();
			System.out.println("bonus is" + obj.calculateBonus(details));
			
			
			
			
		
			
			
	       
	       
	       
	       
		sc.close();
		
		

	}

}
