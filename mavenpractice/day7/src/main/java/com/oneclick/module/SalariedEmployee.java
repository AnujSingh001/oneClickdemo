package com.oneclick.module;

import javax.persistence.Entity;

@Entity
public class SalariedEmployee extends Employee {
	
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
