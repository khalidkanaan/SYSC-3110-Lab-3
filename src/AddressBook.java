import java.util.ArrayList;

//Step 17 of Lab 3 testing code edits on github.

public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;
    public AddressBook(){
        myBuddies = new ArrayList<>();
    }
    void addBuddy(BuddyInfo buddy){
        if(buddy != null){
            myBuddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < myBuddies.size()){
            return myBuddies.remove(index);
        }
        return null;
    }

    // new random method added to branch
    void randomPrint(){
        System.out.println("This is a new branch");
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
