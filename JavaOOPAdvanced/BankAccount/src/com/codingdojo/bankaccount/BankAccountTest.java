package com.codingdojo.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		
		BankAccount user_1 = new BankAccount();
		BankAccount user_2 = new BankAccount();
		BankAccount user_3 = new BankAccount();
		user_1.accountDeposit("Savings", 60.00);
		user_2.accountDeposit("checking", 500.00);
		user_3.accountDeposit("savings", 2000.50);
		user_1.accountWithdrawal("Checking", 70.00);
		user_2.accountWithdrawal("checking", 200.00);
		user_3.accountWithdrawal("savings", 1000.00);
		user_2.myBalance();
		user_1.myBalance();
		user_3.myBalance();
	}
}
