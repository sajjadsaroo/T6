# Bank Account Encapsulation Project

## Overview
This project is a simple banking system developed in Java that demonstrates the concept of encapsulation. It includes different types of bank accounts and supports operations like deposits, withdrawals, and interest calculations.

## Features
- Abstract `BankAccount` class defining a general bank account.
- `SavingAccount` class with an interest calculation feature.
- `TransactionAccount` class allowing overdrafts.
- `BankCustomers` class to manage multiple accounts.
- `Main` class for testing account operations.

## Classes & Methods
### `BankAccount` (Abstract Class)
- **Fields**:
  - `private final String accountNumber`
  - `private String accountHolderName`
  - `protected double balance`
- **Methods**:
  - `deposit(double amount)`: Adds funds to the account.
  - `withdraw(double amount)`: Deducts funds if balance is sufficient.
  - `abstract calculateInterest()`: Implemented in derived classes.
  
### `SavingAccount`
- **Fields**:
  - `private final double interestRate = 3.0`
- **Methods**:
  - `calculateInterest()`: Adds interest to the balance.

### `TransactionAccount`
- **Fields**:
  - `private final double overDraftLimit = 500`
- **Methods**:
  - `withdraw(double amount)`: Allows withdrawal up to overdraft limit.
  - `calculateInterest()`: Prints a message as no interest is applied.

### `BankCustomers`
- **Methods**:
  - `addAccount(BankAccount account)`: Adds a new account.
  - `showAllBalances()`: Displays all customer account details.
  - `findAccount(String accountNumber)`: Finds an account by number.

### `Main`
- Creates three `SavingAccount` and three `TransactionAccount` instances.
- Adds them to `BankCustomers`.
- Performs deposit, withdrawal, and interest calculations.
- Tests `findAccount()` for valid and invalid cases.

## How to Run
1. Compile all `.java` files.
2. Run `Main.java` to execute test cases.

## Example Usage
```java
BankCustomers bank = new BankCustomers();
SavingAccount sa = new SavingAccount("12345", "Sajjad", 1000);
bank.addAccount(sa);
sa.deposit(500);
sa.calculateInterest();
```
