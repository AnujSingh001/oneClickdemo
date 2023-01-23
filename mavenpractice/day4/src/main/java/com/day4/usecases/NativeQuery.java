package com.day4.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dat4.model.Account;
import com.day4.utility.EMUtil;

public class NativeQuery {
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String nq="select * from account";
		
		Query q= em.createNativeQuery(nq,Account.class);
		
		List<Account> acc= q.getResultList();
		
		acc.forEach(a->System.out.println(a));

}
}
