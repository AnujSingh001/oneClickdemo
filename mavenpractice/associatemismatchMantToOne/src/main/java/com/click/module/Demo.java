package com.click.module;

import javax.persistence.EntityManager;

import com.click.utility.EMUtil;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Department dept=new Department();
		dept.setDeptname("Finance");
		dept.setLocation("Delhi");
		
		Employee emp=new Employee();
		
		emp.setEname("Rudhar");
		emp.setSalary(90000);
		
		
		dept.setEmp(emp);
		emp.setDept(dept);
		
		em.getTransaction().begin();
		
		em.persist(dept);
		
		em.getTransaction().commit();
		
		System.out.println("Done...");
		
		em.close();
		
	}

}
