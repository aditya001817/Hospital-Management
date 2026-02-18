package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Doctor;
import com.hospitalmanagement.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        try {
            System.out.println("Into service layer Doctors");
            return doctorRepository.findAll();
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
            return doctor.get();
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
