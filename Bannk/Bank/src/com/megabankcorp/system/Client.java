package com.megabankcorp.system;

import com.megabankcorp.records.Account;
import java.util.ArrayList;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BasicConditions basicConditions = new  BasicConditions();
		int key = 0;
		
		ArrayList<Account> accArray = new  ArrayList<>();
		
		do{
			System.out.println("Enter 1 for Open Your Account:");
			System.out.println("Enter 2 for deposit money into your account:");
			System.out.println("Enter 3 for withdraw money from your account:");
			System.out.println("Enter 4 for check your current balance");
			System.out.println("Enter 5 for tranfer money:");
			System.out.println("Enter 6 key for exit:");
			
			System.out.println("Enter your choice");
			key = s.nextInt();
			
			switch(key) {
				case 1: System.out.println("Open an Account");
						basicConditions.OpenAccount(accArray);
						break;
				
					
				case 2: System.out.println("Deposite Money");
						basicConditions.deposite(accArray);
						break;
						
				case 3: System.out.println("Withdraw Money");
						basicConditions.withdraw(accArray);
						break;
				
				case 4: System.out.println("Check Account Balance");
						basicConditions.checkBalance(accArray);
						break;
					
				case 5: System.out.println("Transfer Money");
						basicConditions.transferCondition(accArray);
						break;
				
				case 6: System.out.println("Exit");
						break;
				default: System.out.println("Please Enter valid number");
			}
			if(key < 0 && key > 5 ) 
				break;
		}while(true);
		
		s.close();
	}

}
