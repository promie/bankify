package accounts;

import models.Transaction;
import models.TransactionType;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    protected String accountNumber;
    protected String ownerName;
    protected double balance;

    protected List<Transaction> transactionHistory = new ArrayList<>();

    // Constructor
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    // Deposit method
    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            transactionHistory.add(new Transaction(amount, TransactionType.DEPOSIT));
            System.out.println("$" + amount + " deposited");
            System.out.println("Your current balance is $" + this.balance);
        }else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
       if(amount <= 0) {
           System.out.println("Invalid withdrawal amount.");
           return;
       }

       if(amount > this.balance) {
           System.out.println("Invalid withdrawal amount.");
           return;
       }

       this.balance -= amount;
       transactionHistory.add(new Transaction(amount, TransactionType.WITHDRAW));
       System.out.println("Your withdrawal amount is $" + amount);
       System.out.println("Your current balance is $" + this.balance);
    }

    // Getter for balance
    public double getBalance() {
        return this.balance;
    }

    // Display account info
    public String getAccountInfo() {
        return "Owner: " + this.ownerName + " | Account: " + this.accountNumber + " | Balance: $" + this.balance;
    }

    public void printTransactionHistory() {
        System.out.println("Transaction history for " + accountNumber + ":");
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction.getSummary());
        }
    }
}
