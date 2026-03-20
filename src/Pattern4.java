void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of lines : ");
    int n = sc.nextInt();
    System.out.print("Enter the character from which to start : ");
    char ch = sc.next().charAt(0);
    // char ch = 'A';                   # simple option

    for (int line=1; line<=n; line++) {
        for (int chars=1; chars<=line; chars++) {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}