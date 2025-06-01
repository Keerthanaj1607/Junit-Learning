package org.example.hotelMgmt;

public class HotelService {
    private Hotel hotel;

    public HotelService(Hotel hotel) {
        this.hotel = hotel;
    }

    public void bookRoom(int roomNumber) {
        Room room = hotel.getRoom(roomNumber);
        if (room == null) {
            throw new IllegalArgumentException("Room not found");
        }

        if (room.isBooked()) {
            throw new IllegalStateException("Room already booked");
        }

        room.setBooked(true);
    }
}
