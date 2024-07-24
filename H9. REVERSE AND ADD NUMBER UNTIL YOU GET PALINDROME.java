import java.util.Scanner;

class PalindromeGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = findPalindrome(number);

        System.out.println("Palindrome: " + result);
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }

    public static int findPalindrome(int number) {
        int iteration = 0;
        while (!isPalindrome(number)) {
            int reversed = reverseNumber(number);
            number += reversed;
            System.out.println("Iteration " + (++iteration) + ": " + number + " + " + reversed + " = " + number);
        }
        return number;
    }
}