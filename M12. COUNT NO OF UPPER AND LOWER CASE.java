import java.util.Scanner;

class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int uppercaseCount = 0, lowercaseCount = 0, digitCount = 0;
        char ch;

        System.out.println("Enter * to exit…");

        while (true) {
            System.out.print("Enter any character: ");
            ch = scanner.next().charAt(0);

            if (ch == '*') break;

            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        System.out.println("Total count of lower case: " + lowercaseCount);
        System.out.println("Total count of upper case: " + uppercaseCount);
        System.out.println("Total count of numbers: " + digitCount);

        scanner.close();
    }
}
