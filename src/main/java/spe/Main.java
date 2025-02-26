package spe;
import java.util.Scanner;

public class Main {

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSimple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            double num1, num2;
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (choice) {
                case 1 -> System.out.println("Result: " + addition(num1 , num2));
                case 2 -> System.out.println("Result: " + subtract(num1 , num2));
                case 3 -> System.out.println("Result: " + multiply(num1 , num2));
                case 4 -> System.out.println("Result: " + divide(num1 , num2));
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }



}