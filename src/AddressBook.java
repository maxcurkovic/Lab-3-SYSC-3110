import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddy;

    public AddressBook(){
        this.buddy = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo newBud){
        buddy.add(newBud);
    }

    public boolean removeBuddy(BuddyInfo newBud){
        return buddy.remove(newBud);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo();
        BuddyInfo thisIsOnlyaTest = new BuddyInfo();
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
