package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.Service;

public class EmployeeApp {
	
	static Employee e =  new Employee();
	
	public static void main(String[] args) {
		EmployeeService service;
		service  = new Service();
		service.getEmployeeDetails();
		service.doInsuranceScheme(e);
		service.doPrintDetailsOfEmployee();
	}
	public void getUserDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:");
		String id = sc.nextLine();
		e.setId(Integer.parseInt(id));
		System.out.println("Enter name:");
		String name = sc.nextLine();
		e.setName(name);
		//System.out.println();
		System.out.println("Enter salary:");
		String salary = sc.nextLine();
		e.setSalary(Double.parseDouble(salary));
		System.out.println("Enter designation:");
		String Designation = sc.nextLine();
		e.setDesignation(Designation);
		
	}
	public void doInsurance() {
		if(e.getSalary()<10000 && e.getDesignation().equals("manager")) {
			e.setInsuranceScheme("XYZ");
		}
		else {
			e.setInsuranceScheme("ABC");
		}
	}
	public void print() {
		System.out.println(e.getId()+"\n"+e.getName()+"\n"+e.getSalary()+"\n"+e.getDesignation());
		System.out.println("InsuranceScheme is " + e.getInsuranceScheme());
	}

}