import java.util.ArrayList;
import java.util.Scanner;

public class ListReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> originalList = new ArrayList<>();
        ArrayList<Integer> reversedList = new ArrayList<>();

        // 1. Fill elements into the list
        System.out.print("How many elements do you want to enter? ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            originalList.add(sc.nextInt());
        }

        // 2. Copy them in reverse order into another list
        // Iterate from the last index down to 0
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        System.out.println("Original List: " + originalList);
        System.out.println("Reversed Copy: " + reversedList);
    }
}