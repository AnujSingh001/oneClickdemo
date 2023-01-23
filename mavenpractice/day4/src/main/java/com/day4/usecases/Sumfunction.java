
package com.day4.usecases;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.day4.utility.EMUtil;

public class Sumfunction {
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="select sum(balance) from Account";
		
		TypedQuery<Long> tq= em.createQuery(jpql,Long.class);
		
		Long total= tq.getSingleResult();
		
		System.out.println(total);
		
	}

}
