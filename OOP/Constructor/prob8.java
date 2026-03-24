package Constructor;
class Point{   
    double x;
    double y;
    Point(int x,int y) {
        this.x = x ;
        this.y = y ;
    }
    Point(double x , double y) {
        this.x = x ;
        this.y = y ;
    }

}
public class prob8{
    public static void main(String Args[]){
        Point b1 = new Point(1 , 2);
        System.out.println(b1.x);
        System.out.println(b1.y);

        Point b2 = new Point(1.0 , 2.0);
        System.out.println(b2.x);
        System.out.println(b2.y);
 
    }
}