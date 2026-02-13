package com.hospitalmanagement.controller;

import com.hospitalmanagement.entity.Patient;
import com.hospitalmanagement.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/all")
    public List<Patient> getAllPatients() {
        System.out.println("Getting all patients");
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable Long id) {
        System.out.println("Getting patient by id: "+id);
        return patientService.getPatientById(id);
    }

    @PostMapping("/create")
    public Patient createPatient(@RequestBody Patient patient) {
        System.out.println("Creating a new patient");
        return patientService.createPatient(patient);
    }

    @PutMapping("/update/{id}")
    public void updatePatient(@PathVariable Long id,  @RequestBody Patient updatedPatient) {
        System.out.println("Updating patient "+id);
        patientService.updatePatient(id,  updatedPatient);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePatient(@PathVariable Long id) {
        System.out.println("Deleting patient "+id);
        patientService.deletePatient(id);
    }
}
