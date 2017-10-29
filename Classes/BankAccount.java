public class BankAccount {
  private int accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phone;

  public BankAccount() {
    System.out.println("Empty constructor called.");
  }

  public BankAccount(int accountNumber, double balance, String customerName, String email, String phone) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phone = phone;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void setCustomerName(String name) {
    this.customerName = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public double getBalance() {
    return this.balance;
  }

  public double depositFunds(double amount) {
    this.balance = this.balance + amount;
    return this.balance;
  }

  public double withdrawFunds(double amount) {
    if (this.balance - amount < 0) {
      System.out.println("Your account has insufficient funds.");
    } else {
      this.balance = this.balance - amount;
    }
    return this.balance;
  }
}
