import java.util.Scanner;

class FirstNPerfectNumbers {

    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int N = scanner.nextInt();
        scanner.close();

        int count = 0;
        int num = 1;

        System.out.print("First " + N + " perfect numbers are: ");
        while (count < N) {
            if (isPerfectNumber(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
