import java.util.ArrayList;

public class Building {
    //private int rooms;
    Floor floor;
    private ArrayList<Room> rooms;
    private ArrayList<Floor> floors;
    private int numberOfFloors = 0;

    Building(){
        floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    /*public int countLampsInBuilding() {
        int numberOfLamps = 0;
        for (Floor floor : floors) {
            numberOfLamps += floor.lampsOnFloor();
        }
        return numberOfLamps;
    }*/

    public int countWindowsInBuilding() {
        int numberOfWindows = 0;
        for (Floor floor : floors) {
            numberOfWindows += floor.windowsOnFloor();
        }
        return numberOfWindows;
    }

  /*  public void displayTenants() {
        for (Floor floor : floors) {
            for (Room room : floor.getRoomsOnFloor()) {
                System.out.println(room.getTenant());
            }
        }
    }*/

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

  /*  public int countLampsInBuilding(){
        int numberOfLamps = 0;

        for (Room room : rooms) {
            //numberOfLamps += room.countLampsInBuilding();
            rooms.add(room.countLampsInBuilding(),room);
        }
        return numberOfLamps;
    }*/

    public int getNumberOfRooms() {
        return rooms.size();
    }

    public int getNumberOfRooms(ArrayList<Floor> floors) {
        int numberOfRooms = 0;
        for (Floor i : floors) {
            numberOfRooms += i.roomsOnFloor();
        }
        return numberOfRooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public ArrayList<Floor> getFloor() {
        return floors;
    }

    public int getFloors(Building building) {
        return this.floors.size();
    }
}


