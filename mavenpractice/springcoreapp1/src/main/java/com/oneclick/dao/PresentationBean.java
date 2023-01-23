package com.oneclick.dao;

public class PresentationBean {
	
	private ServiceBean sbn;

	public ServiceBean getSbn() {
		return sbn;
	}

	public void setSbn(ServiceBean sbn) {
		this.sbn = sbn;
	}
	
	public void present() {
		sbn.calculatedIntrest();
		
		System.out.println("calculated Intrest is presentation");
	}

}
