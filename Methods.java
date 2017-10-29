public class Methods {
  public static void main(String[] args) {
    int player1Score = 1500;
    int player2Score = 900;
    int player3Score = 400;
    int player4Score = 50;

    displayHighScorePosition("Jacky", calculateHighScorePosition(player1Score));
    displayHighScorePosition("Richard", calculateHighScorePosition(player2Score));
    displayHighScorePosition("Lily", calculateHighScorePosition(player3Score));
    displayHighScorePosition("Kevin", calculateHighScorePosition(player4Score));
  }

  public static void displayHighScorePosition(String name, int position) {
    System.out.println(name + " managed to get into position " + position + " on the high score table.");
  }

  public static int calculateHighScorePosition(int score) {
    if (score >= 1000) {
      return 1;
    } else if (score >= 500 && score < 1000) {
      return 2;
    } else if (score >= 100 && score < 500) {
      return 3;
    } else {
      return 4;
    }
  }
}
