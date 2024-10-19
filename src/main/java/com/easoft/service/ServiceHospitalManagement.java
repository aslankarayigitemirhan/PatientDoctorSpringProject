package com.easoft.service;

import com.easoft.model.Doctor;
import com.easoft.model.Patient;
import com.easoft.model.Prescription;
import com.easoft.repository.RepositoryHospitalManagement;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceHospitalManagement {

    @Autowired
    private RepositoryHospitalManagement repositoryHospitalManagement;

    public List<Patient> getAllPatients(){
        return this.repositoryHospitalManagement.getAllPatients();
    }
    public List<Doctor> getAllDoctors(){
        return this.repositoryHospitalManagement.getAllDoctors();
    }
    public Doctor getDoctor(String id){
        return this.repositoryHospitalManagement.getDoctor(id);
    }
    public Patient getPatient(String id){
        return this.repositoryHospitalManagement.getPatient(id);
    }
    public String getPrescriptionForPatient(String id){
        return this.repositoryHospitalManagement.getPrescriptionForPatient(id);
    }
    public Doctor addDoctor(String fullName){
        return this.repositoryHospitalManagement.addDoctor(fullName);
    }

    public Doctor deleteDoctor(String doctorId){
        return this.repositoryHospitalManagement.deleteDoctor(doctorId);
    }
    public Patient addPatient(Patient patient){
        return this.repositoryHospitalManagement.addPatient(patient);
    }
    public Patient deletePatient(String patientId){
        return this.repositoryHospitalManagement.deletePatient(patientId);
    }
    public String writePrescription(String patienId,String doctorId){
        return this.repositoryHospitalManagement.writePrescription(patienId,doctorId);
    }
}
