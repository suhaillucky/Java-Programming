import java.util.ArrayList;
import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        int givenNumber = scanner.nextInt();
        System.out.print("N = ");
        int N = scanner.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= givenNumber; i++) {
            if (givenNumber % i == 0) {
                factors.add(i);
            }
        }
        System.out.println("Number of factors = " + factors.size());
        if (N <= factors.size() && N > 0) {
            // Print the Nth factor
            System.out.println(N + "th factor of " + givenNumber + " = " + factors.get(N - 1));
        } else {
            System.out.println("N is out of range.");
        }
        scanner.close();
    }
}
