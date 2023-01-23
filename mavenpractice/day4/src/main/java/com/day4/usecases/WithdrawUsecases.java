package com.day4.usecases;

import java.util.Scanner;

import com.dat4.model.Account;
import com.masai.dao.AccountDao;
import com.masai.dao.AccountImpl;

public class WithdrawUsecases {
	
	public static void main(String[] args) {
		
		AccountDao accdao=new AccountImpl();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter account number");
		int accno=sc.nextInt();
		
		Account acc1=accdao.findAccount(accno);
		
		if(acc1==null) {
			System.out.println("Account Does Not Exist....");
		}else {
			System.out.println("Enter the Withdraw Amount..");
			
			int amt=sc.nextInt();
			
			if(amt<=acc1.getBalance()) {
				acc1.setBalance(acc1.getBalance()-amt);
				boolean f=accdao.updateAccount(acc1);
				
				if(f) {
					System.out.println("Please collect the cash..");
				}else {
					System.out.println("Technical Error....");
				}
			}else {
				System.out.println("Insufficient Amount.....");
			}
		}
		
	}

}
