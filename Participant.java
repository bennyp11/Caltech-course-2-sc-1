public class Participant {
  private String firstName;
  private String lastName;
  private String email;
  private int classes;

  public Participant(String firstName, String lastName, String email, int classes) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.classes = classes;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getClasses() {
    return classes;
  }

  public void setClasses(int classes) {
    this.classes = classes;
  }
}
