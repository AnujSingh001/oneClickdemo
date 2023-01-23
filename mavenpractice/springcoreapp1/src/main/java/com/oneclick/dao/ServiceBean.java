package com.oneclick.dao;

public class ServiceBean {

	private DAObean dbn;

	public DAObean getDbn() {
		return dbn;
	}

	public void setDbn(DAObean dbn) {
		this.dbn = dbn;
	}
	
	public void calculatedIntrest() {
		
		dbn.findAccounvt();
		
		System.out.println("Intrest is calculated in service bean class of bussiness layer");
	}
}
