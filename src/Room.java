import java.util.ArrayList;

public class Room {

    private int numberOfLambs;
    private int numberOfWindows;
    private String tenant;


    Room(int numberOfLambs, int numberOfWindows, String tenant){
        setNumberOfLambs(numberOfLambs);
        setNumberOfWindows(numberOfWindows);
        setTenant(tenant);
    }
    public int getNumberOfLamps() {
        return numberOfLambs;
    }
    public void setNumberOfLambs(int numberOfLambs) {
        this.numberOfLambs = numberOfLambs;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public String getTenant() {
        return tenant;
    }
    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    @Override
    public String toString() {
        return "**********\nTenant: " + tenant + "\nNumber of lambs: " + numberOfLambs + "\nNumber of windows: " + numberOfWindows + "\n**********";
    }

}