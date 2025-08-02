package accounts;

public class BankAccount {
    protected String accountNumber;
    protected String ownerName;
    protected double balance;

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
}
