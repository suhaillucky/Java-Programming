import java.util.Scanner;

class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int nthPrime = findNthPrime(n);
        System.out.println(n + getOrdinalIndicator(n) + " Prime number is " + nthPrime);

        System.out.print(n + " prime numbers after " + nthPrime + " are: ");
        printNextNPrimes(nthPrime, n);
    }

    public static int findNthPrime(int n) {
        int count = 0;
        int num = 1;
        int nthPrime = 0;

        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
                nthPrime = num;
            }
        }

        return nthPrime;
    }

    public static void printNextNPrimes(int start, int n) {
        int count = 0;
        int num = start;

        while (count < n) {
            num++;
            if (isPrime(num)) {
                System.out.print(num);
                if (count < n - 1) {
                    System.out.print(", ");
                }
                count++;
            }
        }

        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static String getOrdinalIndicator(int number) {
        if (number % 100 >= 11 && number % 100 <= 13) {
            return "th";
        }
        switch (number % 10) {
            case 1: return "st";
            case 2: return "nd";
            case 3: return "rd";
            default: return "th";
        }
    }
}
