public class Thesis implements Resource {
  private final String title;

  public Thesis(String title) {
    this.title = title;
  }

  @Override
  public void borrow() {
    System.out.println("Borrowing thesis: " + title);
  }
}
