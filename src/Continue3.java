void main() {
    for (int i=1; i<=11; i++) {
        if (i%2==0){
            // System.out.println("All odd numbers are printed"); # gets printed after each number printed
            continue;
            /* System.out.println("All odd numbers are printed"); # this also error. Anything after continue will never
            execute, java makes it unreachable code.
             */
        }
        System.out.print(i+"\t");
        // System.out.print("All odd numbers till 10 are printed"); # this is also error
    }
    System.out.println("\n All odd numbers till 10 are printed");
}