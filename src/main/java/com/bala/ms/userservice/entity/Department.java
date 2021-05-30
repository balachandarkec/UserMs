package com.bala.ms.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode; // NDR478045
}
