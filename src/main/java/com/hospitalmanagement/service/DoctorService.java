package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Doctor;
import com.hospitalmanagement.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        System.out.println("Into service layer Doctors");
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(Long id) {
        System.out.println("Into service layer Doctors");
        Optional<Doctor> doctor = doctorRepository.findById(id);
        return doctor.get();
    }

    public Doctor createDoctor(Doctor doctor) {
        System.out.println("Into service layer Doctors");
        doctorRepository.save(doctor);
        return doctor;
    }

    public void updateDoctor(Long id) {

        System.out.println("Into service layer Doctors");
    }

    public void deleteDoctor(Long id) {
        System.out.println("Into service layer Doctors");
    }
}
