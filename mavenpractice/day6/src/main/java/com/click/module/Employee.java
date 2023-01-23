package com.click.module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private int salary;
	
	
	@ElementCollection(fetch = FetchType.EAGER)
	@Embedded
	@JoinTable(name="empaddress",joinColumns = @JoinColumn(name="emp_id"))
	private List<Address> addr=new ArrayList<>();
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	


	public Employee(int eid, String ename, int salary, List<Address> addr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.addr = addr;
	}




	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public List<Address> getAddr() {
		return addr;
	}


	public void setAddr(List<Address> addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", addr=" + addr + "]";
	}
	
	

}
