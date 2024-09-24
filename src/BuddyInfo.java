public class BuddyInfo {

    private String name;
    private String address;
    private int phoneNum;

    public String getName() {return name; }
    public String getAddress(String address) {return address; }
    public int getPhoneNum(int phoneNum) {return phoneNum; }

    public BuddyInfo(String name, String address, int num) {
        this.name = name;
        this.address = address;
        this.phoneNum = num;
    }  //structure. needed-yes

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Jane", "123 Street", 614);
        System.out.println("Hello " + buddy.getName());  //using the getter (what they wanted)
    }
}
