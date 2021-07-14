package L1.Build;

import Parameters.RoomSize;

public class Room {
    
    RoomSize roomSize;
    String name;

    public Room(RoomSize roomSize) {
        this.roomSize = roomSize;
        this.name = "Ordinary Room";
    }
    
    public Room(RoomSize roomSize, String name) {
        this.roomSize = roomSize;
        this.name = name;
    }

    public RoomSize getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(RoomSize roomSize) {
        this.roomSize = roomSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
