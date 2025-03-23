package BankClasses;

public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    public void calculateInterest() {
        System.out.println("This account is not have interest");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= overDraftLimit + getBalance()) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + " " + getAccountNumber());
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("this amount is not valid!");
        }
    }


}
