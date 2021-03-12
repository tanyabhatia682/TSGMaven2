package org.example.controller;


import org.example.Service.TestService;
import org.example.dto.Employee;
//import org.example.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("api/v1")
public class EmpController
{

    @Autowired
    private TestService testService;
    //private Object id;


    @GetMapping(value = "/test",produces = APPLICATION_JSON_VALUE)
    //int i=10;

    public String test(@RequestBody Employee employee)
    {


        //Employee e=new Employee();
        //e.setId(100);
        //int a=e.getId();
       // int i=7;
       // return (a + "The employee name is");
        return testService.Test();
    }
   /* @RequestMapping
public int ProcessRequest(){
    final String Id =empid;
    String value = null;
    if ((value = request.getParameter(Id)) != null) {
        int empId = Integer.valueOf(value).intValue();
        employeeList = empBean.getEmployee(empId);
    } else {
        // Previously used getEmployees() method for Listall feature
        employeeList = empBean.getEmployees();
    }

}*/


    /*EmpController(EmpRepo repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
   @GetMapping("/employees")
    List<Employee> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    // Single item

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

        return repository.findById(id)
                .map(emp -> {
                    emp.setName(newEmployee.getName());
                    emp.setAddress(newEmployee.getAddress());
                    return repository.save(emp);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }*/
}


