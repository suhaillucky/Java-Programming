import java.util.Scanner;

class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveSum = 0, negativeSum = 0;
        int positiveCount = 0, negativeCount = 0;
        int number;

        System.out.println("Enter -1 to exit…");

        while (true) {
            System.out.print("Enter the number: ");
            number = scanner.nextInt();

            if (number == -1) break;

            if (number > 0) {
                positiveSum += number;
                positiveCount++;
            } else if (number < 0) {
                negativeSum += number;
                negativeCount++;
            }
        }

        if (negativeCount > 0) {
            System.out.println("The average of negative numbers is: " + ((double) negativeSum / negativeCount));
        } else {
            System.out.println("No negative numbers entered.");
        }

        if (positiveCount > 0) {
            System.out.println("The average of positive numbers is: " + ((double) positiveSum / positiveCount));
        } else {
            System.out.println("No positive numbers entered.");
        }

        scanner.close();
    }
}
