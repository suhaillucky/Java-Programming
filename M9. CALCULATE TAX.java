import java.util.Scanner;

class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the income:");
        double income = scanner.nextDouble();
        scanner.close();

        double tax = 0;

        if (income <= 150000) {
            tax = 0;
        } else if (income <= 300000) {
            tax = (income - 150000) * 0.1;
        } else if (income <= 500000) {
            tax = 15000 + (income - 300000) * 0.2;
        } else {
            tax = 45000 + (income - 500000) * 0.3;
        }

        System.out.println("Tax= " + tax);
    }
}
