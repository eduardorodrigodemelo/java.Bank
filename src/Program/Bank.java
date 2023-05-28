package Program;

import java.util.ArrayList;
import java.util.Scanner;


public class Bank {
	
	static Scanner input = new Scanner(System.in);
	static ArrayList<Account> bankAccounts;
	
	public static void main(String[] args) {
		bankAccounts = new ArrayList<Account>();
		operation();
	}
	public static void operation() {
		
		System.out.println("---------------------------------------------");
		System.out.println("-------------Welcome to the Bank-------------");
		System.out.println("---------------------------------------------");
		System.out.println("-------------Choose one option --------------");
		System.out.println("---------------------------------------------");
		System.out.println("|       1 - register Account       |");
		System.out.println("|       2 - Deposit                |");
		System.out.println("|       3 - Withdraw               |");
		System.out.println("|       4 - Send                   |");
		System.out.println("|       5 - Search                 |");
		System.out.println("|       6 - Exit                   |");
		
		int operation = input.nextInt();
		
		switch(operation) {
		case 1:
			registerAccount();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withdraw();
			break;
		case 4:
			send();
			break;
		case 5:
			search();
			break;
		case 6:
			System.out.println("Good Bye");
			System.exit(0);
			
		default:
			System.out.println("Choose another option");
			operation();
			break;
			
	
		}	
		
	}
	
	public static void registerAccount() {
		System.out.println("\nName:  ");
		String name = input.next();
		
		System.out.println("\nDocument:  ");
		String document = input.next();
		
		System.out.println("\nEmail:  ");
		String email = input.next();
		
		People user = new People(name, document, email);
		
		Account account = new Account(user);
		
		bankAccounts.add(account);
		System.out.println("successful operation");
		
		operation();
			
	}
	
	private static Account searchAccount(int accountNumber) {
		Account account = null;
		if(bankAccounts.size() > 0) {
			for(Account c: bankAccounts) {
				if(c.getAccountNumber() == accountNumber);
				account = c;
			}
		}
		return account;
	}
	
	public static void deposit() {
		System.out.println("What account?");
		int accountNumber = input.nextInt();
		
		Account account = searchAccount(accountNumber);
		
		if(account != null) {
			System.out.println("How much the amount?");
			Double valueDeposit = input.nextDouble();
			account.deposit(valueDeposit);
			System.out.println("successful operation");
		}else {
			System.out.println("account not found");
		}
		operation();
	}
	
	public static void withdraw() {
		System.out.println("how the amount for withdraw?");
		int accountNumber = input.nextInt();
		
		Account account = searchAccount(accountNumber);
		
		if(account != null) {
			System.out.println("How much the amount?");
			Double valueWithdraw = input.nextDouble();
			account.withdraw(valueWithdraw);
			System.out.println("successful operation");
		}else {
			System.out.println("account not found");
		}
		operation();
	}
	
	public static void send() {
		System.out.println("Send Account Number : ");
		int sendAccountNumber = input.nextInt();
		
		Account accountReceive = searchAccount(sendAccountNumber);
		
		if(accountReceive!= null) {
			System.out.println("Amount to send:");
			Double value = input.nextDouble();
			
			accountReceive.sendmoney(accountReceive,value);
		}
		operation();
	}
	
	public static void search() {
		if(bankAccounts.size () > 0) {
			for(Account account : bankAccounts) {
				System.out.println(account);
			}
		} else {
			System.out.println("account not found");
		}
	}
}
