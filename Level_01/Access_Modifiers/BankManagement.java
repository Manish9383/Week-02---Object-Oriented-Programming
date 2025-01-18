// Parent class: BankAccount
class BankAccount {
    public String accountNumber;  // Public: Accessible anywhere
    protected String accountHolder;  // Protected: Accessible within package and subclasses
    private double balance;  // Private: Accessible only within this class

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount (Inherits from BankAccount)
class SavingsAccount extends BankAccount {
    private double interestRate; // Interest rate in percentage

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("\nSavings Account Details:");
        System.out.println("Account Number: " + accountNumber);  // Public member (Accessible)
        System.out.println("Account Holder: " + accountHolder); // Protected member (Accessible in subclass)
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class
public class BankManagement {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account1 = new BankAccount("123456789", "Alice Johnson", 5000.0);
        account1.displayAccountDetails();

        // Modifying balance using deposit and withdraw methods
        account1.deposit(1000.0);
        account1.withdraw(2000.0);
        System.out.println("\nUpdated Balance: $" + account1.getBalance());

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount1 = new SavingsAccount("987654321", "Bob Williams", 8000.0, 3.5);
        savingsAccount1.displaySavingsAccountDetails();
    }
}
