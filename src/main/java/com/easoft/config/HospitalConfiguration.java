package com.easoft.config;

import com.easoft.model.Doctor;
import com.easoft.model.HospitalManagementSystem;
import com.easoft.model.Patient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HospitalConfiguration {

    @Bean
    public HospitalManagementSystem createHospitalManagementSystem(){
        HospitalManagementSystem hastane = new HospitalManagementSystem();

        Patient p01 = new Patient("20050111059","Emirhan ASLANKARAYIGIT");
        Patient p02 = new Patient("21050111059","Ege UNDENIS");
        Patient p03 = new Patient("22050111059","Rumeysa YAVUZKANAT");
        Patient p04 = new Patient("23050111059","Ilayda ASLANKARAYIGIT");
        Doctor doctor01 = new Doctor("Furkan CEYLAN");
        Doctor doctor02 = new Doctor("Eren CEYLAN");
        hastane.addPatient(p01);
        hastane.addPatient(p02);
        hastane.addPatient(p03);
        hastane.addPatient(p04);
        hastane.addDoctor(doctor01);
        hastane.addDoctor(doctor02);

        return hastane;
    }
}
