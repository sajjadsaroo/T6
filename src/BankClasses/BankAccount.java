package BankClasses;

public abstract class BankAccount {

    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }


    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        setBalance(balance);
        setAccountHolderName(accountHolderName);
        this.accountNumber = accountNumber;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("this amount is not valid!");
            return;
        }

        balance += amount;
        System.out.println("Deposited " + amount + " to Account: " + getAccountNumber());

    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (amount > getBalance()) {
            System.out.println("Insufficient funds for withdrawal.");
            return;
        }

        setBalance(getBalance() - amount);
        System.out.println("Successfully withdrawn: " + amount + " from account: " + getAccountNumber());
    }

}
