package com.mayuratech.bank.bean;

public class BankUser {

	// variables which are matching to the column names
	private int id;
	private String name;
	private String accountNumber;
	private String password;
	private float balance;

	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	// constructor without parameters
	public BankUser() {
		super();

	}

	// constructor with parameters
	public BankUser(int id, String name, String accountNumber, String password, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.password = password;
		this.balance = balance;
	}
}
