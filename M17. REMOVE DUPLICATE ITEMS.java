import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        Integer[] nonDuplicateArray = set.toArray(new Integer[0]);

        System.out.println("Non-duplicate items:");
        System.out.println(Arrays.toString(nonDuplicateArray));

        scanner.close();
    }
}
