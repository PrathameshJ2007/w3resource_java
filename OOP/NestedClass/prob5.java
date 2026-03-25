package NestedClass;
class Library{
    String LibraryName = "MODERN-LIBRARY";
    class Book{
        void getLibraryName(){
            System.out.print(LibraryName);
        }
    }
}
public class prob5{
    public static void main(String arg[]){
        Library L = new Library();
        Library.Book b1 = L.new Book();
        b1.getLibraryName();
    }
}