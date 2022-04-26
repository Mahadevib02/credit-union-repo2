package com.sapient.endur.model;

import java.time.LocalDate;

public class Account {
	private  Long accountNumber;
	private AccountType accountType;
	private String ownerName;
	private LocalDate openingDate;
	private double balance;
	public Account() {
		super();
	}
	public Account(Long accountNumber, AccountType accountType, String ownerName, LocalDate openingDate,
			double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.ownerName = ownerName;
		this.openingDate = openingDate;
		this.balance = balance;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public LocalDate getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
