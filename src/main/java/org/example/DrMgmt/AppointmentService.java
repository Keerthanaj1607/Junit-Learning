package org.example.DrMgmt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();

//    public void bookAppointment(Appointment appointment) {
//        for (Appointment existing : appointments) {
//            if (existing.getDoctorId() == appointment.getDoctorId() &&
//                    existing.getDateTime().equals(appointment.getDateTime())) {
//                throw new RuntimeException("Doctor already has an appointment at this time");
//            }
//        }
//        appointments.add(appointment);
//    }
    //code refactor
private boolean isDoctorAvailable(Appointment appointment) {
    return appointments.stream().noneMatch(existing ->
            existing.getDoctorId() == appointment.getDoctorId() &&
                    existing.getDateTime().equals(appointment.getDateTime()));
}

    public void bookAppointment(Appointment appointment) {
        if (!isDoctorAvailable(appointment)) {
            throw new RuntimeException("Doctor already has an appointment at this time");
        }
        appointments.add(appointment);
    }

    public List<Appointment>getAppointmentsByDoctor(int doctorId){
        return appointments.
                stream().
                filter(a->a.getDoctorId()==doctorId).
                collect(Collectors.toList());

    }
}
