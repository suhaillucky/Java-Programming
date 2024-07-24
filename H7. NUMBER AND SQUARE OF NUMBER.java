import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class NumberSquarePairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower range: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter the upper range: ");
        int upperRange = scanner.nextInt();

        List<int[]> pairs = createNumberSquarePairs(lowerRange, upperRange);

        System.out.print("[");
        for (int i = 0; i < pairs.size(); i++) {
            int[] pair = pairs.get(i);
            System.out.print("(" + pair[0] + ", " + pair[1] + ")");
            if (i < pairs.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static List<int[]> createNumberSquarePairs(int lowerRange, int upperRange) {
        List<int[]> pairs = new ArrayList<>();
        for (int i = lowerRange; i <= upperRange; i++) {
            pairs.add(new int[]{i, i * i});
        }
        return pairs;
    }
}
