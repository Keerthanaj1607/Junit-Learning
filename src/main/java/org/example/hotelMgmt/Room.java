package org.example.hotelMgmt;

public class Room {
    private int roomNumber;
    private boolean isBooked;
    public Room(int roomNumber){
        this.roomNumber=roomNumber;
        this.isBooked=false;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }
    public void setBooked(boolean booked){
        isBooked=booked;
    }

}
