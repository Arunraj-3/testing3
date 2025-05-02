package OOPs;

abstract class Bank {
    protected String accountHolder; // Fixed case of 'Protected'
    protected int currentBalance;

    public abstract void deposit(int amount); // Fixed spelling of 'deposit'

    public void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + currentBalance);
    }
}

class SavingAccount extends Bank { // Changed class name to follow naming conventions
    public SavingAccount(String accountHolder, int currentBalance) {
        this.accountHolder = accountHolder;
        this.currentBalance = currentBalance;
    }

    @Override
    public void deposit(int amount) { // Fixed method name
        currentBalance += amount;
        System.out.println("Amount deposited successfully...");
    }
}

public class AbstractExample { // Renamed class to avoid conflict with reserved keyword
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("Arvind", 10000); // Fixed capitalization
        savingAccount.deposit(50000);

        System.out.println("Bank Details:");
        savingAccount.showAccountDetails(); // Added method call to display details
    }
}
