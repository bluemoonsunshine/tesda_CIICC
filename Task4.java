import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String inputString = "otto";

        String reversedString = new StringBuilder(inputString).reverse().toString();

        if (inputString.equals(reversedString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
