import java.util.Scanner;
public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter digits: ");
            int num;
            num= v.nextInt();
            boolean A = false;
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                   A = true;
                    break;
                }
            }

            if (!A)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }


