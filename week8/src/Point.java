public class Point {
    int x, y;                         //global variable

    public Point(){                     //constructor no parameter no arguments

    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return this.x= x;
    }
    public int getY(){
        return this.y= y;
    }
    public int setX(int x){
        return this.x=x;
    }
    public int setY(int y){
        return this.y=y;
    }
    public double distance (){
      /*  Point A=new Point();
        Point B= new Point(x,y);
return Math.sqrt(B.x - A.x) * (B.y - A.y) + (B.y - A.y) * (B.y - A.y);*/
        return Math.sqrt((0-this.x)*(0-this.x)+(0-this.y)*(0-this.y));
    }
    public double distance (int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
    public double distance(Point second){
       return Math.sqrt((getX()-this.x)*(getX()-this.x)+(getY()-this.y)*(getY()-this.y)); }

    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0)=" +first.distance());

        System.out.println("distance(second)=" + first.distance(second));
        System.out.println("distance(2,2)=" + first.distance(2,2));

        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
