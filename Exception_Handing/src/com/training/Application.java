package com.training;
import com.training.model.*;

public class Application {

	public static void main(String[] args) throws InvalidEmailException {
		Customer obj= new Customer(67,"ram",6,"ramaniram2@");
		
		System.out.println("enter the email id : " + obj.getEmail());
		
		
		
	}

}
