package accounts;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double interestRate) {
        super(accountNumber, ownerName); // Call BankAccount constructor
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * this.interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + "% applied.");
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
