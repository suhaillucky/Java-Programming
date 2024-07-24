import java.util.Scanner;

class BinaryConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String binaryString = scanner.nextLine();
        int decimalNumber = Integer.parseInt(binaryString, 2);
        String octalString = Integer.toOctalString(decimalNumber);
        System.out.println("Decimal Number: " + decimalNumber);
        System.out.println("Octal Number: " + octalString);
        scanner.close();
    }
}
