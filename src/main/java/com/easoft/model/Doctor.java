package com.easoft.model;

import java.util.UUID;

public class Doctor {
    private String fullName;

    private UUID dipId;

    public Doctor(String fullName) {
        this.fullName = fullName;
        this.dipId = UUID.randomUUID();
    }

    public String getFullName() {
        return fullName;
    }

    public UUID getDipId() {
        return dipId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    @Override
    public String toString(){
        return "Doctor Name : " + this.fullName + "\tDiploma Identification Number : " + this.dipId.toString();
    }
}
