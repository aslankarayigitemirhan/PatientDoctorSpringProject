package com.easoft.model;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String id;
    private String fullName;
    private List<Prescription> prescriptionList;

    public Patient(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
        this.prescriptionList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    @Override
    public String toString(){
        return "Name : " + this.fullName + "\nID:" + this.id;
    }
}
