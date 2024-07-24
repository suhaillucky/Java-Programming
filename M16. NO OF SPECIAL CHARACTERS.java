import java.util.Scanner;

class SpecialCharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the given statement: ");
        String statement = scanner.nextLine();
        int specialCharCount = 0;
        for (char ch : statement.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }
        System.out.println("Number of special characters: " + specialCharCount);
        scanner.close();
    }
}
