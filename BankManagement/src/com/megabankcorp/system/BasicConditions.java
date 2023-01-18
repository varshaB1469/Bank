package com.megabankcorp.system;

import java.util.ArrayList;
import java.util.Scanner;

import com.megabankcorp.records.Account;

public class BasicConditions {

	public void OpenAccount(ArrayList<Account> accArray) {
		final double initialBalance = 1000;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = s.next();	
		System.out.println("Enter your contact number:");
		int contact = s.nextInt();	
		System.out.println("Enter your opening balance:");
		double bal = s.nextDouble();
		
		if(bal < initialBalance) {
			System.out.println("Your opening balance should be more than or equal to 1000.");
		}else {
			Account a = new Account(name,contact,bal);
			accArray.add(a);
			print(accArray);
		}
	}

	private void print(ArrayList<Account> accArray) {
		for(int i = 0 ; i < accArray.size() ; i++) {
			System.out.println("index: " + accArray.get(i));
		}
		
	}

	public void depositeConditions(ArrayList<Account> accArray) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter account number for deposite");
		int acno = s.nextInt();
		
		for(int i = 0 ; i < accArray.size() ; i++) {
			if(acno == accArray.get(i).getAcNumber()) {
				Operations o = new OperationsSubclass();
//				System.out.println("Enter your amount to deposite.");
//				double amount = s.nextDouble();
				double currBal = o.deposite(accArray.get(i));
				System.out.println("Account Number:" +accArray.get(i).getAcNumber());
				System.out.println("Account Balance:" +currBal);
				
			}else {
				System.out.println("Please Enter valid accunt number");
			}
		}
		
	}

	public double withdrawConditions(ArrayList<Account> accArray) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter account number for withdraw: ");
		int acno = s.nextInt();
		double withdrawAmount = 0;
		
		for(int i = 0 ; i < accArray.size() ; i++) {
			if(acno == accArray.get(i).getAcNumber()) {
				Operations o = new OperationsSubclass();
//				System.out.println("Enter your amount for withdraw:");
//				double amount = s.nextDouble();
//				double currBal = o.withdraw(amount,accArray.get(i));
				withdrawAmount = o.withdraw(accArray.get(i));
//				System.out.println("Account Number:" +accArray.get(i).getAcNumber());
//				System.out.println("Account Balance:" +accArray.get(i).getAcBalance());
//				System.out.println("Withdrawed Amount:" +withdrawAmount);
				
			}else {
				System.out.println("Please Enter valid accunt number");
			}
		}
		
		return withdrawAmount;
		
	}

	public void checkBalance(ArrayList<Account> accArray) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter account number for withdraw: ");
		int acno = s.nextInt();
		
		for(int i = 0 ; i < accArray.size() ; i++) {
			if(acno == accArray.get(i).getAcNumber()) {
				System.out.println("Account Number:" +accArray.get(i).getAcNumber());
				System.out.println("Account Balance:" +accArray.get(i).getAcBalance());
			}else {
				System.out.println("Please enter valid account number");
			}
		}
		
	}

	public void transferCondition(ArrayList<Account> accArray) {
		double amount = withdrawConditions(accArray);
		
		
	}

	
	
	

}
