package spring.mvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvc.entity.Employee;
import spring.mvc.service.EmployeeService;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showEmp(Model model) {
        List<Employee> list = employeeService.findAll();
        model.addAttribute("allEmps", list);
        return "show_empl";
    }

    @RequestMapping("/add")
    public String add(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee_info";
    }

    @RequestMapping("/saveEmp")
    public String saveEmp(@ModelAttribute("employee") Employee employee) {
employeeService.save(employee);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String update(@RequestParam("empId") int id, Model model) {
    Employee employee = employeeService.getEmp(id);
    model.addAttribute("employee", employee);
        return "employee_info";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("empId") int id) {
        employeeService.delete(id);
        return "redirect:/";
    }
}
