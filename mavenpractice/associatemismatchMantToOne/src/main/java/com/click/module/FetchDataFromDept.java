package com.click.module;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.click.utility.EMUtil;

public class FetchDataFromDept {
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="select emps from Department where deptname='SALES'";
		
		Query q= em.createQuery(jpql);
		
		//q.setParameter("dn", "SALES");
		
		List<Employee> allemp= q.getResultList();
		
		System.out.println(allemp);
		
		System.out.println("Done....");
		
		em.close();
	}

}
