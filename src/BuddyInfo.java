public class BuddyInfo {
    private String name;
    private String address;
    private int phoneNumber;
    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo buddyinfo = new BuddyInfo("Tom", "home", 1234);
        System.out.println("Hello "+ buddyinfo.getName());
    }

}