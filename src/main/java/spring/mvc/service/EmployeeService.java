package spring.mvc.service;

import spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();
    public void save(Employee employee);
    public Employee getEmp(int id);
    public void delete(int id);
}
