void main() {
    Scanner sc = new Scanner(System.in);
    float income = sc.nextFloat();
    double tax ;
    if(income < 500000){
        tax = (double) income * (0);
    } else if (income > 500000 && income < 1000000) {
        tax = (double) income * (0.2);
    }else {
        tax = (double) income * (0.3);
    }
    System.out.println("Tax amount is : " + tax);
}