public class PgWK11 {
    public static int getEvenDigitSum(int nuber){
        int al;
        int su=0;

        if (nuber < 0) {return -1;}
        while (nuber >0) {
            al = nuber % 10;
            if (nuber % 2 == 0)
            {
                su += al;
                nuber = nuber / 10;}
        }
        return su;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
}}
