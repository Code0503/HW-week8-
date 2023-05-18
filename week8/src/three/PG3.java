package three;

import java.util.Scanner;

public class PG3 {
    public static void Vovel(){
Scanner a = new Scanner(System.in);
        {
            char ch;
            int count=0;
            char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
            Scanner v = new Scanner(System.in);

            System.out.print("Enter an Alphabet: ");
            ch = v.next().charAt(0);

            for(int i=0; i<10; i++)
            {
                if(ch==vowels[i])
                { count++;
                    break;
                }
            }

            if(count==0)
                System.out.println("\n" +ch+ " is a Consonant");
            else
                System.out.println("\n" +ch+ " is a Vowel");
}
    }

    public static void main(String[] args) {
        Vovel();
    }
    }
