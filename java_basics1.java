import java.util.*;

public class java_basics1 {
    public static void Prob33_sumdjt (){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0 ;
        while(num != 0){
            sum += num%10;
            num /= 10 ;
        }
        System.out.print(sum);
         
    }

    public static void Prob34_hexArea(){
        Scanner sc = new Scanner(System.in);
        double Slen = sc.nextDouble(); 
        System.out.println("Area of Hexagon : " + (6 * Math.pow(Slen,2))/(4 * Math.tan((Math.PI/6))));
    }
    public static void Prob35_Area(){
        Scanner sc = new Scanner(System.in);
        double sides = sc.nextDouble();
        double Slen = sc.nextDouble(); 
        System.out.println("Area of Hexagon : " + (sides * Math.pow(Slen,2))/(4 * Math.tan((Math.PI/sides))));
    }



    public static void main(String arg[]){
    //Prob33_sumdjt();
    //Prob34_hexArea();
    //Prob35_polArea();
    }
}

