import java.util.Arrays;
import java.util.Scanner;

class MthMaxNthMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array of elements
        System.out.println("Enter the number of elements in the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the value of M:");
        int M = scanner.nextInt();
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();

        scanner.close();

        Arrays.sort(array);
        int MthMax = array[size - M];
        int NthMin = array[N - 1];

        int sum = MthMax + NthMin;
        int difference = MthMax - NthMin;

        System.out.println(M + "th Maximum Number = " + MthMax);
        System.out.println(N + "th Minimum Number = " + NthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
}
