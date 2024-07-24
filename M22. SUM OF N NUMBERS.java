import java.util.Scanner;

class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            try {
                sum += numbers[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
                break;
            }
        }
        System.out.println("Sum of the numbers is: " + sum);
        scanner.close();
    }
}
