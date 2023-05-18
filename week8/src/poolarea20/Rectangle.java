package poolarea20;
//The Swimming Company has asked you to write an application that calculatesthe volume of cuboid
//shaped pools.
public class Rectangle {
      /*1. Write a class with the name Rectangle. The class needstwo fields(instance variable) with name
    width and length both of type double.
    The class needsto have one constructor with parameters width and length both of type double and it
    needs to initialize the fields.*/
    double width,length;

    public Rectangle(double width, double length){  //one constructor with parameters width&length both double
        this.width= width;        //In case the width parameter is lessthan 0 it needs to set the width field value to 0.
        this.length=length;       //In case the length parameter islessthan 0 it needsto set the length field value to 0.
    }




    public double getWidth(){ //Method named getWidth no parameters it needsto return the value of the width field.
        return width;
    }
    public double getLength(){//Method named getLength no parameters, it needsto return the value ofthe length field.
        return length;
    }
    public double getArea(){//Method  without any parameters,needs to return the calculated area(width * length).

        return (width*length);
    }

    public static void main(String[] args) {

    }
}
