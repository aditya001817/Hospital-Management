package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Bill;
import com.hospitalmanagement.entity.Patient;
import com.hospitalmanagement.repository.BillRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public Page<Bill> getAllBills(int page, int size) {
        try {
            System.out.println("Into Service layer all Bills");
            Pageable pageable = PageRequest.of(page, size);
            return billRepository.findAll(pageable);
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            System.out.println("Into Service layer  Bill by id: "+id);
            Optional<Bill> bill = billRepository.findById(id);
            return bill.orElse(null);
        }
        catch (Exception e) {
            log.error(e);
            return null;
        }
    }

    public Bill createBill(Bill bill) {
        try {
            System.out.println("Into Service layer Creating a new Bill");
            return billRepository.save(bill);
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
                bill.setPatientId(updatedBill.getPatientId());
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
            billRepository.deleteById(id);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
