package BankClasses;

public class SavingAccount extends BankAccount {
    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest(){
        double interestAmount = this.interestRate * super.getBalance();
        super.deposit(interestAmount);
        System.out.println("Saving account interest added: " + interestAmount);
    }

}
