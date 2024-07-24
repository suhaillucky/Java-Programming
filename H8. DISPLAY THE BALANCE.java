import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor to initialize balance with a default value of 10000
    public BankAccount() {
        this.balance = 10000.00;
    }

    // Method to read account number, depositor name, and type of account
    public void readAccountDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the depositor name: ");
        this.depositorName = scanner.nextLine();

        System.out.print("Enter the account number: ");
        this.accountNumber = scanner.nextLine();

        System.out.print("Enter the account type (Savings/Current): ");
        this.accountType = scanner.nextLine();
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount > 0 && this.balance - amount >= 500) {
            this.balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount. Minimum balance must be Rs.500.00.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: Rs." + this.balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.readAccountDetails();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nBank Account Menu:");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting. Thank you for using the bank account system.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
