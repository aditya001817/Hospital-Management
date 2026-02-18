package com.hospitalmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bill {

    @Id
    private Long patientId;
    private double amount;
    private String doctorName;
    private String date;
    private Long doctorId;
    private String patientname;

}
