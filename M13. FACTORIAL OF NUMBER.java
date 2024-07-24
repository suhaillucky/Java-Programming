import java.util.Scanner;
class FactorialCalculator {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
        scanner.close();
    }
}
