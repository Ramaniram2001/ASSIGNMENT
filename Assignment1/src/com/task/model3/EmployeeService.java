package com.task.model3;
import com.task.model1.*;
public class EmployeeService{
	public double calculateBonus(Employee object) {
		double updatedSalary=object.getEmployeeSalary();
		double bonus=(updatedSalary)+(0.33*updatedSalary);
		return bonus;
	}
	
}
