import java.util.Scanner;

interface MarksInput {
    void inputMarks();
}

interface MarksCalculation {
    void calculateTotal();
    void calculateAggregate();
    void displayGrade();
}

class Student implements MarksInput, MarksCalculation {
    private int python;
    private int cProgramming;
    private int mathematics;
    private int physics;
    private int chemistry;
    private int professionalEthics;
    private int total;
    private double aggregate;
    private String grade;

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks in Python: ");
        python = scanner.nextInt();

        System.out.print("Enter the marks in C Programming: ");
        cProgramming = scanner.nextInt();

        System.out.print("Enter the marks in Mathematics: ");
        mathematics = scanner.nextInt();

        System.out.print("Enter the marks in Physics: ");
        physics = scanner.nextInt();

        System.out.print("Enter the marks in Chemistry: ");
        chemistry = scanner.nextInt();

        System.out.print("Enter the marks in Professional Ethics: ");
        professionalEthics = scanner.nextInt();
    }

    public void calculateTotal() {
        total = python + cProgramming + mathematics + physics + chemistry + professionalEthics;
    }

    public void calculateAggregate() {
        aggregate = total / 6.0;
    }

    public void displayGrade() {
        if (aggregate > 75) {
            grade = "Distinction";
        } else if (aggregate >= 60) {
            grade = "First Division";
        } else if (aggregate >= 50) {
            grade = "Second Division";
        } else if (aggregate >= 40) {
            grade = "Third Division";
        } else {
            grade = "FAIL";
        }

        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + aggregate);
        System.out.println("Class: " + grade);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.inputMarks();
        student.calculateTotal();
        student.calculateAggregate();
        student.displayGrade();
    }
}
