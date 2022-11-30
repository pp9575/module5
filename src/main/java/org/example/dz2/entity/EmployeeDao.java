package org.example.dz2.entity;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeDao {
    private Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
    private Integer id = 0;
    public Employee getEmployee(Integer id) {
        return employeeMap.get(id);
    }

    public boolean employeePresent(Integer id) {
        return employeeMap.containsKey(id);
    }

    public String addEmployee(Employee employee) {
        employee.setId(id);
        employeeMap.put(id, employee);
        id++;
        return employee + " добавлен";
    }

    public Employee deleteEmployee(Integer id) {
        return employeeMap.remove(id);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeMap.replace(employee.getId(), employee);
    }
}