import java.util.Scanner;

class EmployeeBonusCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the grade of the employee (A or B):");
        String grade = scanner.nextLine();

        System.out.println("Enter the employee salary:");
        double salary = scanner.nextDouble();

        double bonus;
        if (grade.equalsIgnoreCase("A")) {
            bonus = salary * 0.05;
        } else if (grade.equalsIgnoreCase("B")) {
            bonus = salary * 0.10;
        } else {
            System.out.println("Invalid grade entered.");
            return;
        }

        if (salary < 10000) {
            bonus += salary * 0.02;
        }

        double totalSalary = salary + bonus;

        System.out.println("Salary=" + salary);
        System.out.println("Bonus=" + bonus);
        System.out.println("Total to be paid:" + totalSalary);

        scanner.close();
    }
}
