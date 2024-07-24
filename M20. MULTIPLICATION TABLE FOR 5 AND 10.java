import java.util.Scanner;

class MultiplicationTable implements Runnable {
    private int number;

    public MultiplicationTable(int number) {
        this.number = number;
    }

    public void generateTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started.");
        generateTable();
        System.out.println(Thread.currentThread().getName() + " ended.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        Thread thread1 = new Thread(new MultiplicationTable(num1));
        Thread thread2 = new Thread(new MultiplicationTable(num2));

        thread1.start();
        thread2.start();

        scanner.close();
    }
}
