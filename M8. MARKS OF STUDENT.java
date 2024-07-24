import java.util.Scanner;

class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks in Python:");
        int pythonMarks = scanner.nextInt();

        System.out.println("Enter the marks in C programming:");
        int cMarks = scanner.nextInt();

        System.out.println("Enter the marks in Mathematics:");
        int mathMarks = scanner.nextInt();

        System.out.println("Enter the marks in Physics:");
        int physicsMarks = scanner.nextInt();

        scanner.close();

        int total = pythonMarks + cMarks + mathMarks + physicsMarks;
        double aggregate = total / 4.0;

        System.out.println("Total= " + total);
        System.out.println("Aggregate = " + aggregate);

        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("First Division");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("Second Division");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
    }
}
