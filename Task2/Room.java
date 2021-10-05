import java.util.ArrayList;

//2.A
public class Room {
    private int walls;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    //2.B
    public Room(int _walls, int _numberOfDoors, int _numberOfLamps, int _numberOfWindows){
        this.walls = _walls;
        this.numberOfDoors = _numberOfDoors;
        this.numberOfLamps = _numberOfLamps;
        this.numberOfWindows = _numberOfWindows;
    }

    //2.C
    public int getWalls(){
        return walls;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    public int getNumberOfLamps(){
        return numberOfLamps;
    }
    public int getNumberOfWindows(){
        return numberOfWindows;
    }


}
