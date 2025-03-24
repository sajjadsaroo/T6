package BankClasses;

public class Main {
    public static void main(String[] args) {

        String RESET = "\u001B[0m";
        String YELLOW = "\u001B[33m";

        BankCustomers bankCustomers = new BankCustomers();

        TransactionAccount ta_1 = new TransactionAccount("8951", "Reza MirAhmadi", 200);
        TransactionAccount ta_2 = new TransactionAccount("3952", "Mohammad MirAhmadi", 900);
        TransactionAccount ta_3 = new TransactionAccount("1234", "Saman MirAhmadi", 1600);

        SavingAccount sa_1 = new SavingAccount("6219", "Ali Rezaei", 500);
        SavingAccount sa_2 = new SavingAccount("5892", "Mahmood Rezaei", 1000);
        SavingAccount sa_3 = new SavingAccount("6791", "Reza Rezaei", 150);

        bankCustomers.addAccount(ta_1);
        bankCustomers.addAccount(ta_2);
        bankCustomers.addAccount(ta_3);
        bankCustomers.addAccount(sa_1);
        bankCustomers.addAccount(sa_2);
        bankCustomers.addAccount(sa_3);

        System.out.println(YELLOW + "Start Search test : \n" + RESET);
        BankAccount foundAccount = bankCustomers.findAccount("6219");
        if (foundAccount != null)
            System.out.println("Balance of found account: " + foundAccount.getBalance());


        BankAccount foundAccount2 = bankCustomers.findAccount("6218"); // Non-existent account
        if (foundAccount2 != null)
            System.out.println("Balance of found account: " + foundAccount2.getBalance());


        System.out.println(YELLOW + "\nEnd Search test \n" + RESET);

        System.out.println(YELLOW + "Start deposit balance test : \n" + RESET);

        System.out.println("Initial Balance: " + ta_1.getBalance());
        ta_1.deposit(1000);
        System.out.println("After Deposit: " + ta_1.getBalance());
        sa_2.deposit(-500); // Invalid deposit

        System.out.println(YELLOW + "\nEnd deposit balance test \n" + RESET);


        System.out.println(YELLOW + "Start Interest test : \n" + RESET);

        ta_3.calculateInterest(); // Should print "no interest"
        sa_3.calculateInterest(); // Should add 3% interest
        System.out.println("Transaction Account Balance: " + ta_3.getBalance());
        System.out.println("Saving Account Balance: " + sa_3.getBalance());
        System.out.println(YELLOW + "\nEnd Interest test \n" + RESET);

        System.out.println(YELLOW + "Start deposit test : \n " + RESET);

        ta_1.deposit(500);
        ta_2.deposit(-100000); // Invalid deposit

        sa_1.deposit(500);
        sa_2.deposit(-100000); // Invalid deposit

        System.out.println(YELLOW + "\nEnd deposit test \n" + RESET);

        System.out.println(YELLOW + "Start withdrawal test : \n " + RESET);

        ta_1.withdraw(300); // Valid withdrawal
        ta_2.withdraw(2000); // Should check overdraft limit
        ta_3.withdraw(-100); // Invalid amount
        sa_1.withdraw(400); // Valid withdrawal
        sa_2.withdraw(1500); // Should fail (insufficient balance)

        System.out.println(YELLOW + "\nEnd withdrawal test \n" + RESET);

        System.out.println(YELLOW + "Start show all customers test : \n" + RESET);
        bankCustomers.showAllBalances();
        System.out.println(YELLOW + "\nEnd show all customers test \n" + RESET);
    }
}
