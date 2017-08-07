package com.abes.controller;
import com.abes.model.Employee;
import com.abes.dao.*;
public class EmployeeController {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(111);
		e1.setEmpName("Tyrion");
		e1.setSalary(25000);
		
		Employee e2 = new Employee();
		e2.setEmpId(112);
		e2.setEmpName("Khaleesi");
		e2.setSalary(20000);
		
		Employee e3 = new Employee();
		e3.setEmpId(111);
		e3.setEmpName("John");
		e3.setSalary(35000);
		
		Employee e4 = new Employee();
		e3.setEmpId(111);
		e3.setEmpName("aditya");
		e3.setSalary(350000);
		
		EmpDAO e11 = new EmpDAO();
		int s=e11.required(e1);
		if(s>0){
			System.out.println("registred");
		}
		
	}

}
