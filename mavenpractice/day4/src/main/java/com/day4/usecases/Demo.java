package com.day4.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dat4.model.Account;
import com.day4.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="from Account where balance > 2500";
		
		Query q= em.createQuery(jpql);
		
		List<Account> ac=q.getResultList();
		
		ac.forEach(account-> System.out.println(account));
//		String jpql="select a from Account a";
//		
//		Query q= em.createQuery(jpql);
//		
//		List<Account> accounts= q.getResultList();
//		
//		accounts.forEach(account-> System.out.println(account));
//		
		em.close();
		
		

	}

}
