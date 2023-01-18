package com.megabankcorp.records;

public class Account{
	static int id = 101;
	
	private int acNumber;
	private String acHoolderName;
	private int acHolderContact;
	private double acBalance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Account(String acHoolderName, int acHolderContact, double acBalance) {
		super();
		this.acNumber = Account.id;
		this.acHoolderName = acHoolderName;
		this.acHolderContact = acHolderContact;
		this.acBalance = acBalance;
		
		Account.id++;
	}



	public int getAcNumber() {
		return acNumber;
	}
	public void setAcNumber(int acNumber) {
		this.acNumber = acNumber;
	}
	public String getAcHoolderName() {
		return acHoolderName;
	}
	public void setAcHoolderName(String acHoolderName) {
		this.acHoolderName = acHoolderName;
	}
	public int getAcHolderContact() {
		return acHolderContact;
	}
	public void setAcHolderContact(int acHolderContact) {
		this.acHolderContact = acHolderContact;
	}
	public double getAcBalance() {
		return acBalance;
	}
	public void setAcBalance(double acBalance) {
		this.acBalance = acBalance;
	}



	@Override
	public String toString() {
		return "Account [acNumber=" + acNumber + ", acHoolderName=" + acHoolderName + ", acHolderContact="
				+ acHolderContact + ", acBalance=" + acBalance + "]";
	}
	
	

}
