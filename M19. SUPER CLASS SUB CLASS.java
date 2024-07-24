import java.util.Scanner;

class Superclass {
    private int num;

    public Superclass(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

class Subclass extends Superclass {

    public Subclass(int num1, int num2) {
        super(num1);
        System.out.println(num1 + ", " + num2);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        Subclass obj = new Subclass(num1, num2);

        scanner.close();
    }
}
