public class Student {

  public void borrowBook(String title) {
    System.out.println("Borrowing book: " + title); 
  }

  public void borrowJournal(String title) {
    System.out.println("Borrowing journal: " + title);
  }

  public void borrowResource(Resource resource) {
    resource.borrow();
  }
}
