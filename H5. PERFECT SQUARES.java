import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PerfectSquares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();

        List<Integer> perfectSquares = findPerfectSquares(lowerRange, upperRange);

        System.out.println(perfectSquares);
    }

    public static List<Integer> findPerfectSquares(int lowerRange, int upperRange) {
        List<Integer> perfectSquares = new ArrayList<>();

        for (int i = (int) Math.ceil(Math.sqrt(lowerRange)); i <= (int) Math.floor(Math.sqrt(upperRange)); i++) {
            int square = i * i;
            if (square >= lowerRange && square <= upperRange && sumOfDigits(square) < 10) {
                perfectSquares.add(square);
            }
        }

        return perfectSquares;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
