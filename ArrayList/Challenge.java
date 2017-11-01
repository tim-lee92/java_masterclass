import java.util.ArrayList;
import java.util.Scanner;

public class Challenge {
  private static MobilePhone mobilePhone = new MobilePhone();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    prompt();
    boolean active = true;

    while (active) {
      int option = scanner.nextInt();
      scanner.nextLine();
      switch(option) {
        case 1:
          printAllContacts();
          break;
        case 2:
          addNewContact();
          break;
        case 3:
          updateExistingContact();
          break;
        case 4:
          removeContact();
          break;
        case 5:
          active = false;
          break;
      }
    }
  }

  private static void prompt() {
    System.out.println("\n Press:");
    System.out.println("\t 1. See all contacts");
    System.out.println("\t 2. Add new contact");
    System.out.println("\t 3. Update a contact's number");
    System.out.println("\t 4. Remove a contact");
    System.out.println("\t 5. Quit");
  }

  private static void printAllContacts() {
    mobilePhone.printAllContacts();
  }

  private static void addNewContact() {
    System.out.print("Enter name of new contact: ");
    String name = scanner.nextLine();

    System.out.print("Enter phone number of new contact: ");
    String phone = scanner.nextLine();

    mobilePhone.addNewContact(name, phone);
  }

  private static void updateExistingContact() {
    System.out.print("Enter name of contact: ");
    String name = scanner.nextLine();

    System.out.print("Enter new phone number of contact: ");
    String phone = scanner.nextLine();

    mobilePhone.updateContactNumber(name, phone);
  }

  private static void removeContact() {
    System.out.print("Enter name of contact to remove: ");
    String name = scanner.nextLine();

    mobilePhone.removeContact(name);
  }
}
