package com.day4.usecases;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.day4.utility.EMUtil;

public class BulkUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="update Account set balance=balance+500";
		
		 Query q= em.createQuery(jpql);
		 
		 em.getTransaction().begin();
		 
		 int x=q.executeUpdate();
		 
		 em.getTransaction().commit();
		 
		 System.out.println(x+"row update");
		 
		 em.close();
	}

}
