import java.util.Scanner;

class FindCommonElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        System.out.println("Enter elements for the first array (positive integers):");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
            if (arr1[i] <= 0) {
                System.out.println("Error: Only positive integers allowed. Please enter a positive integer:");
                i--; // Decrement i to re-enter the value
            }
        }

        System.out.println("Enter elements for the second array (positive integers):");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
            if (arr2[i] <= 0) {
                System.out.println("Error: Only positive integers allowed. Please enter a positive integer:");
                i--; // Decrement i to re-enter the value
            }
        }

        System.out.println("Common elements:");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
        System.out.println(); // Add newline for better output formatting
    }
}
