public class BankAccount {
  private int accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phone;

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

  public int getBalance() {
    return this.balance;
  }

  public int depositFunds(int amount) {
    this.balance = this.balance + amount;
    return this.balance;
  }

  public int withdrawFunds(int amount) {
    if (this.balance - amount < 0) {
      System.out.println("Your account has insufficient funds.");
    } else {
      this.balance = this.balance - amount;
    }
    return this.balance;
  }
}
