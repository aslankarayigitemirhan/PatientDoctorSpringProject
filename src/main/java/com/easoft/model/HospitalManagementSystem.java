package com.easoft.model;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem implements ManagementBehaviour{
    private List<Doctor> doctorList;
    private List<Patient> patientList;

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public HospitalManagementSystem() {
        this.doctorList= new ArrayList<>();
        this.patientList = new ArrayList<>();

    }


    @Override
    public String writePrescription(String patienId,String doctorId) {

        for (int i = 0; i < this.patientList.size(); i++) {
            for (int j = 0; j < this.doctorList.size();j++){
            if(this.patientList.get(i).getId().equals(patienId) && this.doctorList.get(j).getDipId().toString().equals(doctorId)){
                Prescription prescription = new Prescription(this.patientList.get(i),this.doctorList.get(j));//Write Prescription
                this.patientList.get(i).getPrescriptionList().add(prescription);
                return prescription.toString();
            }
        }}
        return null;
    }

    @Override
    public Doctor addDoctor(String fullName) {
        Doctor doctor = new Doctor(fullName);
        this.doctorList.add(doctor);
        return doctor;
    }
    @Override
    public Doctor addDoctor(Doctor doctor) {
        this.doctorList.add(doctor);
        return doctor;
    }

    @Override
    public Doctor deleteDoctor(String doctorId) {
        for (int i = 0; i < this.doctorList.size(); i++) {
            if(this.doctorList.get(i).getDipId().toString().equals(doctorId)){//safe type-casting
                return this.doctorList.remove(i);
            }
        }return null;
    }

    @Override
    public Patient addPatient(Patient patient) {
        this.patientList.add(patient);
        return patient;
    }

    @Override
    public Patient deletePatient(String patientId) {
        for (int i = 0; i < this.patientList.size(); i++) {
            if(this.patientList.get(i).getId().equals(patientId)){
                return this.patientList.remove(i);
            }
        }return null;
    }
}
