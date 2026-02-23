package com.hospitalmanagement.controller;


import com.hospitalmanagement.entity.Bill;
import com.hospitalmanagement.entity.Patient;
import com.hospitalmanagement.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bill")
public class BillController {

    @Autowired
    BillService billService;

    @GetMapping("/all")
    public Page<Bill> getAllBills(@RequestParam(defaultValue = "0") int page,
                                  @RequestParam(defaultValue = "2") int size) {
        System.out.println("Getting all Bills");
        return billService.getAllBills(page, size);
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id) {
        System.out.println("Getting Bill by id: "+id);
        return billService.getBillById(id);
    }

    @PostMapping("/create")
    public Bill createBill(@RequestBody  Bill bill) {
        System.out.println("Creating a new Bill");
        return billService.createBill(bill);
    }

    @PutMapping("/update/{id}")
    public void updateBill(@PathVariable Long id, @RequestBody Bill updatedBill) {
        System.out.println("Updating Bill "+id);
        billService.updateBill(id, updatedBill);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBill(@PathVariable Long id) {
        System.out.println("Deleting Bill "+id);
        billService.deleteBill(id);
    }
}
