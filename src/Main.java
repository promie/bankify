import accounts.CheckingAccount;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount("222333", "Promie", 500);

        checking.deposit(100); // Balance: 100
        checking.withdraw(200); // Allowed (overdraft -100)
        checking.withdraw(500); // Not allowed (would go to -600)

        System.out.println(checking.getAccountInfo());
    }
}
