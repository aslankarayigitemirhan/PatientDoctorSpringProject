package com.easoft.model;
import java.util.UUID;
public class Prescription {

    private Patient patient;
    private UUID prescriptionID;
    private Doctor doctorName;

    public Prescription(Patient patient,Doctor doctorName) {
        this.patient = patient;
        this.prescriptionID = UUID.randomUUID();
        this.doctorName = doctorName;
    }

    public Doctor getDoctorName() {
        return doctorName;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public UUID getPrescriptionID() {
        return prescriptionID;
    }

    public void setPrescriptionID(UUID prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    @Override
    public String toString(){
        return "\n\n--PrescriptionInfo --\nPatient FullName :" + this.patient.getFullName() + "\nDoctor Name : "+this.doctorName.getFullName() + "\nPrescriptionNo :" + this.prescriptionID.toString();
    }
}
