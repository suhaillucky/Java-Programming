import java.util.ArrayList;
import java.util.Scanner;

class PrimeCompositeCounter {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the numbers (enter 'done' to finish):");
        while (scanner.hasNextInt()) numbers.add(scanner.nextInt());
        scanner.close();

        int primeCount = 0, compositeCount = 0;
        for (int number : numbers) {
            if (isPrime(number)) primeCount++;
            else if (number > 1) compositeCount++;
        }

        System.out.println("Composite number: " + compositeCount);
        System.out.println("Prime number: " + primeCount);
    }
}