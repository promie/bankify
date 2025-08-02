import accounts.BankAccount;
import accounts.SavingsAccount;
import accounts.CheckingAccount;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        // Create different types of accounts
        BankAccount regular = new BankAccount("1001", "Promie");
        SavingsAccount savings = new SavingsAccount("1002", "Patrick", 0.03);
        CheckingAccount checking = new CheckingAccount("1003", "Perry", 500);

        // Do some transactions
        regular.deposit(1000);
        savings.deposit(2000);
        savings.applyInterest();
        checking.deposit(300);
        checking.withdraw(700); // overdraft: balance -400

        // Add to list
        accounts.add(regular);
        accounts.add(savings);
        accounts.add(checking);

        // Loop through and print account info (polymorphism in action)
        System.out.println("=== All Accounts ===");
        for(BankAccount account : accounts) {
            System.out.println(account.getAccountInfo());
        }

        // Transaction histories for different accounts
        regular.printTransactionHistory();
        savings.printTransactionHistory();
        checking.printTransactionHistory();
    }
}
