import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> Collection;
    public AddressBook(){
        Collection = new ArrayList<>();
    }
    void addBuddy(BuddyInfo buddy){
        Collection.add(buddy);
    }
    void removeBuddy(BuddyInfo buddy) {
        Collection.remove(buddy);
    }
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}