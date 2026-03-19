import java.util.Scanner;

public class StringToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input String
        System.out.print("Enter a string in lowercase: ");
        String input = sc.nextLine();

        // 2. Convert to Uppercase
        String upperStr = input.toUpperCase();

        // 3. Display Result
        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + upperStr);
    }
}