package com.example.employeemanagement.service;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

   /* public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }*/

    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {

        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(
            Long id,
            Employee employee) {

        Employee existingEmployee =
                employeeRepository.findById(id)
                        .orElseThrow(
                                () -> new RuntimeException(
                                        "Employee not found"
                                )
                        );

        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setDepartment(
                employee.getDepartment()
        );

        return employeeRepository.save(existingEmployee);
    }

    public void deleteEmployee(Long id) {

        employeeRepository.deleteById(id);
    }
}