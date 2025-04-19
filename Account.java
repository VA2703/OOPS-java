// Account.java
public class Account {
    // Data member
    private double balance;

    // No-argument constructor (initial balance is 0)
    public Account() {
        balance = 0.0;
    }

    // Parameterized constructor (initial balance is set)
    public Account(double initialBalance) {
        if (initialBalance >= 0)
            balance = initialBalance;
        else
            balance = 0.0;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid or Insufficient balance.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using no-argument constructor
        Account acc1 = new Account();
        acc1.deposit(5000);
        acc1.withdraw(2000);
        acc1.displayBalance();

        System.out.println();

        // Using parameterized constructor
        Account acc2 = new Account(10000);
        acc2.displayBalance();
        acc2.withdraw(3000);
        acc2.deposit(1500);
        acc2.displayBalance();
    }
}

