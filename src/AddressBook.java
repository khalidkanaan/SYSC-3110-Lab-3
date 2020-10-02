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
        System.out.println("Address book");
    }
}