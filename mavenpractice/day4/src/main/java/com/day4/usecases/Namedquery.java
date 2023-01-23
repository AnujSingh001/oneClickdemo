package com.day4.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dat4.model.Account;
import com.day4.utility.EMUtil;

public class Namedquery {
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Query nq= em.createNamedQuery("Account.getBalance");
		
		nq.setParameter("bal", 5000);
		
		List<Account> accounts= nq.getResultList();
		
		for(Account acc:accounts) {
			System.out.println(acc);
		}
		
	}

}
