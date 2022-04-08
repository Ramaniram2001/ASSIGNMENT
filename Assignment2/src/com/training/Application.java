package com.training;
import com.training.model.Address;
import com.training.model.MobileBill;

public class Application {

	public static void main(String[] args) {
		Address add=new Address(102,"ChinmayaNumber","Temple",60093);
		MobileBill mob=new MobileBill("ram",67657865,"postpaid",add);
		System.out.println(mob.getCustomerName());
		System.out.println(mob.getMobileNumber());
		System.out.println(mob.getPlanName());
		System.out.println(mob.getAddress());
		System.out.println(MobileBill.SERVICEPROVIDER);
		System.out.println(mob.findAmount());

	}

}
