package com.account;

import java.util.List;

public interface AccountService {

	void add(int accountNumber, Double balance) throws Exception;

	List<AccountDetails> findAccountByAccountNumber(int accountNumber)throws Exception;

	void removeAccount(int accountNumber)throws Exception;

	List<AccountDetails> displayAllAccounts();

	List<AccountDetails> displayAccountsHavingThBalanceLessThan1000();

	
}
