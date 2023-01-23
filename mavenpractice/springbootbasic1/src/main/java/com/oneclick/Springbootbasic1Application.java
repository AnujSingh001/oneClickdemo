package com.oneclick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootbasic1Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Springbootbasic1Application.class, args);
		
		A a1= ctx.getBean("a",A.class);
		
		a1.funA();
		
		
	}

}
