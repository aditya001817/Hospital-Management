package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Doctor;
import com.hospitalmanagement.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Page<Doctor> getAllDoctors(int page, int size) {
        try {
            System.out.println("Into service layer Doctors");
            Pageable pageable = PageRequest.of(page, size);
            return doctorRepository.findAll(pageable);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            System.out.println("Into service layer Doctors");
            Optional<Doctor> doctor = doctorRepository.findById(id);
            return doctor.orElse(null);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        try {
            System.out.println("Into service layer Doctors");
            doctorRepository.save(doctor);
            return doctor;
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void updateDoctor(Long id, Doctor updatedDoctor) {
        try {
            System.out.println("Into service layer Doctors");
            Optional<Doctor> existingDoctor = doctorRepository.findById(id);
            if(existingDoctor.isPresent()) {
                Doctor doctor =  existingDoctor.get();
                doctor.setName(updatedDoctor.getName());
                doctor.setSpeciality(updatedDoctor.getSpeciality());
                doctor.setAge(updatedDoctor.getAge());
                doctorRepository.save(doctor);
            }
            else{
                System.out.println("Doctor not found");
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteDoctor(Long id) {
        try{
            System.out.println("Into service layer Doctors");
            doctorRepository.deleteById(id);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
