import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
  /*
  Создайте компаратор, который позволит сортировать книги по названию, при одинаковых названиях -
  по автору (и там, и там - по алфавиту)
   */
  @Override
  public int compare(Book o1, Book o2) {
    String author1 = o1.getAuthor().toLowerCase();
    String author2 = o2.getAuthor().toLowerCase();
    if (author1.compareTo(author2)!=0) { // если авторы не одинаковы
      return author1.compareTo(author2); // сравнение авторов в алфавитном порядке
    }
    // сюда попали, только если авторы одинаковы
    // сравнение названий в алфавитном порядке
    return o1.getTitle().toLowerCase().compareTo(o2.getTitle().toLowerCase());
  }
}
