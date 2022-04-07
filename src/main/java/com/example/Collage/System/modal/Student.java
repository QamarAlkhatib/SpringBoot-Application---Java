package com.example.Collage.System.modal;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.UUID;

public class Student {

    private final UUID id;
    private final String name;
    private final String Dob;
    private final int contactNumber;


    public Student(@JsonProperty("id") UUID id, @JsonProperty("name") String name, @JsonProperty("DoB") String dob, @JsonProperty("contactNumber") int contactNumber) {
        this.id = id;
        this.name = name;
        Dob = dob;
        this.contactNumber = contactNumber;

    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return Dob;
    }

    public int getContactNumber() {
        return contactNumber;
    }
}
