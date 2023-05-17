import java.util.Comparator;

public class BookComparatorPagesCount implements Comparator<Book> {
  @Override
  public int compare(Book o1, Book o2) {
    if (o1.getPagesCount() != o2.getPagesCount()) {
      return -(o1.getPagesCount() - o2.getPagesCount());
    }
    return o1.getTitle().toLowerCase().compareTo(o2.getTitle().toLowerCase());
  }
}
