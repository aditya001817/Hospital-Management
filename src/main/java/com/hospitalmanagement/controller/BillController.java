package com.hospitalmanagement.controller;


import com.hospitalmanagement.entity.Bill;
import com.hospitalmanagement.entity.Patient;
import com.hospitalmanagement.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bill")
public class BillController {

    @Autowired
    BillService billService;

    @GetMapping("/all")
    public List<Bill> getAllBills() {
        System.out.println("Getting all Bills");
        return billService.getAllBills();
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id) {
        System.out.println("Getting Bill by id: "+id);
        return billService.getBillById(id);
    }

    @PostMapping("/create")
    public Patient createBill(@RequestBody Patient patient) {
        System.out.println("Creating a new Bill");
        return billService.createBill(patient);
    }

    @PutMapping("/update/{id}")
    public void updateBill(@PathVariable Long id, @RequestBody Bill updatedBill) {
        System.out.println("Updating Bill "+id);
        billService.updateBill(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBill(@PathVariable Long id) {
        System.out.println("Deleting Bill "+id);
        billService.deleteBill(id);
    }
}
