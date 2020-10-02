import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        if (buddies.contains(buddy)) {
            buddies.remove(buddy);
        } else {
            System.out.println("Buddy is not in the address book.");
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "Home", "123");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
