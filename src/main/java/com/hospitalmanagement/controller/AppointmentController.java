package com.hospitalmanagement.controller;


import com.hospitalmanagement.entity.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentController {

    @GetMapping("/all")
    public List<Appointment> getAllAppointments() {
        System.out.println("Getting all appointments");
        return null;
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        System.out.println("Getting appointments number "+id);
        return null;
    }

    @PostMapping("/create")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        System.out.println("Creating appointment ");
        return null;
    }

    @PutMapping("/update/{id}")
    public void updateAppointment(@PathVariable Long id) {
        System.out.println("Updating appointment "+id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        System.out.println("Deleting appointment "+id);
    }

}
