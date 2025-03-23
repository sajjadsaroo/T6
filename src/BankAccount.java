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



}
