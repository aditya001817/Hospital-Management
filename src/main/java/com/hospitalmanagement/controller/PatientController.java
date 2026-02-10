package com.hospitalmanagement.controller;

import com.hospitalmanagement.entity.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {

    @GetMapping("/all")
    public List<Patient> getAllPatients() {
        System.out.println("Getting all patients");
        return null;
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        System.out.println("Getting patient by id: ");
        return null;
    }

    @PostMapping("/create")
    public Patient createPatient(@RequestBody Patient patient) {
        System.out.println("Creating a new patient");
        return patient;
    }
}
