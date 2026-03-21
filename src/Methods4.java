public  static int factorial (int n) {
    int f=1;
    for (int i=1; i<=n; i++) {
        f = f*i;
    }
    return f;    // factorial of n
}

void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int f = factorial(n);
        System.out.print("The factorial of "+n+" is :"+f);
}