// Binary to Decimal
public static void bin_to_dec (int binNum) {
    int pow = 0;
    int decNum = 0;                 // when the loop finishes, binNum becomes 0
    int originalBinNum = binNum;    // store original value

    while (binNum>0) {
        int lastDig = binNum % 10;
        decNum = decNum + (lastDig * (int)Math.pow(2, pow));
        pow++;
        binNum = binNum / 10;
    }
/*  System.out.print("The value of "+binNum+" in Decimal system is : "+decNum);
    # The above line will print : The value of 0 in Decimal is : OUTPUT
    So we have created one other variable to store the original value of binNum -> originalBinNum, like below
 */
    System.out.print("The value of "+originalBinNum+" in Decimal system is : "+decNum);

}

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Binary value to be converted to Decimal : ");
    int binNum = sc.nextInt();
    bin_to_dec(binNum);

}