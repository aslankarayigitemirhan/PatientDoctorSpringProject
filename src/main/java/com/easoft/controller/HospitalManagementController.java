package com.easoft.controller;

import com.easoft.model.Doctor;
import com.easoft.model.Patient;
import com.easoft.model.Prescription;
import com.easoft.service.ServiceHospitalManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("/api/hastane")
public class HospitalManagementController {
    @Autowired
    private ServiceHospitalManagement serviceHospitalManagement;
    @GetMapping(path = "/getAllPatients")
    public List<Patient> getAllPatients(){
        return this.serviceHospitalManagement.getAllPatients();
    }
    @GetMapping(path = "/getAllDoctors")
    public List<Doctor> getAllDoctors(){
        return this.serviceHospitalManagement.getAllDoctors();
    }
    @GetMapping(path = "/findDoctor")
    public Doctor getDoctor(@RequestParam(name = "id",required = true) String id){
        return this.serviceHospitalManagement.getDoctor(id);
    }
    @GetMapping(path = "/findPatient")
    public Patient getPatient(@RequestParam(name = "id",required = true) String id){
        return this.serviceHospitalManagement.getPatient(id);
    }
    @GetMapping(path = "/getprescriptionsForThisPatient")
    public String getPrescriptionForPatient(@RequestParam(name = "id",required = true) String id){
        return this.serviceHospitalManagement.getPrescriptionForPatient(id);
    }
    @PostMapping(path = "/addDoctor")
    public Doctor addDoctor(@RequestParam(name = "fullName", required = true) String fullName){
        return this.serviceHospitalManagement.addDoctor(fullName);
    }
    @PostMapping(path = "/addPatient")
    public Patient addPatient(@RequestBody Patient patient){
        return this.serviceHospitalManagement.addPatient(patient);
    }
    @DeleteMapping(path = "/deletePatient")
    public Patient deletePatient(@RequestParam(name = "id",required = true) String patientId){
        return this.serviceHospitalManagement.deletePatient(patientId);
    }
    @DeleteMapping("/deleteDoctor")
    public Doctor deleteDoctor(@RequestParam(name = "doctorId",required = true) String doctorId){
        return this.serviceHospitalManagement.deleteDoctor(doctorId);
    }
    @PostMapping(path = "/receteYaz")
    public String writePrescription(@RequestParam(name = "patientId",required = true) String patienId, @RequestParam(name = "doctorId",required = true) String doctorId){
        return this.serviceHospitalManagement.writePrescription(patienId, doctorId);
    }
}
