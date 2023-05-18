public class DiamondPg14 {
    public static void main(String[] args) {

        int n;                        // Columnar printing
        int number = 5;                       // int n;
        int m = 1;
        do {          n = 1;           // Prints the first half diamond
                                  // Inner loop 1, Prints space until ++n <= number - m + 1 is false
            do {
                System.out.print(" ");            // Print whitespace between
            }
            while (++n <= number - m + 1);         //// Condition for inside do-while loop 1
            n = 1;
                                               // Inner loop 2, Prints star until ++n <= m * 2 - 1 is false
            do {
                System.out.print("*");
            }
            while (++n <= m * 2 - 1);
            System.out.println();
        }
        while (++m <= number);
        m = number - 1;
        do {                             // Inner loop 1
            n = 1;                       // Prints space until ++n <= number - m + 1 is until false

            do {                          //// Print whitespace between
                System.out.print(" ");

            } while (++n <= number - m + 1);           // Inner loop 2
            n = 1;                                        // Prints star until ++n <= m * 2 - 1 is false
            do {
                System.out.print("*");                    // Prints star
            }
            while (++n <= m * 2 - 1);                    // By now done with one row of lower diamond
            System.out.println();                          // printing so a new line is required
        }
        while (--m > 0);                                 // Condition for outer do-while loop 2
}

}
