package com.day4.usecases;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.day4.utility.EMUtil;

public class PositionParameter {
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="update Account set balance =balance+?2 Where name=?3";
		
		Query q= em.createQuery(jpql);
		
		q.setParameter(2, 1000);
		q.setParameter(3, "Rogit");
		
		em.getTransaction().begin();
		
		int x=q.executeUpdate();
		
		em.getTransaction().commit();
		
		System.out.println(x+"record update...");
		
		em.close();
	}

}
