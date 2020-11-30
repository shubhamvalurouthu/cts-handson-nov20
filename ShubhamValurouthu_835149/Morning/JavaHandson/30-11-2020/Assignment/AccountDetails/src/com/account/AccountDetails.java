package com.account;

public class AccountDetails {
	Integer accountNumber;
	Double balance;
	
	
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public AccountDetails(Integer accountNumber, Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", balance="
				+ balance + "]";
	}

	
	
	
}