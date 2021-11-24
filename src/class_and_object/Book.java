package class_and_object;

public class Book {

   String book_name;
   String writer_name;
   int num_of_pages;

    public Book() {
    }
// parameterized constructor

    public Book(String book_name, String writer_name, int num_of_pages) {
        this.book_name = book_name;
        this.writer_name = writer_name;
        this.num_of_pages = num_of_pages;
    }

    public static void main(String[] args) {

        // SYNTAX : ClassName obj_name= new ClassName();

        Book object= new Book();// Object created
        object.book_name="Java";
        object.num_of_pages=500;
        object.writer_name="Games Gosling";

        System.out.println(object.book_name);

        // SYNTAX Parameterized : ClassName obj_name= new ClassName(properties );

        Book obj=new Book("Spring","Games",1000);

        System.out.println(obj.book_name);
    }
}
