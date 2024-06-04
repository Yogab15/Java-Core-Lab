//Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount and CheckingAccount.
//Override the withdraw() method in each subclass to impose different withdrawal limits and fees.
class BankAccount {
    protected double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        // Check if withdrawal amount is less than or equal to balance
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    // Constructor to initialize balance using superclass constructor
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Method to withdraw money from savings account with a withdrawal limit
    public void withdraw(double amount) {
        // Check if withdrawal amount is within the limit and if balance is sufficient
        if (amount <= balance && amount <= 1000) {
            balance -= amount;
            System.out.println("Withdrawn from Savings Account: $" + amount);
        } else {
            System.out.println("Withdrawal amount exceeds limit or insufficient funds");
        }
    }
}

class CheckingAccount extends BankAccount {
    // Constructor to initialize balance using superclass constructor
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    // Method to withdraw money from checking account with a withdrawal fee
    public void withdraw(double amount) {
        double fee = 1.5;
        // Check if withdrawal amount plus fee is less than or equal to balance
        if (amount + fee <= balance) {
            balance -= (amount + fee);
            System.out.println("Withdrawn from Checking Account: $" + amount + " (including fee: $" + fee + ")");
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class bank {
    public static void main(String[] args) {
        // Creating instances of SavingsAccount and CheckingAccount
        SavingsAccount savingsAccount = new SavingsAccount(2500);
        CheckingAccount checkingAccount = new CheckingAccount(1600);

        // Display initial balances of accounts
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());

        // Perform transactions on savings account
        savingsAccount.deposit(500);
        savingsAccount.withdraw(600);

        // Display updated balance of savings account
        System.out.println("Savings Account Balance after transactions: $" + savingsAccount.getBalance());

        // Perform transactions on checking account
        checkingAccount.deposit(500);
        checkingAccount.withdraw(400);

        // Display updated balance of checking account
        System.out.println("Checking Account Balance after transactions: $" + checkingAccount.getBalance());
    }
}

Dry Run:
Initialization of Accounts:
Creates instances of SavingsAccount and CheckingAccount with initial balances.
Display Initial Balances:
Prints the initial balances of both accounts.
Perform Transactions on Savings Account:
Deposits $500 into the savings account.
Tries to withdraw $600 from the savings account.
Display Updated Savings Account Balance:
Prints the updated balance of the savings account after transactions.
Perform Transactions on Checking Account:
Deposits $500 into the checking account.
Withdraws $400 from the checking account.
Display Updated Checking Account Balance:
Prints the updated balance of the checking account after transactions.
