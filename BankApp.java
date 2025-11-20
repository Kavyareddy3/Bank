import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: " + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount + " | New Balance: " + balance);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount + " | New Balance: " + balance);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Invalid amount or Insufficient balance!");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void showTransactionHistory() {
        System.out.println("\n--- Transaction History ---");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
        System.out.println("----------------------------\n");
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, balance);

        int choice;
        do {
            System.out.println("\n------ Bank Menu ------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double with = sc.nextDouble();
                    account.withdraw(with);
                    break;

                case 3:
                    account.showBalance();
                    break;

                case 4:
                    account.showTransactionHistory();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
