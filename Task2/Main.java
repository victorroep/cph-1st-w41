import java.util.ArrayList;

public class Main {
    static ArrayList<Room> rooms;
    static int numberOfLamps;
    public static void main(String[] args) {
        //2.G
        Room room = new Room(4, 2, 1, 2);
        Room room1 = new Room(4, 1, 1, 3);
        Room room2 = new Room(4, 1, 3, 4);

        //2.H
        rooms.add(room);
        rooms.add(room1);
        rooms.add(room2);

        //2.I
        Building building = new Building(rooms, 2, 2, true);

        //2.J
        for(Room _room : rooms){
            numberOfLamps += _room.getNumberOfLamps();
        }
        System.out.println("total number of lamps "+numberOfLamps);

        //2.K
        if(){
            
        }
    }
}
