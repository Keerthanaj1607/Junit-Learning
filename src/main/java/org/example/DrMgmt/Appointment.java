package org.example.DrMgmt;

import java.time.LocalDateTime;

public class Appointment {
    private int appointmentId;
    private int doctorId;
    private int patientId;
    private LocalDateTime dateTime;

public Appointment(int appointmentId, int doctorId, int patientId, LocalDateTime dateTime){
    this.appointmentId=appointmentId;
    this.doctorId=doctorId;
    this.patientId=  patientId;
    this.dateTime = dateTime;

}

public int getAppointmentId(){
    return appointmentId;
}
public int getDoctorId(){
    return doctorId;
}
public int getPatientId(){
    return patientId;
}
public LocalDateTime getDateTime(){
    return  dateTime;
}
}
