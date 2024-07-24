import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bank {
    private Map<String, Double> interestRates;

    public Bank() {
        interestRates = new HashMap<>();
        interestRates.put("SBI", 8.4);
        interestRates.put("ICICI", 7.3);
        interestRates.put("AXIS", 9.7);
    }

    public double getInterestRate(String bankName) {
        return interestRates.getOrDefault(bankName, 0.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Enter the bank name (SBI, ICICI, AXIS): ");
        String bankName = scanner.nextLine().toUpperCase();

        double interestRate = bank.getInterestRate(bankName);
        if (interestRate != 0.0) {
            System.out.println("Interest Rate for " + bankName + " bank is: " + interestRate + "%");
        } else {
            System.out.println("Bank not found or invalid input.");
        }

        scanner.close();
    }
}
