
import java.util.Scanner;
public class Pg2 {
    public static void pg() {
        int i;
        int min = 0, max = 0;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number : ");
            if (s.hasNextInt()) {
                int number = s.nextInt();
                if (number > max) {   //Declare max value
                    max = number;
                }
                if (number < max) {
                    min = number;
                }  //Declare min value
            } else {
                System.out.println("maximun number : " + max);
                System.out.println("minimum number : " + min);
                break;
            }
        }
    }

    public static void main(String[] args) {
        pg();

    }
}