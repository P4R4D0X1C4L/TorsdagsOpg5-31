import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Floor floor1 = new Floor();
        Floor floor2 = new Floor();
        Building building = new Building();

        //  Creates in instance of the datatype Room 6 adds it to the ArrayList called Floor1
        floor1.addRoomFromInput();
        floor1.addRoomFromInput();
        floor2.addRoomFromInput();

        // prints the ArrayList Floor1
        System.out.printf(floor1.getRoomsInfo());
        System.out.println("\nNumber of windows at this floor: ");
        System.out.println(countWindowsOnFloor(floor1));

        System.out.println("\nNumber of lamps at this floor: ");
        System.out.println(countLampsOnFloor(floor1));

        System.out.println(countLampsOnFloor(floor2));
    }

    public static int countLampsOnFloor(Floor floor) {
        ArrayList<Room> rooms = floor.getRoomsOnFloor();
        int count = 0;
        for (Room i : rooms){
            count += i.getNumberOfLamps();
        }
        return count;
    }

    public static int countWindowsOnFloor(Floor floor) {
        ArrayList <Room> rooms = floor.getRoomsOnFloor();
        int count = 0;
        for (Room i : rooms){
            count += i.getNumberOfWindows();
        }
        return count;
    }



}
