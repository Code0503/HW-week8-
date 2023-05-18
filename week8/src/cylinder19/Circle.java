package cylinder19;

import static java.lang.Math.PI;

public class Circle {
    double radius;                 //global instance variable
    public Circle(double radius){    // constructor with parameter
        this.radius=radius;       //initialize the field radius is less than 0 needs to set radius field value to 0
    }

    public double getRadius(){     // method without parameters
        return radius;
    }
    public double getArea(){
        return (radius*radius*PI);
    }

    public static void main(String[] args) {

    }
}
