package Git;

public class Bank {
	 
	    private String accountHolderName;
	    private double balance;

	    public Bank(String accountHolderName, double initialBalance) {
	        this.accountHolderName = accountHolderName;
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        } else {
	            throw new IllegalArgumentException("Deposit amount must be positive");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount;
	        } else {
	            throw new IllegalArgumentException("Invalid withdrawal amount or insufficient balance");
	        }
	    }

	    public double checkBalance() {
	        return balance;
	    }
	
	}

