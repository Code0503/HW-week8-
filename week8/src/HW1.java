import java.util.Scanner;
public class HW1 {
    //Read 10 numbers from the console entered by the user and print the sum of those
    //numbers.

   public static void numbers() {
       int sum=0; int x=1;
        Scanner num = new Scanner(System.in);
        while (x<=10) {
            System.out.println("Enter Numbers "+x+" :");
            if (num.hasNextInt()) {          //If hasNextInt() returnsfalse, print the message Invalid Number. Continue reading until you have read 10 numbers.
                int a = num.nextInt();
                sum += a;
                x++;
            } else {
                System.out.println("false");
            }
            num.nextLine();
        }
       System.out.println(sum);
    }

    public static void main(String[] args) {
        numbers();
    }

}

   /* public static void hasNextInt(int a, int b, int sum){
        sum=a+b;*/







