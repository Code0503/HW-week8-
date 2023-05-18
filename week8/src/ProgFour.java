public class ProgFour {
    public static void sumDigits(){
       int num=125;

        int sum=0;

while (num>0){
   sum=sum+ num%10;
   num=num/10;
}
        System.out.println("Sum of digits in Number: " + sum);


    }

    public static void main(String[] args) {
        sumDigits();
    }

}
