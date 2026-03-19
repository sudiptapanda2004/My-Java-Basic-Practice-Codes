void main() {
    Scanner sc = new Scanner(System.in);
    do {
        System.out.print("Enter the number : ");
        int i = sc.nextInt();
        if (i%10==0){
            continue;
        }
        System.out.println("The number was : "+i);
    }while (true);
}