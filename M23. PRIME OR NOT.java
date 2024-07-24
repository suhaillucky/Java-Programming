import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check for prime: ");
        int number = scanner.nextInt();

        new Thread(() -> {
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(number + " is Prime");
            } else {
                System.out.println(number + " is not Prime");
            }
        }).start();

        scanner.close();
    }
}
