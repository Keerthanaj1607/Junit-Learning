package org.example.DrMgmt;

public class Patient {
    private int id;
    private String  name;
    private String contactNumber;

    public Patient(int id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
