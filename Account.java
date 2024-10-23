package org.bank;

public class Account {
	
	private long Number;
	private Double Balance;
	private String Name;
	private String Email;
	private long PhoneNumber;
	
	
	
	
	public Account(long number, Double balance, String name, String email, long phoneNumber) {
		
		this.Number = number;
		this.Balance = balance;
		this.Name = name;
		this.Email = email;
		this.PhoneNumber = phoneNumber;
	}
	
	public void depositMoney(Double DepositedMoney) {
		
		this.Balance+=DepositedMoney;
		System.out.println("Deposited Successfully, And Your New Balance is : "+this.Balance);

	}
	
	public void withdraw(Double withdrawMoney) {
		if(this.Balance-withdrawMoney<0) {
			System.out.println("Withdraw Unsuccessfull Because you have only "+this.Balance+ " in your Account");
		}
		else {
			this.Balance-=withdrawMoney;
			System.out.println("Withdraw Successfully , And your current Balance is "+this.Balance);
		}		
	}
	
	
	public void setNumber(long number) {
		Number = number;
	}
	public void setBalance(Double balance) {
		Balance = balance;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public long getNumber() {
		return Number;
	}
	public Double getBalance() {
		return Balance;
	}
	public String getName() {
		return Name;
	}
	public String getEmail() {
		return Email;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	
	

}
