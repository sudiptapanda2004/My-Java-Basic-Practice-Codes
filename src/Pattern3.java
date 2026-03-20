void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of lines : ");
    int n = sc.nextInt();
    for (int line=1; line<=n; line++) {
        for (int i=1; i<=line; i++) {
            System.out.print(i);
        }
        System.out.println();
    }
}