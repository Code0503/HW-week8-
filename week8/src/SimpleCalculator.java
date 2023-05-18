public class SimpleCalculator {
    double firstNumber, secondNumber;

    public SimpleCalculator(double firstNumber, double secondNumber){
        this.firstNumber=firstNumber;
        this.secondNumber= secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }
    public double setFirstNumber(double firstNumber){
        return firstNumber;
    }
    public double setSecondNumber(double secondNumber){
        return secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }
    public double getSubtractionResult(){
        return secondNumber-firstNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    public double getDivisionResult(){

        if (secondNumber == 0) {

            return this.secondNumber = 0;

        } else {

            return firstNumber / secondNumber;

        }
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator(4,5.0);


        System.out.println("add=" + calculator.getAdditionResult());
        System.out.println("subtract=" +calculator.getSubtractionResult());

        System.out.println("multiply=" +calculator.getMultiplicationResult());
        System.out.println("divide=" +calculator.getDivisionResult());

    }
}
