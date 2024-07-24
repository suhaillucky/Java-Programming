import java.util.Scanner;

class DecimalToBinaryOctalConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Decimal Number:");
        int decimal = scanner.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary Number = " + binary);

        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal = " + octal);

        scanner.close();
    }
}
