package com.oneclick.module;

import javax.persistence.EntityManager;

import com.click.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em= EMUtil.provideEntityManager();
		
		
		Employee emp=new Employee();
		emp.setName("Arpit");
		
		SalariedEmployee semp=new SalariedEmployee();
		semp.setName("Ram");
		semp.setSalary(50000);
		
		ContractualEmployee cemp=new ContractualEmployee();
		cemp.setName("Robin");
		cemp.setNoOfWorkingDays(10);
		cemp.setCostOfPerDay(3000);
		
		em.getTransaction().begin();
		
		em.persist(emp);
		em.persist(semp);
		em.persist(cemp);
		
		em.getTransaction().commit();
		
		System.out.println("Done");
		em.close();
		
		

	}

}
