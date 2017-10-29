public class VipCustomer {
  String name;
  double limit;
  String email;

  public VipCustomer() {
    this("Default", 0.0, "No email");
  }

  public VipCustomer(String name, String email) {
    this(name, 0.0, email);
  }

  public VipCustomer(String name, double limit, String email) {
    this.name = name;
    this.limit = limit;
    this.email = email;
  }

  public String getName() {
    return this.name;
  }

  public double getLimit() {
    return this.limit;
  }

  public String getEmail() {
    return this.email;
  }
}
