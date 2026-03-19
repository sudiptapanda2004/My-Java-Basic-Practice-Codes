// Parent Class
class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

// Child Class 1
class SBI extends Bank {
    // Overriding the method
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

// Child Class 2
class HDFC extends Bank {
    // Overriding the method
    @Override
    int getRateOfInterest() {
        return 9;
    }
}

public class OverridingTest {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest() + "%");

        b = new HDFC();
        System.out.println("HDFC Rate of Interest: " + b.getRateOfInterest() + "%");
    }
}