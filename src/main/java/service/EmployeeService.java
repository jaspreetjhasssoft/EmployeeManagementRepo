package service;

import java.util.List;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EmployeeDAO;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	
	public int save(Employee employee)
	{
		
		int result = employeeDAO.save(employee);

	return result;	
		
	}
	
	public Employee findOne(int id)
	{
		Employee employee = (Employee)employeeDAO.findOne(id);
	
		return employee;
	}
	
	public List<Employee> findAll()
	{
		
		List<Employee> employees = employeeDAO.findAll();
		
		return employees;
	}
	
	public void update(Employee employee)
	{
		
		employeeDAO.update(employee);
		
	}
	
	
}
