package com.oneclick;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Travel obj= ctx.getBean("tvr1",Travel.class);
		
		obj.journey();
		
		

	}

}
