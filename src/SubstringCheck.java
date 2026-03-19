import java.util.Scanner;

public class SubstringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input Main String
        System.out.print("Enter the Main String: ");
        String mainStr = sc.nextLine();

        // 2. Input Sub String to search for
        System.out.print("Enter the Sub String to find: ");
        String subStr = sc.nextLine();

        // 3. Check and Display
        if (mainStr.contains(subStr)) {
            System.out.println("\nResult: YES, \"" + subStr + "\" is present in \"" + mainStr + "\"");
        } else {
            System.out.println("\nResult: NO, it is not a substring.");
        }
    }
}