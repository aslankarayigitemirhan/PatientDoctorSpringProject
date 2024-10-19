package com.easoft.model;

public class Test {
    public static void main(String[] args){
        HospitalManagementSystem hastane = new HospitalManagementSystem();

        Patient p01 = new Patient("20050111059","Emirhan ASLANKARAYIGIT");
        Patient p02 = new Patient("21050111059","Ege UNDENIS");
        Patient p03 = new Patient("22050111059","Rumeysa YAVUZKANAT");
        Patient p04 = new Patient("23050111059","Ilayda ASLANKARAYIGIT");
        Doctor doctor = new Doctor("Furkan CEYLAN");
        hastane.addPatient(p01);
        hastane.addPatient(p02);
        hastane.addPatient(p03);
        hastane.addPatient(p04);



    }
}
