package com.oneclick.module;

import javax.persistence.Entity;

@Entity
public class ContractualEmployee extends Employee {

	
	private int noOfWorkingDays;
	private int costOfPerDay;
	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}
	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}
	public int getCostOfPerDay() {
		return costOfPerDay;
	}
	public void setCostOfPerDay(int costOfPerDay) {
		this.costOfPerDay = costOfPerDay;
	}
	@Override
	public String toString() {
		return "ContractualEmployee [noOfWorkingDays=" + noOfWorkingDays + ", costOfPerDay=" + costOfPerDay + "]";
	}
	
	
	
}
