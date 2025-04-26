public // Base class
class Account {
    String name;
    int accNumber;
    double balance;

    Account(String n, int a, double b) {
        name = n;
        accNumber = a;
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class
class SavingsAccount extends Account {
    SavingsAccount(String n, int a, double b) {
        super(n, a, b);
    }

    void addInterest() {
        double interest = balance * 0.05;  // 5% interest
        balance = balance + interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amount) {
        if (amount <= balance && amount <= 10000) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw: Limit or balance issue");
        }
    }
}

// CurrentAccount class
class CurrentAccount extends Account {
    CurrentAccount(String n, int a, double b) {
        super(n, a, b);
    }

    void withdraw(double amount) {
        if (amount <= balance + 2000) {  // 2000 overdraft
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw: Overdraft limit exceeded");
        }
    }
}

// Main class
public class BankApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Ravi", 101, 5000);
        sa.showBalance();
        sa.addInterest();
        sa.withdraw(3000);
        sa.showBalance();

        System.out.println();

        CurrentAccount ca = new CurrentAccount("Sita", 102, 2000);
        ca.showBalance();
        ca.withdraw(3500);  // overdraft use
        ca.showBalance();
    }
} 
    

