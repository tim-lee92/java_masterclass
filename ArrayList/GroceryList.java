import java.util.ArrayList;

public class GroceryList {
  // private int[] myNumbers;
  private ArrayList<String> groceryList = new ArrayList<String>();

  public ArrayList<String> getGroceryList() {
    return this.groceryList;
  }

  public String addGroceryItem(String item) {
    this.groceryList.add(item);

    return item;
  }

  public void printGroceryList() {
    System.out.println("You have " + groceryList.size() + " items in your grocery list");
    for (int i = 0; i < groceryList.size(); i++) {
      System.out.println((i + 1) + ". " + groceryList.get(i));
    }
  }

  public void modifyGroceryItem(String currentItem, String newItem) {
    int position = findItem(currentItem);

    if (position >= 0) {
      modifyGroceryItem(position, newItem);
    }
  }

  private void modifyGroceryItem(int position, String newItem) {
    this.groceryList.set(position, newItem);
    System.out.println("Grocery item " + (position + 1) + " has been modified.");
  }

  public String removeGroceryItem(String item) {
    int position = findItem(item);

    if (position >= 0) {
      removeGroceryItem(position);
    }

    return item;
  }

  private void removeGroceryItem(int position) {
    this.groceryList.remove(position);
  }

  private int findItem(String item) {
    return groceryList.indexOf(item);
  }

  public boolean onFile(String searchItem) {
    int position = findItem(searchItem);

    if (position >= 0) {
      return true;
    }

    return false;
  }
}
