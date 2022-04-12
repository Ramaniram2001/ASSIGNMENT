package com.training;
import com.training.model.Doctor;
import com.training.model.Patient;
import java.util.*;
import java.util.Map;
import com.training.model.Appointment;



public class Application {

	public static void main(String[] args) {
		
		
		Patient p1= new Patient(100,"Ram","Chennai",785667);
		Patient p2= new Patient(101,"Ramya","Coimbatore",787867);
		Patient p3= new Patient(102,"Ramani","Madurai7",3547645);
		
		Set<Patient> pat = new HashSet<Patient>();
		
		pat.add(p1);
		pat.add(p2);
		pat.add(p3);
		
		Doctor hari=new Doctor(123,"hari","Dentist",pat);
//
//  for( Patient eachPatient:hari.getPatient()) {
//		System.out.println(eachPatient);
//		System.out.println("*****************************");
//			
//	}
     	Patient p4=new Patient(104,"Anya","Salem",536);
		Patient p5=new Patient(105,"Aarthi","Madurai",789);		
		Patient p6=new Patient (106,"Anand","Ooty",8709);		
		HashSet<Patient> patientsdetails = new HashSet<>();
		patientsdetails.add(p4);
		patientsdetails.add(p5);
		patientsdetails.add(p6);

		
		
		Doctor priya=new Doctor(140,"priya","cardiologist",patientsdetails);
		
		Map<Doctor,Set<Patient>> map = new HashMap<>();
		
		map.put(hari,pat);
		map.put(priya,patientsdetails);
		Appointment   app = new Appointment(map);
		System.out.println(app.getPatients(priya));
		

	}
}
	
		
		