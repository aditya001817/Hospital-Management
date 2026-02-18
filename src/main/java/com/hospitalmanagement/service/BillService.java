package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Bill;
import com.hospitalmanagement.entity.Patient;
import com.hospitalmanagement.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public List<Bill> getAllBills() {
        try {
            System.out.println("Into Service layer all Bills");
            return null;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            System.out.println("Into Service layer  Bill by id: "+id);
            return null;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public Patient createBill(Patient patient) {
        try {
            System.out.println("Into Service layer Creating a new Bill");
            return patient;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void updateBill(Long id, Bill updatedBill) {
        try {
            System.out.println("Into Service layer Updating Bill "+id);
            Optional<Bill> existingBill = billRepository.findById(id);
            if(existingBill.isPresent()) {
                Bill bill = existingBill.get();
                bill.setAmount(updatedBill.getAmount());
                bill.setPatientid(updatedBill.getPatientid());
                bill.setPatientname(updatedBill.getPatientname());
                bill.setDoctorName(updatedBill.getDoctorName());
            }
            else{
                System.out.println("Bill Not Found");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteBill(Long id) {
        try {
            System.out.println("Into Service layer Deleting Bill "+id);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
