package com.oneclick;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(Appconfig.class);
		
		A a1= ctx.getBean("a",A.class);
		
		a1.funA();
	}

}
