void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n : ");
    int n = sc.nextInt();

    int count = 0;
    while (count < n) {
        System.out.print(count + "\t");
        count++;
    }
}