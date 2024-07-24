import java.util.Arrays;
import java.util.Scanner;

class NthLargestNumber {

    public static int findNthLargest(int[] arr, int N) {
        Arrays.sort(arr);
        return arr[arr.length - N];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        int nthLargest = findNthLargest(arr, N);
        System.out.println(N + "th Largest number: " + nthLargest);
        scanner.close();
    }
}
