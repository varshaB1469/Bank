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

	public void depositeConditions(double amount,ArrayList<Account> accArray) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter account number for deposite");
		int acno = s.nextInt();
		
		for(int i = 0 ; i < accArray.size() ; i++) {
			if(acno == accArray.get(i).getAcNumber()) {
				Operations o = new OperationsSubclass();
				o.deposite(amount,accArray.get(i));
				System.out.println("Account Number:" +accArray.get(i).getAcNumber());
				System.out.println("Account Balance:" +accArray.get(i).getAcBalance());
				
			}else {
				System.out.println("Please Enter valid accunt number");
			}
		}
	
	}

	public boolean withdrawConditions(double amount,ArrayList<Account> accArray) {
		boolean flag = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter account number for withdraw: ");
		int acno = s.nextInt();
		
		int i = 0;
		while(i < accArray.size()) {
			if(acno != accArray.get(i).getAcNumber()) {
				i++;
			}else {
				Operations o = new OperationsSubclass();
				if(o.withdraw(amount,accArray.get(i))) {
					System.out.println("Account Number:" +accArray.get(i).getAcNumber());
					System.out.println("Account Balance:" +accArray.get(i).getAcBalance());
					flag = true;
					break;
				}else {
					System.out.println("please enter valid amount");
					break;
				}
				
			}
		}
		return flag;
		
	}

	public void checkBalance(ArrayList<Account> accArray) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter account number for check balance: ");
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
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Amount");
		double am = s.nextDouble();
		if(withdrawConditions(am,accArray)) {
			depositeConditions(am,accArray);
		}else {
			System.out.println("please Enter valid amount");
		}
		
	
	}

	public void withdraw(ArrayList<Account> accArray) {
		Scanner s = new  Scanner(System.in);
		double am = s.nextDouble();
		withdrawConditions(am,accArray);
	}

	public void deposite(ArrayList<Account> accArray) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Amount");
		double am = s.nextDouble();
		depositeConditions(am,accArray);
		
		
	}
	

	
	
	

}
