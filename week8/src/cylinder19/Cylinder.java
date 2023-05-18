package cylinder19;

public class Cylinder extends Circle{  //class with the name Cylinderthat extends Circle class.
    double height;                             // global instance variable


    public Cylinder(double radius, double height){    //constructor with two parameter
        super(radius);                              // call the parent constructor
        this.height=height;                         // initialize a height field.
                             //In case the height parameter islessthan 0 it needsto set the height field value to 0.
    }

    public double getHeight(){        //Method without any parameters,
        return height;                //return the value
    }

    public double getVolume(){           //Method without any parameters,
        return (getArea()*height);        ////return the value
    }

    public static void main(String[] args) {        //main method

    }
}
