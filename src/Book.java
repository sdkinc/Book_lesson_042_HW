import java.util.Objects;

public class Book implements Comparable<Book> {
  private final  String author;
  private final String title;
  private final int pagesCount;

  public Book(String author, String title, int pagesCount) {
    this.author = author;
    this.title = title;
    this.pagesCount = pagesCount;
  }

  public String getAuthor() {
    return author;
  }


  public String getTitle() {
    return title;
  }


  public int getPagesCount() {
    return pagesCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Book book = (Book) o;

    if (!Objects.equals(author, book.author)) return false;
    return Objects.equals(title, book.title);
  }

  @Override
  public int hashCode() {
    int result = author != null ? author.hashCode() : 0;
    result = 31 * result + (title != null ? title.hashCode() : 0);
    return result;
  }

  @Override
  public int compareTo(Book o) {
    if (!author.equals(o.author)) {
      return author.compareTo(o.author);
    }
    return title.compareTo(o.title);
  }

  @Override
  public String toString() {
    return "Book{" +
            "author='" + author + '\'' +
            ", title='" + title + '\'' +
            ", pagesCount=" + pagesCount +
            '}';
  }
}
