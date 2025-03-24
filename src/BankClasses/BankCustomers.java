package BankClasses;

import java.util.*;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<BankAccount>();

    public void addAccount(BankAccount account) {
        if (account == null) {
            System.out.println("Invalid account. Cannot add null account.");
            return;
        }
        accountsList.add(account);
        System.out.println("Account added successfully Account number: " + account.getAccountNumber());
    }

    public void showAllBalances() {
        if (accountsList.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }

        for (BankAccount account : accountsList) {
            System.out.println(String.format(
                    "Account Name: %s | Account Number: %s | Balance: %.2f",
                    account.getAccountHolderName(), account.getAccountNumber(), account.getBalance()
            ));
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account not found!");
        return null;
    }
}
