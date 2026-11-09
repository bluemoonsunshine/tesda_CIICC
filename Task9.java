import static java.lang.Math.*;

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

    public static float divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 6;

        System.out.println("--- Math Operations using Task9 ---");
        System.out.println("Addition:       " + x + " + " + y + " = " + add(x, y));
        System.out.println("Subtraction:    " + x + " - " + y + " = " + subtract(x, y));
        System.out.println("Multiplication: " + x + " * " + y + " = " + multiply(x, y));
        System.out.println("Floor Division: " + x + " / " + y + " = " + divide(x, y));
    }
}
