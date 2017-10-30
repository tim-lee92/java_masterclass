import java.util.Scanner;
import java.util.Arrays;

class Array {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int[] nums = sortIntegersDescending(getIntegers(5));

    // for (int i = 0; i < nums.length; i++) {
    //   System.out.println(nums[i]);
    // }

    System.out.println(Arrays.toString(nums));
  }

  public static int[] getIntegers(int n) {
    int[] array = new int[n];

    System.out.println("Enter " + n + " integer values: \r");

    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }

    return array;
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Element " + i + " contents " + array[i]);
    }
  }

  public static int[] sortIntegersDescending(int[] array) {
    int[] result = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    boolean sorted = false;

    while (!sorted) {
      sorted = true;
      for (int i = 0; i < array.length - 1; i++) {

        if (result[i] < result[i + 1]) {
          int temp = result[i];
          result[i] = result[i + 1];
          result[i + 1] = temp;
          sorted = false;
        }
      }
    }

    return result;
  }
}
