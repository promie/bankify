package accounts;

import models.Transaction;
import models.TransactionType;

public class CheckingAccount extends BankAccount {
    private final double overdraftLimit;

    public CheckingAccount(String accountNumber, String ownerName, double overdraftLimit){
        super(accountNumber, ownerName);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if(balance - amount < -overdraftLimit) {
            System.out.println("Overdraft limit exceeded.");
            return;
        }

        balance -= amount;
        // Determine transaction type
        TransactionType type = balance < 0 ? TransactionType.OVERDRAFT : TransactionType.WITHDRAW;
        transactionHistory.add(new Transaction(amount, type));
        System.out.println("Withdrew $" + amount + " (Overdraft allowed)");
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
