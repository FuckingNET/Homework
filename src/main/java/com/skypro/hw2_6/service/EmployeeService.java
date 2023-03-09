package com.skypro.hw2_6.service;

import com.skypro.hw2_6.entity.Employee;
import com.skypro.hw2_6.exception.EmployeeAlreadyAddedException;
import com.skypro.hw2_6.exception.EmployeeNotFoundException;
import com.skypro.hw2_6.exception.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final int MAX_EMPLOYEES_COUNT = 2;
    private final List<Employee> employees = new ArrayList<>();

    public Employee add(String firstName, String lastName) {
        if (employees.size() == MAX_EMPLOYEES_COUNT) {
            throw new EmployeeStorageIsFullException("Массив сотрудников переполнен");
        }

        Employee employee = new Employee(firstName, lastName);

        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException("В массиве уже есть такой сотрудник");
        }

        employees.add(employee);

        return employee;
    }

    public Employee find(String firstName, String lastName) {
        Employee employee = null;
        for (Employee e : employees) {
            if (e != null && firstName.equals(e.getFirstName()) && lastName.equals(e.getLastName())) {
                employee = e;
            }
        }
        if (employee == null) {
            throw new EmployeeNotFoundException("сотрудник не найден");
        }
        return employee;
    }

    public Employee remove(String firstName, String lastName) {
        Employee employee = find(firstName, lastName);

        for (Employee e : employees) {
            if (e.equals(employee)) {
                employees.remove(e);
                break;
            }
        }
        return employee;
    }

    public List<Employee> getAll() {
        return employees;
    }
}
