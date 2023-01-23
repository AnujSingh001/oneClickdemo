package com.clickcapital.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeImp implements EmployeeDao {
	
	EntityManagerFactory emp=Persistence.createEntityManagerFactory("employeeUnit");
	EntityManager em=emp.createEntityManager();
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		
	em.getTransaction().begin();
	
	em.persist(emp);
	
	em.getTransaction().commit();
	
	em.close();
	
	System.out.println("New Employee Added.....");
		
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		// TODO Auto-generated method stub
		
		String address=null;
		
		Employee employee=em.find(Employee.class, empId);
		
		address=employee.getAddress();
		return address;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		// TODO Auto-generated method stub
		String bon=null;
		
		Employee employee=em.find(Employee.class, empId);
		
		if(employee!=null) {
			em.getTransaction().begin();
			
			employee.setSalary(employee.getSalary()+bonus);
			
			em.getTransaction().commit();
			
			bon=" bonse added";
			
		}else {
			bon ="Employee with empId "+empId+" not found.....";
		}
		
		return bon;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		boolean result=false;
		Employee employee=em.find(Employee.class, empId);
		
		if(employee!=null) {
			em.getTransaction().begin();
			
			em.remove(employee);
			
			em.getTransaction().commit();
			
			result=true;
		}else {
			result=false;
		}
		
		
		return result;
	}

}
