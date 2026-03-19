void main() {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if(age >= 26){
        System.out.println("Proper adult");
    }
    else if (age >=20) {
        System.out.println("Still young");

    } else if (age >= 18) {
        System.out.println("Just made adult");
    }
    else {
        System.out.println("Still teenager");
    }
}