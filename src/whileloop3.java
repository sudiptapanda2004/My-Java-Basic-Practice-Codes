void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of n : ");
    int n = sc.nextInt();
    int sum = 0;
    int i = 0;
    while (i <= n) {
        sum += i;
        i++;
        // System.out.println(sum);  # check this too -> inside the loop it turns into fibonacci
        // sum = sum + n;
    }
    System.out.print("The sum is : "+sum);
}