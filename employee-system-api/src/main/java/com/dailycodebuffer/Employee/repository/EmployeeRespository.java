package com.dailycodebuffer.Employee.repository;

import com.dailycodebuffer.Employee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<EmployeeEntity, Long> {


}
