package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Doctor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class DoctorService {

    public List<Doctor> getAllDoctors() {
        System.out.println("Into service layer Doctors");
        return null;
    }

    public Doctor getDoctorById(Long id) {
        System.out.println("Into service layer Doctors");
        return null;
    }

    public Doctor createDoctor(Doctor doctor) {
        System.out.println("Into service layer Doctors");
        return null;
    }

    public void updateDoctor(Long id) {
        System.out.println("Into service layer Doctors");
    }

    public void deleteDoctor(Long id) {
        System.out.println("Into service layer Doctors");
    }
}
