import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Sort strings alphabetically");
            System.out.println("2. Check for substring");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter number of strings: ");
                    int count = sc.nextInt();
                    sc.nextLine();
                    String[] strArray = new String[count];
                    System.out.println("Enter the strings:");
                    for (int i = 0; i < count; i++) strArray[i] = sc.nextLine();

                    Arrays.sort(strArray);
                    System.out.println("Sorted Strings: " + Arrays.toString(strArray));
                    break;

                case 2:
                    System.out.print("Enter Main String: ");
                    String s1 = sc.nextLine();
                    System.out.print("Enter Sub String to find: ");
                    String s2 = sc.nextLine();

                    if (s1.contains(s2)) System.out.println("'" + s2 + "' is a substring of '" + s1 + "'");
                    else System.out.println("Not a substring.");
                    break;

                case 3:
                    System.out.print("Enter a string: ");
                    String s3 = sc.nextLine();
                    System.out.println("Uppercase: " + s3.toUpperCase());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}