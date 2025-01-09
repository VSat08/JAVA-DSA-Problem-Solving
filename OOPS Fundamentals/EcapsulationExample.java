
class BankAccount {

    private final int account_number;
    private int account_balance;

    public BankAccount(int account_number, int account_balance) {
        this.account_number = account_number;
        this.account_balance = account_balance;
        System.out.println("You created a new bank account with account number: " + this.account_number);
    }

    public void displayBalance() {
        System.out.println("Your account balance is: " + this.account_balance);
    }

    public void deposit(int amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a valid amount.");

        } else {
            this.account_balance += amount;
            System.out.println(
                    "You deposited " + amount + " in your account. Your new balance is: " + this.account_balance);
        }
    }

    public void withdraw(int amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a valid amount.");

        } else if (amount > this.account_balance) {
            System.out.println("Insufficient balance. Please enter a valid amount.");

        } else {
            this.account_balance -= amount;
            System.out.println(
                    "You withdrew " + amount + " from your account. Your new balance is: " + this.account_balance);
        }
    }

}

public class EcapsulationExample {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount(4141, 100);

        myAccount.displayBalance();
        myAccount.deposit(100);
        myAccount.withdraw(150);

    }
}
