package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Appointment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class AppointmentService {

    public List<Appointment> getAllAppointments() {
        try {
            System.out.println("Into Service layer  Getting all appointments");
            return null;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById( Long id) {
        try {
            System.out.println("Into Service layer  Getting all appointments");
            return null;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment( Appointment appointment) {
        try {
            System.out.println("Into Service layer  Getting all appointments");
            return null;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void updateAppointment( Long id, Appointment updatedAppointment) {
        try {
            System.out.println("Into Service layer  Getting all appointments");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteAppointment(Long id) {
        try {
            System.out.println("Into Service layer  Getting all appointments");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
