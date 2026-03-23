// Decimal to Binary
public static void dec_to_bin (int decNum) {
    int pow = 0;
    int binNum = 0;
    int originalDecNum = decNum;

    while (decNum>0) {
        int rem = decNum % 2;
        binNum = binNum + (rem * (int)Math.pow(10, pow));

        pow++;

        decNum = decNum/2;
    }
    System.out.print("The Binary value of "+originalDecNum+" is : "+binNum);
}


void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Decimal number to be converted : ");
    int decNum = sc.nextInt();
    dec_to_bin(decNum);

}