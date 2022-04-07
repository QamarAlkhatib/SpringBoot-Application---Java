package com.example.Collage.System.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    private  String street;
    private  int buildingNum;
    private  int apartmentNum;
    private  int postCode;

    Address(){}

    public Address(@JsonProperty String street, @JsonProperty int buildingNum, @JsonProperty int apartmentNum, @JsonProperty int postCode) {
        this.street = street;
        this.buildingNum = buildingNum;
        this.apartmentNum = apartmentNum;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public int getBuildingNum() {
        return buildingNum;
    }

    public int getApartmentNum() {
        return apartmentNum;
    }

    public int getPostCode() {
        return postCode;
    }
}
