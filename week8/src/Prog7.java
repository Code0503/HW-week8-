import java.util.Scanner;

public class Prog7
{   // int number; 1234 = 1+4=5

    public static void sumFirstAndLastDigit(int number){
        java.util.Scanner A= new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int sum=0;
        number=A.nextInt();
        int lastno =number%10;
        int firstno=0;


        while (number>0){
            firstno=number%10;
            number=number/10;
            }
        sum = firstno + lastno;
        System.out.println("Sum of first and last digit: " + sum);
    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(252);
    }
}



















