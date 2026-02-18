package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Appointment;
import com.hospitalmanagement.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        try {
            System.out.println("Into Service layer  Getting all appointments");
            return appointmentRepository.findAll();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            System.out.println("Into Service layer  Getting all appointments");
            return appointmentRepository.findById(id).get();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment( Appointment appointment) {
        try {
            System.out.println("Into Service layer  Getting all appointments");
            return appointmentRepository.save(appointment);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void updateAppointment( Long id, Appointment updatedAppointment) {
        try {
            System.out.println("Into Service layer  Getting all appointments");
            Optional<Appointment> existingAppointment = appointmentRepository.findById(id);
            if (existingAppointment.isPresent()) {
                Appointment appointment = existingAppointment.get();
                appointment.setPatientId(updatedAppointment.getPatientId());
                appointment.setDate(updatedAppointment.getDate());
                appointment.setDoctorId(updatedAppointment.getDoctorId());
                appointment.setId(updatedAppointment.getId());
            }
            else {
                System.out.println("Appointment does not exist");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteAppointment(Long id) {
        try {
            System.out.println("Into Service layer  Getting all appointments");
            appointmentRepository.deleteById(id);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
