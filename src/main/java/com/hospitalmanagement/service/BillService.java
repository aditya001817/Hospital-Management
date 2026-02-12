package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Bill;
import com.hospitalmanagement.entity.Patient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class BillService {

    public List<Bill> getAllBills() {
        System.out.println("Into Service layer all Bills");
        return null;
    }

    public Bill getBillById( Long id) {
        System.out.println("Into Service layer  Bill by id: "+id);
        return null;
    }

    public Patient createBill( Patient patient) {
        System.out.println("Into Service layer Creating a new Bill");
        return patient;
    }

    public void updateBill( Long id) {
        System.out.println("Into Service layer Updating Bill "+id);
    }

    public void deleteBill( Long id) {
        System.out.println("Into Service layer Deleting Bill "+id);
    }
}
