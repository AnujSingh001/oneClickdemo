package com.masai.dao;

import com.dat4.model.Account;

public interface AccountDao {
	
	public boolean createAccount(Account account);
	
	public boolean deleteAccount(int accno);
	
	public boolean updateAccount(Account account);
	
	public Account findAccount(int accno);

}
