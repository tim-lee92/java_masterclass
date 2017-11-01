public class Contact {
  private String name;
  private String phone;

  public Contact(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return this.name;
  }

  public Contact setPhone(String phone) {
    this.phone = phone;
    return this;
  }

  public String getPhone() {
    return this.phone;
  }
}
