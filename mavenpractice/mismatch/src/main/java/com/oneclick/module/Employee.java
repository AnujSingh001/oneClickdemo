package com.oneclick.module;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	private int salary;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="state", column=@Column(name="Home_State")),
		@AttributeOverride(name="city", column=@Column(name="Home_City")),
		@AttributeOverride(name="pincode", column=@Column(name="Home_Pincode")),
	})
	private Address homeaddr;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="state", column=@Column(name="Office_State")),
		@AttributeOverride(name="city", column=@Column(name="Office_City")),
		@AttributeOverride(name="pincode", column=@Column(name="Office_Pincode")),
	})
	private Address officeaddr;

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

	public Address getHomeaddr() {
		return homeaddr;
	}

	public void setHomeaddr(Address homeaddr) {
		this.homeaddr = homeaddr;
	}

	public Address getOfficeaddr() {
		return officeaddr;
	}

	public void setOfficeaddr(Address officeaddr) {
		this.officeaddr = officeaddr;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", homeaddr=" + homeaddr
				+ ", officeaddr=" + officeaddr + "]";
	}

	
	
	
}
