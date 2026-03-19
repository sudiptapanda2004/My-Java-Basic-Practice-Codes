import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        double sum = 0.0;

        // Loop to calculate sum: 1 + 1/2 + 1/3 ... + 1/n
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // 1.0 ensures floating point division
        }

        System.out.println("The sum of the harmonic series up to " + n + " is: " + sum);
    }
}