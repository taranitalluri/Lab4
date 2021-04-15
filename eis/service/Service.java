package com.cg.eis.service;

import com.cg.eis.bean.*;
import com.cg.eis.pl.*;

public class Service implements EmployeeService{
	EmployeeApp employee=new EmployeeApp();
	Employee e = new Employee();
	@Override
	public void getEmployeeDetails() {
		
		employee.getUserDetails();
	}

	@Override
	public void doInsuranceScheme(Employee e1) {
		//if(e.getSalary()<20000) {
			//e.setInsuranceScheme("XYZ");
		//}
		//else {
			//e.setInsuranceScheme("ABC");
		//}
		System.out.println(e.getSalary());
	}

	@Override
	public void doPrintDetailsOfEmployee() {
		employee.print();
	}

	//@Override
	//public void doPrintDetailsOfEmployees(Employee e) {
		
		//System.out.println(e.getId()+"\n"+e.getName()+"\n"+e.getSalary()+"\n"+e.getDesignation());
		
	//}

}