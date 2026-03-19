void main() {
    Scanner sc = new Scanner(System.in);

    do {
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n%10==0) {
        System.out.println(n + " is a multiple of 10");
        System.out.println("Exiting the loop");
          break;
        }
        System.out.println(n + " is not a multiple of 10");
    } while (true);
}