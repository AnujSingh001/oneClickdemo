package com.oneclick;

public class Travel {

	private Vechile v;
	
	private int numberOfPerson;
	
	


//public void setNumberOfPerson(int numberOfPerson) {
//		this.numberOfPerson = numberOfPerson;
//	}
//
//
//
//	//setter injection point 
//	public void setV(Vechile v) {
//		this.v = v;
//	}

	public Travel(Vechile v, int numberOfPerson) {
		super();
		this.v = v;
		this.numberOfPerson = numberOfPerson;
	}



	public void journey() {
		v.go();
		System.out.println("journey started.......");
		System.out.println("Number of Person"+numberOfPerson);
	}













}
