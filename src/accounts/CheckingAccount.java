package accounts;

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
        System.out.println("Withdrew $" + amount + " (Overdraft allowed)");
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
