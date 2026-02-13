package com.hospitalmanagement.repository;

import com.hospitalmanagement.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
