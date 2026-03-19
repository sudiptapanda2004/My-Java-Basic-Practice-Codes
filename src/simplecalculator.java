void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of A : ");
    int a = sc.nextInt();
    System.out.print("Enter the value of B : ");
    int b = sc.nextInt();
    System.out.print("Enter the operator : ");
    char operator = sc.next().charAt(0);
    switch (operator) {
        case '+' : System.out.println("The sum is : " + (a+b));
            break;
        case '-' : System.out.println("The difference is : " + (a-b));
            break;
        default : System.out.println("Error");

    }
}