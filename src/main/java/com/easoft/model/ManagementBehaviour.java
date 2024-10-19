package com.easoft.model;

import java.util.List;

public interface ManagementBehaviour {
    public String writePrescription(String patienId,String doctorId);
    public Doctor addDoctor(String doctor);
    public Doctor addDoctor(Doctor doctor);
    public Doctor deleteDoctor(String doctor);
    public Patient addPatient(Patient patient);
    public Patient deletePatient(String patient);

}
