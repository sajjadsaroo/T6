package BankClasses;

import java.util.*;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList;

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances(){
        for(BankAccount account : accountsList){
            System.out.println("Account Name: " + account.getAccountHolderName() + " Account number: " + account.getAccountNumber() + " Balance: " + account.getBalance());
        }
    }

    public BankAccount findAccount(String accountNumber){
        for(BankAccount account : accountsList){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        System.out.println("Account not found!");
        return null;
    }
}
