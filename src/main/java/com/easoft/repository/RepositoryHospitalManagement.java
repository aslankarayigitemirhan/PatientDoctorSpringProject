package com.easoft.repository;

import com.easoft.model.Doctor;
import com.easoft.model.HospitalManagementSystem;
import com.easoft.model.Patient;
import com.easoft.model.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.print.Doc;
import java.util.List;

@Repository
public class RepositoryHospitalManagement {
    @Autowired
    private HospitalManagementSystem hastane;

    public List<Patient> getAllPatients(){
        return this.hastane.getPatientList();
    }

    public List<Doctor> getAllDoctors(){
        return this.hastane.getDoctorList();
    }

    public Doctor getDoctor(String id){
        for (Doctor doctor : this.hastane.getDoctorList()) {
            if (doctor.getDipId().toString().equals(id)) {
                return doctor;
            }
        }
        return null;
    }


    public Patient getPatient(String id){
        for (Patient patient : this.getAllPatients()){
            if(patient.getId().equals(id)){
                return patient;
            }
        }
        return null;
    }
    public String getPrescriptionForPatient(String id){
        for (Patient patient : this.getAllPatients()){
            if(patient.getId().equals(id)){
                return patient.getPrescriptionList().toString();
            }
        }
        return null;
    }

    public Doctor addDoctor(String fullName) {
        return this.hastane.addDoctor(fullName);
    }
    public Doctor deleteDoctor(String doctorId){
        return this.hastane.deleteDoctor(doctorId);
    }
    public Patient addPatient(Patient patient) {
        return this.hastane.addPatient(patient);
    }
    public Patient deletePatient(String patientId) {
        return this.hastane.deletePatient(patientId);
    }
    public String writePrescription(String patienId,String doctorId){
        return this.hastane.writePrescription(patienId,doctorId);
    }
}
