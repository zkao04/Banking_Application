package userService;

import java.util.Scanner;

public class UserService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj1 = new BankAccount("mark", "mark01");
		obj1.showMenu();
	}

}

class BankAccount {
	
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	BankAccount(String name,String ID)
	{
		customerName = name;
		customerID = ID;
		
	}
	
	void deposit(int amount){
		if(amount != 0){
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount){
		if(amount != 0){
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited: "+previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdrawn: "+Math.abs(previousTransaction));
		}
		else {
			System.out.println("Transactions Not Found");
		}
			
	}
	
	void showMenu() {
		char option='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome "+customerName);
		System.out.println("Your ID is "+customerID);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("===================================");
			System.out.println("Enter an option");
			System.out.println("===================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
				case 'A':
					System.out.println("===================================");
					System.out.println("Balance = "+balance);
					System.out.println("===================================");
					System.out.println("\n");
					break;
					
				case 'B':
					System.out.println("===================================");
					System.out.println("Enter an amount to deposit:");
					System.out.println("===================================");
					int amount = scanner.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;
					
				case 'C':
					System.out.println("===================================");
					System.out.println("Enter an amount to withdraw:");
					System.out.println("===================================");
					int amount2 = scanner.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
					
				case 'D':
					System.out.println("===================================");
					getPreviousTransaction();
					System.out.println("===================================");
					System.out.println("\n");
					break;
					
				case 'E':
					System.out.println("***********************************");
					
				default: 
					System.out.println("Invalid Option! Try again!");
					break;
			}
			
		  } while(option != 'E');
		
			System.out.println("Thank you come again!");
		}
}