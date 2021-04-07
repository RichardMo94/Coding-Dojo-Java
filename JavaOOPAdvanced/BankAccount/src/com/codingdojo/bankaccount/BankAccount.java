package com.codingdojo.bankaccount;
import java.util.Random;

public class BankAccount {
	
	//Attributes
	private String accountNum = "";
	private Double checkingBal = 0.0;
	private Double savingsBal = 0.0;
	private static int accounts = 0;
	private static Double total = 0.0;
	
	//Constructors
	public BankAccount() {
		String accountNum = newAccountNum();
		Double checkingBal = 0.0;
		Double savingsBal = 0.0;
		accounts +=1;
		System.out.println("New user created with account number: " + accountNum + ".");
		System.out.println("Total accounts created: " + accounts + ".");		
	}
	
	public Double getCheckingBalance() {
		return checkingBal;
	}
	public Double getSavingsBalance() {
		return savingsBal;
	}

	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBal = checkingBalance;
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBal = savingsBalance;
	}

	private String newAccountNum() {
		String numberTable = "000000000";
		String randomNumber = "";
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			char num = numberTable.charAt(rand.nextInt(10));
			randomNumber += num;
		}
		accountNum = randomNumber;
		return randomNumber;	
	}
	
	public void accountDeposit(String type, Double depositAmount) {
		if(type == "checking" || type == "Checking") {
			setCheckingBalance(getCheckingBalance() + depositAmount);
			total += depositAmount;
		}
		if(type == "savings" || type == "Savings") {
			setSavingsBalance(getSavingsBalance() + depositAmount);
			total += depositAmount;
		}
		else {
			System.out.println("Please choose the right account type.");
		}	
	}
	
	public void accountWithdrawal(String type, Double withdrawalAmount) {
		if(type == "checking" || type == "Checking") {
			if(getCheckingBalance() < withdrawalAmount) {
				System.out.println("Insufficient Funds!");
			}
			else {
			setCheckingBalance(getCheckingBalance() - withdrawalAmount);
			total -= withdrawalAmount;
			}
		}
		if(type == "savings" || type == "Savings") {
			if(getSavingsBalance() < withdrawalAmount) {
				System.out.println("Insufficient Funds!");
			}
			else {
			setSavingsBalance(getSavingsBalance() - withdrawalAmount);
			total -= withdrawalAmount;
			}
		}
	}
	public Double myBalance() {
		Double totalBalance = checkingBal + savingsBal;
		System.out.println(totalBalance);
		return totalBalance;
	}
}
