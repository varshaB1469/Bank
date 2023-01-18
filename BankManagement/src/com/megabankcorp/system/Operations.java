package com.megabankcorp.system;

import java.util.Scanner;

import com.megabankcorp.records.Account;

abstract public class Operations {
	abstract  public double deposite(Account account) ;
	abstract  public double withdraw(Account account);
	abstract  double balance();
	
	double transfer() {
		return 0;
	}
}

class OperationsSubclass extends Operations{

	@Override
	public double deposite(Account account) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your amount to deposite.");
		double depositingAmmount = s.nextDouble();
		if(depositingAmmount>1 && depositingAmmount <= 5000) {
			double currentBal = account.getAcBalance() +  depositingAmmount;
			account.setAcBalance(currentBal);
			System.out.println("Deposite operations successfull");
		}
		else {
			System.out.println("your depositing ammount should be in between 1 and 5000.");
		}
		return account.getAcBalance();
	}

	@Override
	public double withdraw(Account account) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your amount to withdraw:");
		double withdrawingAmmount = s.nextDouble();
		if(withdrawingAmmount > 500 && withdrawingAmmount <=10000) {
			if(withdrawingAmmount < account.getAcBalance()) {
				double currentBal = account.getAcBalance() - withdrawingAmmount;
				account.setAcBalance(currentBal);
				System.out.println("Withdraw operation successfull");
				
			}else {
				System.out.println("Not sufficient account balance.");
			}
		}else {
			System.out.println("Amount should be greater than 500 and less than 5000.");
		}
		
		return withdrawingAmmount;
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