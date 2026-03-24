package Constructor;
class Rectangle{   
    int length;
    int width;
    Rectangle() {
        length = 0;
        width = 0;
    }
    Rectangle( Rectangle r1 ){
        this.length = r1.length;
        this.width = r1.width;
    }

}
public class prob5{
    public static void main(String Args[]){
        Rectangle r1 = new Rectangle();
        System.out.println(r1.length);
        System.out.println(r1.width);
    }
}