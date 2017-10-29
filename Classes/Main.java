public class Main {
  public static void main(String[] args) {
    Car porsche = new Car();
    Car holden = new Car();

    porsche.setModel("Carrera");

    System.out.println(porsche.getModel());

    BankAccount richard = new BankAccount();
    richard.setBalance(2000);
    System.out.println(richard.depositFunds(500));
    System.out.println(richard.withdrawFunds(700));
    System.out.println(richard.withdrawFunds(2000));
  }
}
