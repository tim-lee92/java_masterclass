import java.util.ArrayList;

public class MobilePhone {
  private ArrayList<Contact> contacts = new ArrayList<Contact>();

  public void printAllContacts() {
    for (int i = 0; i < this.contacts.size(); i++) {
      System.out.println((i + 1) + ". " + this.contacts.get(i).getName() + " - " + this.contacts.get(i).getPhone());
    }
  }

  public Contact findContact(String name) {
    int index = getContactIndex(name);
    return this.contacts.get(index);
  }

  public ArrayList<Contact> addNewContact(String name, String phone) {
    int index = getContactIndex(name);

    if (index == -1) {
      Contact contact = new Contact(name, phone);
      this.contacts.add(contact);
      return this.contacts;
    } else {
      System.out.println("A contact with this name already exists.");
      return null;
    }
  }

  public Contact updateContactNumber(String name, String newPhoneNumber) {
    int index = getContactIndex(name);

    if (index != -1) {
      Contact contact = this.contacts.get(index);
      contact.setPhone(newPhoneNumber);
      return contact;
    } else {
      System.out.println("Contact does not exist.");
      return null;
    }
  }

  public Contact removeContact(String name) {
    // System.out.println("This is the name we're getting in removeContact(): " + name);
    int index = getContactIndex(name);
    // System.out.println("This is the index we're getting: " + index);

    if (index >= 0) {
      Contact removedContact = this.contacts.get(index);
      this.contacts.remove(index);
      System.out.println(name + " has been removed.");
      return removedContact;
    } else {
      System.out.println("Contact does not exist.");
      return null;
    }
  }

  private int getContactIndex(String name) {
    int index = -1;

    for (int i = 0; i < this.contacts.size(); i++) {
      // System.out.println("Name in getContactIndex(): " + this.contacts.get(i).getName());
      // System.out.println("Boolean: " + this.contacts.get(i).getName() == name);
      // System.out.println(this.contacts.get(i).getName() + " and " + name);
      if (this.contacts.get(i).getName().equals(name)) {
        index = i;
      }
    }

    return index;
  }
}
