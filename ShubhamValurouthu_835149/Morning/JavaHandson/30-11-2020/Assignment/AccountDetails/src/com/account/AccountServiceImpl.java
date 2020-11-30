package com.account;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
	
	
	List<AccountDetails> acd = new ArrayList<AccountDetails>();

	@Override
	public void add(int accountNumber, Double balance) throws Exception {
		
		int count = 0;

		for (int i = 0; i < acd.size(); i++) {
			if (acd.get(i).getAccountNumber().equals(accountNumber)) {

				count = count + 1;

				throw new Exception("AccountAlreadyException");
			}

		}
		
		if (count == 0) {

			acd.add(new AccountDetails(accountNumber, balance));
		}

	} 


	@Override
	public List<AccountDetails> findAccountByAccountNumber(int accountNumber) throws Exception {
		List<AccountDetails> account = new ArrayList<AccountDetails>();

		for (int i = 0; i < acd.size(); i++) {
			if (acd.get(i).getAccountNumber().equals(accountNumber))
				account.add(acd.get(i));
		}

		if (account.size() == 0)
			throw new Exception("AccountNotFoundException");

			 
		return account;
	}

	@Override
	public void removeAccount(int accountNumber) throws Exception {

	
		
			if (findAccountByAccountNumber(accountNumber) == null) 

				throw new Exception("AccountNotFoundException");
			 
			else {
				for (int i = 0; i < acd.size(); i++) {
					if (acd.get(i).getAccountNumber().equals(accountNumber))

					{

						acd.remove(i);
						System.out.println("Account " + accountNumber + " Removed Successfully");
					}
				}

			}

		}


	@Override
	public List<AccountDetails> displayAllAccounts() {
		
		return acd;
	}

	@Override
	public List<AccountDetails> displayAccountsHavingThBalanceLessThan1000() {

		int count = 0;
		List<AccountDetails> account = new ArrayList<AccountDetails>();
		for (int i = 0; i < acd.size(); i++) {
			if (acd.get(i).getBalance() < 1000.0) {
				count = count + 1;
				account.add(acd.get(i));
			}

		}
		if (count == 0) {
			System.out.println("no such accounts found");
		}

		return account;
	}

}
