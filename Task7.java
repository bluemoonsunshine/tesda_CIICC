import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        double sum = add(number1, number2);
        double difference = subtract(number1, number2);
        double product = multiply(number1, number2);
        double quotient = divide(number1, number2);

        System.out.println("\n--- Arithmetic Results ---");
        System.out.println("Addition: " + number1 + " + " + number2 + " = " + sum);
        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + difference);
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + product);
        
        if (number2 == 0) {
            System.out.println("Division: Cannot divide by zero.");
        } else {
            System.out.println("Division: " + number1 + " / " + number2 + " = " + quotient);
        }

        input.close();
    }

    public static double add(double a, double b) {
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
            return 0; 
        }
        return a / b;
    }
}
