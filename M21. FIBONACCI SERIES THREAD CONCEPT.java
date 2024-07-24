import java.util.Scanner;

class FibonacciGenerator implements Runnable {
    private int n;

    public FibonacciGenerator(int n) {
        this.n = n;
    }

    public void generateFibonacci() {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }

    @Override
    public void run() {
        generateFibonacci();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        Thread thread = new Thread(new FibonacciGenerator(n));
        thread.start();

        scanner.close();
    }
}
