import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number M: ");
        int M = scanner.nextInt();

        System.out.print("Enter the number N: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i + "x" + M + "=" + (i * M));
        }

        scanner.close();
    }
}
