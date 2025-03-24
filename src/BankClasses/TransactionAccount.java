package BankClasses;

public class TransactionAccount extends BankAccount {
    private static final double overDraftLimit = 500; // ثابت‌ها با حروف بزرگ

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("This account does not accrue interest.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (amount > getBalance() + overDraftLimit) {
            System.out.println("Insufficient funds for withdrawal.");
            return;
        }

        setBalance(getBalance() - amount);
        System.out.println("Successfully withdrawn: " + amount + " from account: " + getAccountNumber());
    }
}

