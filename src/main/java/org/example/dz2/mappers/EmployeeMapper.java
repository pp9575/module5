package org.example.dz2.mappers;

import org.example.dz2.dto.EmployeeDtoRq;
import org.example.dz2.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    public Employee convertDtoToEmpl(EmployeeDtoRq dtoRq) {
        Employee employee = new Employee(dtoRq.getName(), dtoRq.getAge(), dtoRq.getSalary());
        if (dtoRq.getId() != null) {
            employee.setId(dtoRq.getId());
        }
        return employee;
    }

    public EmployeeDtoRq convertEmplToDto(Employee employee) {
        EmployeeDtoRq dtoRq = new EmployeeDtoRq(employee.getName(), employee.getAge(), employee.getSalary());
        dtoRq.setId(employee.getId());
        return dtoRq;
    }
}
