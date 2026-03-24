package Constructor;
 class  Car{   
    String make;
    String model;
    int year;
    
    Car(String make, String model,int year ){
        if (make == null || make.isEmpty()) {
            this.make = "deafult";
            return;
        }
        if (model == null || model.isEmpty()) {
            this.model = "deafult";
            return;
        }
        if (year < 0) {
            this .year = 2000;
            return;
        }
        this.make = make;
        this.model = model ;
        this.year = year;
    }

}
public class prob7{
    public static void main(String Args[]){
        Car a1 = new Car("","" , -1);
        System.out.println(a1.make);
        System.out.println(a1.model);
        System.out.println(a1.year);
    }
}