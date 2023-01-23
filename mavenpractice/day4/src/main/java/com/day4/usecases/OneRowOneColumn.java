package com.day4.usecases;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.dat4.model.Account;
import com.day4.utility.EMUtil;

public class OneRowOneColumn {
	
	public static void main(String[] args) {
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="select a.name from Account a where a.accno=:ano";
		
		TypedQuery<String> q= em.createQuery(jpql,String.class);
		
		q.setParameter("ano",4);
		
		String name=q.getSingleResult();
		
		System.out.println(name);
		
		em.close();
		
		
	}

}
