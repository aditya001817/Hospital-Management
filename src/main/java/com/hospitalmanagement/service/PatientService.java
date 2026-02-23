package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Patient;
import com.hospitalmanagement.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        try {
            System.out.println("Into the service layer");
            return patientRepository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public Patient getPatientById(Long id) {
        try {
            System.out.println("Into the service layer");
            Optional<Patient> patient = patientRepository.findById(id);
            return patient.orElse(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            System.out.println("Into the service layer");
            patientRepository.save(patient);
            return patient;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void updatePatient(Long id, Patient updatedPatient) {
        try {
            System.out.println("Into the service layer");
            Optional<Patient> existingPatient = patientRepository.findById(id);
            if(existingPatient.isPresent()) {
                Patient patient = existingPatient.get();
                patient.setName(updatedPatient.getName());
                patient.setAge(updatedPatient.getAge());
                patient.setGender(updatedPatient.getGender());
                patientRepository.save(patient);
            }
            else{
                System.out.println("Patient not found");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deletePatient(Long id) {
        try {
            System.out.println("Into the service layer");
            patientRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
