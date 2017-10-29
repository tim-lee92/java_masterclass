public class Main {
  public static void main(String[] args) {
    Car porsche = new Car();
    Car holden = new Car();

    porsche.setModel("Carrera");

    System.out.println(porsche.getModel());

    BankAccount richard = new BankAccount();
    BankAccount jacky = new BankAccount(3321, 0, "Jacky H", "jackeh@example.com", "1234567890");

    richard.setBalance(2000);
    System.out.println(richard.depositFunds(500));
    System.out.println(richard.withdrawFunds(700));
    System.out.println(richard.withdrawFunds(2000));

    VipCustomer lily = new VipCustomer("Lily", "lily@email.com");
    System.out.println("Lily has a limit of: " + String.format("%.2f", lily.getLimit()));
  }
}
