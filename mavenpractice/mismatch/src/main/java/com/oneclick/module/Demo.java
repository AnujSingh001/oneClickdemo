package com.oneclick.module;

import javax.persistence.EntityManager;

import com.day4.utility.EMUtil;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Employee emp=new Employee();
		
		emp.setEname("Ram");
		emp.setSalary(50000);
		
		emp.setHomeaddr(new Address("Haryana","Jind","126102"));
		emp.setOfficeaddr(new Address("Delhi","Delhi","100110"));
		
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		
		em.getTransaction().commit();
		
		System.out.println("done...");
		
		em.close();
		
	}

}
