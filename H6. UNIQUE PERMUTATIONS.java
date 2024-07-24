import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniquePermutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Given Number: ");
        String number = scanner.nextLine();

        Set<String> permutations = generatePermutations(number);
        System.out.println("Permutations are:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    public static Set<String> generatePermutations(String str) {
        Set<String> permutations = new HashSet<>();
        if (str == null || str.length() == 0) {
            return permutations;
        }
        char[] chars = str.toCharArray();
        permute(chars, 0, permutations);
        return permutations;
    }

    private static void permute(char[] chars, int index, Set<String> permutations) {
        if (index == chars.length - 1) {
            permutations.add(new String(chars));
            return;
        }

        Set<Character> appeared = new HashSet<>();
        for (int i = index; i < chars.length; i++) {
            if (appeared.add(chars[i])) {
                swap(chars, index, i);
                permute(chars, index + 1, permutations);
                swap(chars, index, i); // backtrack
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
