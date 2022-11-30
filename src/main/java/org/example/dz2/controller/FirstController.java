package org.example.dz2.controller;

import lombok.AllArgsConstructor;
import org.example.dz2.dto.EmployeeDtoRq;
import org.example.dz2.entity.EmployeeDao;
import org.example.dz2.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@AllArgsConstructor
public class FirstController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EmployeeDao employeeDao;

    private static final String noUser = "Пользователь не найден";

    @GetMapping(path = "/employee/{id}")
    public String getEmployee(@PathVariable Integer id) {
        if (!employeeDao.employeePresent(id)) {
            return noUser;
        }
        return employeeMapper.convertEmplToDto(employeeDao.getEmployee(id)).toString();
    }

    @PostMapping(path = "employee")
    public String addEmployee(@RequestBody EmployeeDtoRq employee) {
        return employeeDao.addEmployee(employeeMapper.convertDtoToEmpl(employee));
    }

    @DeleteMapping(path = "employee/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        if (!employeeDao.employeePresent(id)) {
            return noUser;
        }
        return employeeMapper.convertEmplToDto(employeeDao.deleteEmployee(id)).toString() + " удален";
    }

    @PatchMapping(path = "/employee")
    public String updateEmployee(@RequestBody EmployeeDtoRq employee) {
        if (!employeeDao.employeePresent(employee.getId())) {
            return noUser;
        }
        return employeeMapper.convertEmplToDto(
                employeeDao.updateEmployee(employeeMapper.convertDtoToEmpl(employee))).toString()
                + " изменен на " + employee;
    }
}