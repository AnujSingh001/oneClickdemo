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

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int deptid;
	private String deptname;
	private String location;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="dept_emp",joinColumns = @JoinColumn(name="did"),inverseJoinColumns = @JoinColumn(name="eid"))
	private List<Employee> emps=new ArrayList<>();


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


	public List<Employee> getEmps() {
		return emps;
	}


	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}


	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", location=" + location + ", emps=" + emps
				+ "]";
	}
	
	
	
}
