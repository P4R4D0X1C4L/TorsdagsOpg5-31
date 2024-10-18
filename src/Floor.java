import java.util.ArrayList;
import java.util.Scanner;


public class Floor {
    Room room;

    private ArrayList<Room> roomsOnFloor;
    private int lampsOnFloor;
    private int lampsInRoom;
    private int windowsOnFloor;
    private int windowsOnRoom;
    private String tenant;
    private int windowsInRoom;

    Floor() {
     this.roomsOnFloor = new ArrayList<>();

    }
/*
    Floor(int numberOfLambs, int numberOfWindows, String tenant) {
        new Room(numberOfLambs, numberOfWindows,  tenant);
    }*/

    public void addRoomFromInput(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of lambs in room: ");
        int numberOfLambs = scan.nextInt();

        System.out.print("Enter number of windows in room: ");
        int numberOfWindows = scan.nextInt();

        scan.nextLine();                                // Consume the remaining newline character                                                                                      // Consume the remaining newline character
        System.out.print("Enter tenant's name: ");
        String tenant = scan.nextLine();

        // Create a new room and add it to the list
        roomsOnFloor.add(new Room(numberOfLambs, numberOfWindows,  tenant));
        //scan.close();
    }


    public void addRoom(Room room) {
        roomsOnFloor.add(room);
    }

    // Method to display the details of each room using toString()
    public void displayRooms() {
        for (Room room : roomsOnFloor) {
            System.out.println(room);
        }
    }

    public int roomsOnFloor() {
        return roomsOnFloor.size();
    }

    // Method to get the total number of lamps on the floor
    public int lampsOnFloor() {
        int count = 0;
        for (Room room : roomsOnFloor) {
            count += room.getNumberOfLamps();
        }
        return count;
    }

    // Method to get the total number of windows on the floor
    public int windowsOnFloor() {
        int count = 0;
        for (Room room : roomsOnFloor) {
            count += room.getNumberOfWindows();
        }
        return count;
    }

    public ArrayList<Room> getRoomsOnFloor() {
        return this.roomsOnFloor;
    }

    public String getRoomsInfo(){
        String result = "";
        for (Room room : roomsOnFloor) {
            result += room.toString();
        }
        return result;
    }


}

