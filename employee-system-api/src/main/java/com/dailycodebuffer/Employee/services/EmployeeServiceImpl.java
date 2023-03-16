package com.dailycodebuffer.Employee.services;

import com.dailycodebuffer.Employee.entity.EmployeeEntity;
import com.dailycodebuffer.Employee.model.Employee;
import com.dailycodebuffer.Employee.repository.EmployeeRespository;
import org.springframework.beans.BeanUtils;


public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRespository employeeRespository;

    public EmployeeServiceImpl(EmployeeRespository employeeRespository) {
        this.employeeRespository = employeeRespository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();

        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRespository.save(employeeEntity);
        return employee;
    }
}
