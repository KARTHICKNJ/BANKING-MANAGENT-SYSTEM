package org.bank;

public class BankMain {

	public static void main(String[] args) {

		int number;
		double balance;
		String name;
		String email;
		int phoneNumber;
		Account ac = new Account(number=654326545,balance=0.0,name="Karthi",email="karthi@123gmail.com",phoneNumber=987654345);
		
		double DepositedMoney;
		ac.depositMoney(DepositedMoney=100.0);
		double withdrawMoney;
		ac.withdraw(withdrawMoney=50.0);
	}

}
