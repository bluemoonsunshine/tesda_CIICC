import static java.lang.Math.addExact;
import static java.lang.Math.floorDiv;
import static java.lang.Math.multiplyExact;
import static java.lang.Math.subtractExact;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        // Test values
        int x = 25;
        int y = 7;

        System.out.println("--- Math Operations with Static Import ---");
        System.out.println("Inputs: x = " + x + ", y = " + y + "\n");
        
        // Demonstrate and display operations
        System.out.println("Addition:       " + x + " + " + y + " = " + add(x, y));
        System.out.println("Subtraction:    " + x + " - " + y + " = " + subtract(x, y));
        System.out.println("Multiplication: " + x + " * " + y + " = " + multiply(x, y));
        System.out.println("Floor Division: " + x + " / " + y + " = " + divide(x, y));

        int negativeX = -25;
        System.out.println("\n--- Behavior with Negative Values ---");
        System.out.println("Inputs: negativeX = " + negativeX + ", y = " + y);
        System.out.println("Floor Division: " + negativeX + " / " + y + " = " + divide(negativeX, y));
    }
}
