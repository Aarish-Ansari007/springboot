package com.example.crudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudapi.modal.EmployeeBean;

public interface EmployeeRepository extends JpaRepository<EmployeeBean, Long>{

}
