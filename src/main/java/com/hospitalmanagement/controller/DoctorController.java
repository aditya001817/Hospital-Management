package com.hospitalmanagement.controller;

import com.hospitalmanagement.entity.Doctor;
import com.hospitalmanagement.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;


@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping("/all")
    public List<Doctor> getAllDoctors() {
        System.out.println("Getting Doctors");
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        System.out.println("Getting Doctor by id");
        return doctorService.getDoctorById(id);
    }

    @PostMapping("/create")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        System.out.println("Creating Doctor");
        return doctorService.createDoctor(doctor);
    }

    @PutMapping("/update/{id}")
    public void updateDoctor(@PathVariable Long id,  @RequestBody Doctor updatedDoctor) {
        System.out.println("Updating Doctor "+id);
        doctorService.updateDoctor(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        System.out.println("Deleting Doctor "+id);
        doctorService.deleteDoctor(id);
    }
}
