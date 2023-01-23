package com.day4.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.day4.utility.EMUtil;

public class MultiRowOneColumne {

	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="select balance from Account";
		
		TypedQuery<Integer> q=  em.createQuery(jpql,Integer.class);
		
		List<Integer> balences= q.getResultList();
		
		System.out.println(balences);
		em.close();
	}
}
