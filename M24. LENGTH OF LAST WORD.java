import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine().trim();

        int lengthOfLastWord = s.length() - s.lastIndexOf(' ') - 1;

        System.out.println("Length of the last word: " + lengthOfLastWord);

        scanner.close();
    }
}
