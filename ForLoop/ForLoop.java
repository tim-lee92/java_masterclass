public class ForLoop {
  public static void main(String[] args) {
    // System.out.println("10,000 at 2% interest = " + calculateInterest(10_000, 2));
    // System.out.println("10,000 at 3% interest = " + calculateInterest(10_000, 3));
    // System.out.println("10,000 at 4% interest = " + calculateInterest(10_000, 4));
    // System.out.println("10,000 at 5% interest = " + calculateInterest(10_000, 5));

    for (int i = 2; i <= 8; i++) {
      System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000, i)));
    }

    for (int i = 8; i >= 2; i--) {
      System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000, i)));
    }


    int numberOfPrimeNumbers = 0;

    for (int i = 1; i < 10; i++) {
      if (isPrime(i)) {
        numberOfPrimeNumbers++;
      }

      if (numberOfPrimeNumbers == 3) {
        System.out.println("The last prime number found was: " + i);
        break;
      }
    }
  }

  public static double calculateInterest(double amount, double interestRate) {
    return (amount * interestRate / 100);
  }

  public static boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }

    for (int i = 2; i <= n/2; i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }
}
