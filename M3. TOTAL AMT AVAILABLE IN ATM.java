import java.util.Scanner;

class ATMTotalBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBalance = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Enter the " + i + "st Denomination:");
            int denomination = scanner.nextInt();
            System.out.println("Enter the " + i + "st Denomination number of notes:");
            int notes = scanner.nextInt();
            totalBalance += denomination * notes;
        }

        scanner.close();
        System.out.println("Total Available Balance in ATM: " + totalBalance);
    }
}
