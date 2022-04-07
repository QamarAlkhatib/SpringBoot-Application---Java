package com.example.Collage.System.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.spi.DateFormatProvider;
import java.util.UUID;

public class Staff {

    private final UUID id;
    private final String name;
    private final String nationalIdNum;
    private final int contactNumber;
    private final int numberOfExperience;
    private final String countryOfUniversity;
    private final String postGraduateQualification;
    private final String DoB;

    public Staff(@JsonProperty("id") UUID id,@JsonProperty("name") String name,@JsonProperty("nationalIdNum") String nationalIdNum, @JsonProperty("contactNumber")int contactNumber, @JsonProperty("numberOfExperience")int numberOfExperience,@JsonProperty("countryOfUniversity") String countryOfUniversity, @JsonProperty("postGraduateQualification") String postGraduateQualification, @JsonProperty("DoB") String doB) {
        this.id = id;
        this.name = name;
        this.nationalIdNum = nationalIdNum;
        this.contactNumber = contactNumber;
        this.numberOfExperience = numberOfExperience;
        this.countryOfUniversity = countryOfUniversity;
        this.postGraduateQualification = postGraduateQualification;
        DoB = doB;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNationalIdNum() {
        return nationalIdNum;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public int getNumberOfExperience() {
        return numberOfExperience;
    }

    public String getCountryOfUniversity() {
        return countryOfUniversity;
    }

    public String getPostGraduateQualification() {
        return postGraduateQualification;
    }

    public String getDoB() {
        return DoB;
    }
}
