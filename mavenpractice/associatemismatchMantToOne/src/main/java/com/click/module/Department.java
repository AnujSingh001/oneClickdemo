package com.click.module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int deptid;
	private String deptname;
	private String location;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Employee emp;
	

	public int getDeptid() {
		return deptid;
	}


	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}


	public String getDeptname() {
		return deptname;
	}


	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Employee getEmp() {
		return emp;
	}


	public void setEmp(Employee emp) {
		this.emp = emp;
	}


	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", location=" + location + ", emp=" + emp
				+ "]";
	}





	
	
	
}
