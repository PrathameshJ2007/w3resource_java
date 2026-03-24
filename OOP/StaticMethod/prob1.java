package StaticMethod;
class Counter{
    static int  count = 0;
    Counter(){
        count++;
    }
    public void showCOUNT(){
        System.out.println(count);
    }
}
public class prob1{
    public static void main(String arg[]){
        Counter c1 = new Counter();
        c1.showCOUNT();
        Counter c2 = new Counter();
        c2.showCOUNT();
        Counter c3 = new Counter();
        c3.showCOUNT();
        Counter c4 = new Counter();
        c4.showCOUNT();
        Counter c5 = new Counter();
        c5.showCOUNT();
    }
}
