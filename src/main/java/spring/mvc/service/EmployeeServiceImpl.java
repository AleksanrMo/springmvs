package spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.mvc.dao.EmployeeDAO;
import spring.mvc.entity.Employee;


import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
  @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
   @Transactional
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public Employee getEmp(int id) {
        return employeeDAO.getEmp(id);
    }
    @Override
    @Transactional
    public void delete(int id) {
        employeeDAO.delete(id);
    }
}
