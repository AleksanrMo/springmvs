package spring.mvc.dao;

import spring.mvc.entity.Employee;

import java.util.List;


public interface EmployeeDAO {
    public List<Employee> findAll();
    public void save(Employee employee);
    public Employee getEmp(int id);
    public void delete(int id);
}
