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

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited " + amount + " " + getAccountNumber());
        } else {
            System.out.println("this amount is not valid!");
        }
    }

    public void withdraw(double amount){
        if(amount > 0){
            if(amount <= balance){
                balance -= amount;
                System.out.println("Withdrawn " + amount + " " + getAccountNumber());
            } else {
                System.out.println("Insufficient funds!");
            }
        } else {
            System.out.println("this amount is not valid!");
        }
    }

}
