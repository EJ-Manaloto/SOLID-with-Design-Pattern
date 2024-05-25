public class TestResourceBorrowing {

  public static void main(String[] args) {
    Student student = new Student();

    student.borrowResource(new Book("CICS book"));
    student.borrowResource(new Thesis("Detecting Freshness and Staleness in Vegetable: A CNN-Based Classification System for Quality Assurance"));
  }
}
