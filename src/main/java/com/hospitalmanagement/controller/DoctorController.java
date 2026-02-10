package com.hospitalmanagement.controller;

import com.hospitalmanagement.entity.Doctor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;


@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {

    @GetMapping("/all")
    public List<Doctor> getAllDoctors() {
        System.out.println("Getting Doctors");
        return null;
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        System.out.println("Getting Doctor by id");
        return null;
    }

    @PostMapping("/create")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        System.out.println("Creating Doctor");
        return doctor;
    }
}
