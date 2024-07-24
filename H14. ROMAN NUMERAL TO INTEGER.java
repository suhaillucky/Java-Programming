import java.util.Scanner;

class RomanToInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int number = 0;
        int prevValue = 0;

        for (char symbol : romanNumeral.toCharArray()) {
            int value = getValue(symbol);
            if (value < prevValue && prevValue != 0) {
                number -= prevValue;
            } else {
                number += value;
            }
            prevValue = value;
        }

        System.out.println("Integer equivalent: " + number);
    }

    public static int getValue(char symbol) {
        switch (symbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                System.out.println("Invalid Roman numeral symbol: " + symbol);
                return 0; 
        }
    }
}
