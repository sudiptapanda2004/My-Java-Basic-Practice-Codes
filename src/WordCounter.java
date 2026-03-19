import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = sc.nextLine();

        System.out.print("Enter word to find: ");
        String word = sc.next();

        int count = 0;
        int index = text.indexOf(word);

        System.out.print("Positions found at indices: ");

        while (index != -1) {
            count++;
            System.out.print(index + " ");
            // Search for next occurrence after the current one
            index = text.indexOf(word, index + 1);
        }

        System.out.println("\nTotal occurrences: " + count);
    }
}