package com.day4.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.day4.utility.EMUtil;

public class fewColumeAllRow {

	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="select name,balance from Account";
		
		Query q= em.createQuery(jpql);
		
		List<Object[]>result= q.getResultList();
		
		for(Object[] oj:result) {
			String name=(String)oj[0];
			Integer balance= (Integer)oj[1];
			
			System.out.println("Name is "+name);
			System.out.println("Balance is :"+balance);
			System.out.println("==============================");
		}
	}
}
