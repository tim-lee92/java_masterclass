public class Operator {
  public static void main(String[] args) {
    double firstValue = 20;
    double secondValue = 80;
    int result = (int) (firstValue + secondValue) * 25;
    int remainder = result % 40;
    System.out.println(result);

    if (remainder <= 20) {
      System.out.println("Total was over the limit");
    }
  }
}
