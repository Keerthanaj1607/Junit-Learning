package org.example.hotelMgmt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    private Map<Integer,Room> rooms= new HashMap<>();
    public void addRoom(int roomNumber) {
        rooms.put(roomNumber, new Room(roomNumber));
    }
    public List<Room>getAvailableRooms(){
     List<Room>available= new ArrayList<>();
     for(Room room: rooms.values()){
         if(!room.isBooked()){
             available.add(room);
         }
     }
     return available;
    }
    public Room getRoom(int roomNumber) {
        return rooms.get(roomNumber);
    }
}

