// BankAccount.java
// This program demonstrates the Object-Oriented concepts of:
// - Encapsulation: using private fields and public getters/setters to protect data
// - Abstraction: exposing only essential operations (deposit, withdraw) to the user

public class BankAccount {
    // Fields are private to protect internal data (Encapsulation)
    private String accountHolder;
    private double balance;

    // Constructor to initialize account
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getter method for account holder (Encapsulation)
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter method for balance (Encapsulation)
    public double getBalance() {
        return balance;
    }

    // Method to deposit money (Abstraction)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money (Abstraction)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println(accountHolder + "'s current balance: $" + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Alice", 1000.0);
        
        myAccount.displayBalance();
        myAccount.deposit(250.0);
        myAccount.withdraw(100.0);
        myAccount.displayBalance();
    }
}

