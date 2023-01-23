package com.day3.entity;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em= emf.createEntityManager();
		
		//******************UPDATE THE MARKS*************
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter roll to give the grace marks.....");
//		int roll=sc.nextInt();
//		
//		Student st= em.find(Student.class, roll);
//		
//		if(st!=null) {
//			
//			System.out.println("Enter the grace marks");
//			int marks=sc.nextInt();
//			
//			em.getTransaction().begin();
//			
//			st.setMarks(st.getMarks()+marks);
//			
//			em.getTransaction().commit();
//			
//			System.out.println("Marks is graced....");
//			
//		}else {
//			System.out.println("Student with roll no "+roll+" not found.....");
//		}
//		em.close();
//		
//		System.out.println("Done");
		
		//***********DELETE OPERATION****************
//		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter roll no. to delete....");
//		int roll=sc.nextInt();
//		Student st= em.find(Student.class,roll);
//		
//		if(st!=null) {
//			em.getTransaction().begin();
//			
//			em.remove(st);
//			
//			em.getTransaction().commit();
//			
//			System.out.println("Student removed......");
//		}else {
//			System.out.println("Student not found......");
//		}
//		
//		em.close();
//		
//		System.out.println("Done.....");
		
		//*********TO STORE THE OBJECT*****************
		
		Student st=new Student();
		st.setName("amit");
		st.setMarks(500);
		EntityTransaction et= em.getTransaction();
		
		et.begin();
		
		em.persist(st);
		
		et.commit();
		
		em.close();
		
		System.out.println("Student Saveed.....");
		
		
	//	*******GET DATA**************
//		Student st=em.find(Student.class, 13);
//		if(st!=null) {
//			System.out.println(st);
//		}else {
//			System.out.println("Record not found");
//		}
//		
//		em.close();
//		
		

	}

}
