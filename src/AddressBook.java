import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;
    public AddressBook() {
        myBuddies = new ArrayList<>();
    }
    //ArrayList<BuddyInfo> addressBook = new ArrayList<>();

    public void addBuddy(BuddyInfo aBuddy) {
        if(aBuddy != null){
            myBuddies.add(aBuddy);
        }
    }
    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);
        }
        return null;
    }

    public static void main (String[] args) {
        BuddyInfo buddy2 = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy2);
        addressBook.removeBuddy(0);
        //changing the code
    }
}
//adding text to file
