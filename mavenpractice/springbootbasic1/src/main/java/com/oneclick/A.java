package com.oneclick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
	
	@Autowired
	private B b1;
	
	public void funA() {
		System.out.println("inside the funA of class A.....");
		b1.funB();
	}

}
