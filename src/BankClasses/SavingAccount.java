package BankClasses;

public class SavingAccount extends BankAccount {
    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest(){
        double temp = this.interestRate * super.balance;
        super.deposit(this.interestRate * super.balance);
        System.out.println("Saving account interest added: " + temp);
    }

}
