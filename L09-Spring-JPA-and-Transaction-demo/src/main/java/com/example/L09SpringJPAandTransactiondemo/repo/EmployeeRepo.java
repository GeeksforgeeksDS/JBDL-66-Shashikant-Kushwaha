package com.example.L09SpringJPAandTransactiondemo.repo;

import com.example.L09SpringJPAandTransactiondemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
