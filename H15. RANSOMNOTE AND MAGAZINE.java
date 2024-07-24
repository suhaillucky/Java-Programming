import java.util.HashMap;
import java.util.Scanner;

class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ransom note: ");
        String ransomNote = scanner.nextLine();

        System.out.print("Enter magazine: ");
        String magazine = scanner.nextLine();

        boolean canConstruct = canConstruct(ransomNote, magazine);

        System.out.println("Can ransom note be constructed from magazine: " + canConstruct);

        scanner.close();
    }
}
