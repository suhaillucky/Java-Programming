import java.util.Scanner;

class FizzBuzzGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        String[] answer = generateFizzBuzz(n);

        System.out.println("Generated FizzBuzz array:");
        for (int i = 0; i < answer.length; i++) {
            System.out.println((i + 1) + ": " + answer[i]);
        }
    }

    public static String[] generateFizzBuzz(int n) {
        String[] result = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = Integer.toString(i);
            }
        }

        return result;
    }
}
