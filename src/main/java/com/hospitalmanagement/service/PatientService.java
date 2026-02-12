package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Patient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class PatientService {

    public List<Patient> getAllPatients() {
        try {
            System.out.println("Into the service layer");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public Patient getPatientById(Long id) {
        try {
            System.out.println("Into the service layer");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            System.out.println("Into the service layer");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void updatePatient(Long id) {
        try {
            System.out.println("Into the service layer");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deletePatient(Long id) {
        try {
            System.out.println("Into the service layer");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
