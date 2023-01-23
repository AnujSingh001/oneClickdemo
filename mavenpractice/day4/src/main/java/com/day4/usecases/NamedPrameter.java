package com.day4.usecases;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.day4.utility.EMUtil;

public class NamedPrameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="update Account set balance=balance+:bal where name=:nm";
		
		Query q= em.createQuery(jpql);
		
		q.setParameter("bal", 600);
		q.setParameter("nm", "pardeep");
		
		em.getTransaction().begin();
		
		int x=q.executeUpdate();
		
		em.getTransaction().commit();
		
		System.out.println(x+"update account");
		
		em.close(); 

	}

}
