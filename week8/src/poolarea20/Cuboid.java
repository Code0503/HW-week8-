package poolarea20;

public class Cuboid extends Rectangle{
   double height;

    public Cuboid ( double height, double width, double length){
super(width, length);
        this.height=height;

    }
    public double getHeight(){
    return height;
}
public double getVolume(){

        return (getArea()*height);
}

    public static void main(String[] args) {

    }

}
