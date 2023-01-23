package com.click.module;

import javax.persistence.EntityManager;

import com.click.utility.EMUtil;

public class AddNewEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Department dept=em.find(Department.class, 1);
		
		Employee emp=new Employee();
		emp.setEname("bindas");
		emp.setSalary(12345);
		
		em.getTransaction().begin();
		
		//dept.getEmps().add(emp);
		
		em.getTransaction().commit();
		
		

	}

}
