package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Bill;
import com.hospitalmanagement.entity.Patient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class BillService {

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
