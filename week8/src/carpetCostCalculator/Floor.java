package carpetCostCalculator;

public class Floor {

    double width, length;    //two instance variables in global area

    public Floor(double width, double length){
        this.width=width;
        this.length=length;
    }
    public double getArea(){
        return width*length;
    }

    public static void main(String[] args) {

    }
}
