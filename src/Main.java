import accounts.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "Promie");

        // Test deposit money
        account.deposit(500);

        // Test Withdrawal
        account.withdraw(250);

        // Print account info
        System.out.println(account.getAccountInfo());
    }
}