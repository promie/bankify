import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount with 5% interest
        SavingsAccount savings = new SavingsAccount("789123", "Promie", 0.05);

        // Deposit money
        savings.deposit(500);

        // Apply interest (5% of 500 = 25)
        savings.applyInterest();

        // Withdraw money
        savings.withdraw(100);

        // Display account info
        System.out.println(savings.getAccountInfo());
    }
}
