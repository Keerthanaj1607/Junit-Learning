import org.example.hotelMgmt.Hotel;
import org.example.hotelMgmt.HotelService;
import org.example.hotelMgmt.Room;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class HotelServiceTest {
    Hotel hotel;
    HotelService service;
    @BeforeEach
    public void setUp(){
        System.out.println("Setting up");
        //Creating a new Hotel before each test
        hotel= new Hotel();
        service = new HotelService(hotel);

    }
    @AfterEach
    public void tearDown(){
        System.out.println("Clearing before new test");
        //Clearing a  Hotel before each test
        hotel= null;
        service=null;

    }
    @Test
    public void testBookRoomSuccessfully(){
        hotel.addRoom(101);
        service.bookRoom(101);
        Room room = hotel.getRoom(101);
        assertTrue(room.isBooked());

    }
    @Test
    public void testtBookingNonExistentRoomThrowsException(){
        Exception exception = assertThrows(IllegalArgumentException,()->{

        service.bookRoom(999);});
        assertEquals("Room not found", exception.getMessage());

    }
    @Test
    public void testBookingAlreadyBookedRoomThrowsException() {


        hotel.addRoom(102);
        service.bookRoom(102);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            service.bookRoom(102);
        });

        assertEquals("Room already booked", exception.getMessage());
    }
}
