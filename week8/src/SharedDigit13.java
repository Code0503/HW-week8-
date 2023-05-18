public class SharedDigit13 {
    public static void hasSharedDigit(int a, int b) {
        if (a >= 10 && a <= 99 && b >= 10 && b <= 99 ) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }
        public static void main (String[]args){
            hasSharedDigit(12, 23);
            hasSharedDigit(9, 99);
            hasSharedDigit(15, 55);
        }
    }
