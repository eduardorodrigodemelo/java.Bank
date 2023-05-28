package Program;

import Utility.Info;

public class Account {
	
	private static int counterAccount = 1;
	
	private int accountNumber;
	private People person;
	private Double balance = 0.0;
	
	
	public Account(People person) {
		this.accountNumber = counterAccount;
		this.person = person;
		counterAccount += 1;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public People getPerson() {
		return person;
	}


	public void setPerson(People person) {
		this.person = person;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public String  toString() {
		return  "\nAccount Number: " + this.getAccountNumber() +
				"\nName: " + this.person.getName() +
				"\nDocument: " + this.person.getDocument() +
				"\nEmail: " + this.person.getEmail() +
				"\nBalance: " +  Info.doubletoString(this.getBalance())+
				"\n";
				
	}
	
	public void deposit(Double value) {
		if(value > 0) {
			setBalance(getBalance() + value);
			System.out.println("Operation performed successfully");
		}
		else {
			System.out.println("operation not performed");
		}
	}
	public void withdraw(Double value) {
		if(value > 0 && this.getBalance() >= value) {
			setBalance(getBalance() - value);
			System.out.println("Operation performed successfully");
		}else {
			System.out.println("operation not performed");
		}
	}
	public void sendmoney(Account accountToBalance, Double value) {
		if (value > 0 && this.getBalance() >= value) {
			setBalance(getBalance() - value);
			accountToBalance.balance = accountToBalance.getBalance() + value;
			System.out.println("Operation performed successfully");
		}else {
			System.out.println("operation not performed");
		}
	}
}
