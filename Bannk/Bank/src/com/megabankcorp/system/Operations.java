package com.megabankcorp.system;

import java.util.Scanner;

import com.megabankcorp.records.Account;

abstract public class Operations {
	abstract  public void deposite(double amount,Account account) ;
	abstract  public boolean withdraw(double amount,Account account);
	abstract  double balance();
	
	double transfer() {
		return 0;
	}
}

class OperationsSubclass extends Operations{

	@Override
	public void deposite(double depositingAmmount, Account account) {
		if(depositingAmmount>1 && depositingAmmount <= 50000) {
			double currentBal = account.getAcBalance() +  depositingAmmount;
			account.setAcBalance(currentBal);
			System.out.println("Deposite operations successfull");
		}
		else {
			System.out.println("your depositing ammount should be in between 1 and 5000.");
		}
	}

	@Override
	public boolean withdraw(double withdrawingAmmount,Account account) {
		boolean flag = false;
		if(withdrawingAmmount >= 500 && withdrawingAmmount <=10000) {
			if(withdrawingAmmount < account.getAcBalance()) {
				double currentBal = account.getAcBalance() - withdrawingAmmount;
				account.setAcBalance(currentBal);
				System.out.println("Withdraw operation successful");
				flag = true;
			}else {
				System.out.println("Not sufficient account balance.");
			}
		}else {
			System.out.println("Amount should be greater than 500 and less than 5000.");
		}
		return flag;
		
	}
	
	
	double transfer() {
		
		
		return 0;
	}

	@Override
	double balance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}