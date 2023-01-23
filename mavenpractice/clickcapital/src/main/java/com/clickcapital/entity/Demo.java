package com.clickcapital.entity;

public class Demo {
	
	public static void main(String[] args) {
		
		Employee empl=new Employee(3,"Robin","Hisar",50000);
		
		EmployeeDao emd=new EmployeeImp();
		
		boolean res=emd.deleteEmployee(5);
		System.out.println(res);
	}

}
