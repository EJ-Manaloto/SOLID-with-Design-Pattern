public class Book implements Resource {
  private final String title;

  public Book(String title) {
    this.title = title;
  }

  @Override
  public void borrow() {
    System.out.println("Borrowing book: " + title);
  }
}
