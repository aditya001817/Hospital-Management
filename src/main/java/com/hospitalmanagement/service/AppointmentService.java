package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Appointment;
import com.hospitalmanagement.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Page<Appointment> getAllAppointments(int page, int size) {
        try {
            System.out.println("Into Service layer  Getting all appointments");
            Pageable pageable = PageRequest.of(page, size);
            return appointmentRepository.findAll(pageable);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            System.out.println("Into Service layer  Getting all appointments");
            Optional<Appointment> appointment = appointmentRepository.findById(id);
            return appointment.orElse(null);
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
