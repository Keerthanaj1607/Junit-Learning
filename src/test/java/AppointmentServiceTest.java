import org.example.DrMgmt.Appointment;
import org.example.DrMgmt.AppointmentService;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppointmentServiceTest {
    @Test
    public void testPreventDoubleBooking(){
        AppointmentService service = new AppointmentService();
        Appointment a1 = new Appointment(1, 101, 201, LocalDateTime.of(2024, 6, 1, 10, 0));
        Appointment a2 = new Appointment(2, 101, 202, LocalDateTime.of(2024, 6, 1, 10, 0)); // Same time, same doctor
// Without exception
        assertDoesNotThrow(() -> service.bookAppointment(a1));
        Exception ex = assertThrows(RuntimeException.class, () -> service.bookAppointment(a2));
        assertEquals("Doctor already has an appointment at this time", ex.getMessage());
    }


}
