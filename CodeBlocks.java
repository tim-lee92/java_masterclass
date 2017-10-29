public class CodeBlocks {
  public static void main(String[] args) {
    // int score = 10_000;
    // int level = 8;
    // int bonus = 200;
    // boolean gameOver = true;
    //
    // if (gameOver) {
    //   int finalScore = score + (level * bonus);
    //   System.out.println("Your final score is: " + finalScore);
    // }

    System.out.println(calculateScore(10000, 8, 200, true));
    System.out.println(calculateScore(10000, 8, 200, false));
  }

  public static int calculateScore(int score, int level, int bonus, boolean gameOver) {
    // int score = 10_000;
    // int level = 8;
    // int bonus = 200;
    // boolean gameOver = true;
    int finalScore = score + (level * bonus);

    if (gameOver) {
      System.out.println("Your final score is: " + finalScore);
    } else {
      System.out.println("The game is not over yet..");
    }

    return finalScore;
  }
}
