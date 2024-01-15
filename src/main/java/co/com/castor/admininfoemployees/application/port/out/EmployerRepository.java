package co.com.castor.admininfoemployees.application.port.out;

import co.com.castor.admininfoemployees.domain.models.Employee;

import java.util.List;

public interface EmployerRepository {
     Employee saveEmployee(Employee employee);
     List<Employee> getEmployees();
     void deleteEmployer(Long id);



}
