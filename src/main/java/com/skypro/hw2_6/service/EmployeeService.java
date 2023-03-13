package com.skypro.hw2_6.service;

import com.skypro.hw2_6.entity.Employee;
import com.skypro.hw2_6.exception.EmployeeAlreadyAddedException;
import com.skypro.hw2_6.exception.EmployeeNotFoundException;
import com.skypro.hw2_6.exception.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {
    private final int MAX_EMPLOYEES_COUNT = 2;
    private final Map<String, Employee> employees = new HashMap<>();

    public Employee add(String firstName, String lastName) {
        if (employees.size() == MAX_EMPLOYEES_COUNT) {
            throw new EmployeeStorageIsFullException("Массив сотрудников переполнен");
        }

        Employee employee = new Employee(firstName, lastName);

        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("В массиве уже есть такой сотрудник");
        }

        employees.put(employee.getFullName(), employee);

        return employee;
    }

    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            return employees.get(employee.getFullName());
        }
        throw new EmployeeNotFoundException("сотрудник не найден");
    }

    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (employees.containsKey(employee.getFullName())) {
            return employees.remove(employee.getFullName());
        }
        throw new EmployeeNotFoundException("сотрудник не найден");
    }

    public Collection<Employee> getAll() {
        return Collections.unmodifiableCollection(employees.values());
    }
}
