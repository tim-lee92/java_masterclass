public class CharAndBoolean {
  public static void main(String[] args) {
    // width of 16 (2 bytes)
    char myChar = '\u00A9';
    System.out.println("Unicode output was: " + myChar);

    boolean trueBoolean = true;
    boolean falseBoolean = false;
    System.out.println(trueBoolean + " or " + falseBoolean);

    String myString = "100";
    int myInt = 300;
    System.out.println(myInt + myString);
  }
}
