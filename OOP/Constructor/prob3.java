package Constructor;
class Book{   
    String title;
    String author;
    int price;
    Book(String title , String author) {
        this.title = title ;
        this.author = author ;
    }
    Book(String name ,String author, int price) {
        this.title = name ;
        this.price = price ;
        this.author = author ;
    }

}
public class prob3{
    public static void main(String Args[]){
        Book b1 = new Book("newboy" , "JK bhatt");
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        Book b2 = new Book("newboy" , "JK bhatt" , 852);
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);
    }
}