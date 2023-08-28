package com.jspiders.multithreading.resources;

public class Account {
	private int balance;

	public  Account(int balance) {
		this.balance=balance;
	}
	
	public int checkBalance() {
		return balance;
		}
	public synchronized void deposit(int amount) {
		System.out.println("Trying to Deposit" + amount + "Rs.");
		balance += amount;
		System.out.println("Deposit Succesfully");
		System.out.println("Account Balance" + checkBalance());
	}
	
	public synchronized void withdraw(int amount) {
		System.out.println("Trying to Withdraw" + amount +"Rs.");
		if(balance>=amount) {
			balance -= amount;
			System.out.println("Withdraw Successfull. ");
			System.out.println("Account balance: " + checkBalance());
		}
		else {
			System.out.println("Insufficent Balance");
		}
	}
}
