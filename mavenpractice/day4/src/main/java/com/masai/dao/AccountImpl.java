package com.masai.dao;

import javax.persistence.EntityManager;

import com.dat4.model.Account;
import com.day4.utility.*;

public class AccountImpl implements AccountDao{

	@Override
	public boolean createAccount(Account account) {
		// TODO Auto-generated method stub
		boolean flag=false;
		EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(account);
		flag=true;
		
		em.getTransaction().commit();
		
		em.close();
		
		return flag;
	}

	@Override
	public boolean deleteAccount(int accno) {
		boolean flag=false;
		
		EntityManager em=EMUtil.provideEntityManager();
		
		Account acc=em.find(Account.class, accno);
		
		if(acc!=null) {
			em.getTransaction().begin();
			
			em.remove(acc);
			flag=true;
			
			em.getTransaction().commit();
		}
		
		return flag;
	}

	@Override
	public boolean updateAccount(Account account) {
		
		boolean flag=false;
		
		EntityManager em=EMUtil.provideEntityManager();
		
		Account acc=em.find(Account.class, account.getAccno());
		
		if(acc==null) {
			throw new IllegalArgumentException("Invalid account"); 
		}else {
		 
		em.getTransaction().begin();
		
		em.merge(account);
		flag=true;
		em.getTransaction().commit();
		
		}
		em.close();
		
		return flag;
	}

	@Override
	public Account findAccount(int accno) {
		// TODO Auto-generated method stub
		
		Account acc=null;
		EntityManager em=EMUtil.provideEntityManager();
		
		acc=em.find(Account.class, accno);
		
		
		return acc;
	}

}
