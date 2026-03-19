import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get the number of strings
        System.out.print("Enter number of strings: ");
        int count = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        String[] strArray = new String[count];

        // 2. Input the strings
        System.out.println("Enter the strings one by one:");
        for (int i = 0; i < count; i++) {
            strArray[i] = sc.nextLine();
        }

        // 3. Sort the array
        Arrays.sort(strArray);

        // 4. Display result
        System.out.println("\n--- Sorted Strings ---");
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}