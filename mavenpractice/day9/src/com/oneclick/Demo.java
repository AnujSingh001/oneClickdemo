package com.oneclick;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
		System.out.println("Object Created......");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object dies......");
	}
	
	public static void main(String[] args) {
		
		Demo d1= new Demo();
		
		d1=null;
		
		System.gc();
	}
}
