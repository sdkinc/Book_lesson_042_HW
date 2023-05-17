import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Book book3 = new Book("Bulgakov", "Master i Margarita", 300);
    Book book1 = new Book("Jules Gabriel Verne", "Vingt mille lieues sous les mers", 420);
    Book book2 = new Book("Bulgakov", "Beg", 250);


    List<Book> bookList = new ArrayList<>();
    bookList.add(book1);
    bookList.add(book2);
    bookList.add(book3);
    for (Book book : bookList
    ) {
      System.out.println(book);
    }
    bookList.sort(new BookComparator());
    System.out.println("++++++++++++++++++++++");
    for (Book book : bookList
    ) {
      System.out.println(book);
    }


  }
}
