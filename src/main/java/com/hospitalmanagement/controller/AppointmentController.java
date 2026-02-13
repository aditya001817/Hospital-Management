package com.hospitalmanagement.controller;


import com.hospitalmanagement.entity.Appointment;
import com.hospitalmanagement.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/all")
    public List<Appointment> getAllAppointments() {
        System.out.println("Getting all appointments");
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        System.out.println("Getting appointments number "+id);
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping("/create")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        System.out.println("Creating appointment ");
        return appointmentService.createAppointment(appointment);
    }

    @PutMapping("/update/{id}")
    public void updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment) {
        System.out.println("Updating appointment "+id);
        appointmentService.updateAppointment(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        System.out.println("Deleting appointment "+id);
        appointmentService.deleteAppointment(id);
    }

}
