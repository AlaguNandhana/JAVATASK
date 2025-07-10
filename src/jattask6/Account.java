package jattask6;

public class Account {
	private int accNum;
	private String accHolderName;
	private double balance;
	
	public Account() {
		accNum = 0;
		accHolderName = "Unknown";
		balance =1000.0;
		
	}
	
	public Account(int accNum, String accHolderName) {
		this.accNum = accNum;
		 this.accHolderName = accHolderName;
		 balance = 1000;
		 
	}
	
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited :"+amount);
		
	}
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insuffucient Balance");	
		} else {
			balance-=amount;
	
		System.out.println("WIthdrawn :" +amount);
		}	
	}
	public void checkBalance() {
		System.out.println("Current balance:" +balance);
		
	
	}
	
	public void display() {
	    System.out.println("Account Number:" +accNum);
	    System.out.println("Account Holder Name:" +accHolderName);
	    System.out.println("Balance: "+balance);
	}
	public static void main(String[] args) {
		
		Account a1 = new Account(); 
		a1.display();
		
		a1.deposit(500.0);
		a1.withdraw(100.0);
		a1.checkBalance();
		
		Account a2 = new Account(208,"Maxwell");// Parameterized constructor
		a2.display(); 
		a2.deposit(1500.0);
		a2.withdraw(300.0);
		a2.checkBalance();
		
	
	}

}
