package com.hospitalmanagement.controller;


import com.hospitalmanagement.entity.Bill;
import com.hospitalmanagement.entity.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bill")
public class BillController {

    @GetMapping("/all")
    public List<Bill> getAllBills() {
        System.out.println("Getting all Bills");
        return null;
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id) {
        System.out.println("Getting Bill by id: "+id);
        return null;
    }

    @PostMapping("/create")
    public Patient createBill(@RequestBody Patient patient) {
        System.out.println("Creating a new Bill");
        return patient;
    }

    @PutMapping("/update/{id}")
    public void updateBill(@PathVariable Long id) {
        System.out.println("Updating Bill "+id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBill(@PathVariable Long id) {
        System.out.println("Deleting Bill "+id);
    }
}
