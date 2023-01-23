package com.click.module;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import com.click.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em= EMUtil.provideEntityManager();
		
		Employee emp=em.find(Employee.class, 1);
		
		em.close(); 
		
		System.out.println(emp);
//		System.out.println(emp.getEid());
//		System.out.println(emp.getEname());
//		System.out.println(emp.getSalary());
//		
//	    List<Address> addresses=emp.getAddr();
//	    
//	    System.out.println(addresses);
	    
	    //em.close();
		
		
		
//		emp.setEname("Anuj");
//		emp.setSalary(80000);
//		
//		emp.getAddr().add(new Address("haryana","jind","126102"));
//		
//		emp.getAddr().add(new Address("Haryana","karnal","136156"));
//		
//		em.getTransaction().begin();
//		
//		em.persist(emp);
//		
//		em.getTransaction().commit();
//		
//		System.out.println("Done.....");
//		
//		em.close();
		

	}

}
