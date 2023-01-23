package com.click.module;

import javax.persistence.EntityManager;

import com.click.utility.EMUtil;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Employee emp1=new Employee();
		emp1.setEname("Amit");
		emp1.setSalary(4000);
		
		Employee emp2=new Employee();
		emp2.setEname("Suresh");
		emp2.setSalary(90000);
		
		Department dept=new Department();
		dept.setDeptname("SALES");
		dept.setLocation("DELHI");
		
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		
		
		em.getTransaction().begin();
		
		
		em.persist(dept);
		
		
		em.getTransaction().commit();
		
		System.out.println("Done...");
		
		em.close();
		
	}

}
