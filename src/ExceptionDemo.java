import java.util.Scanner;

// Define custom exception
class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String message) {
        super(message);
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try {
            if (marks > 100) {
                throw new MarksOutOfBoundException("Marks cannot be greater than 100.");
            }
            System.out.println("Marks entered successfully: " + marks);
        } catch (MarksOutOfBoundException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}