package driver;

import java.util.ArrayList;
import java.util.List;

import model.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.EmployeeService;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		ApplicationContext con  =  new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeService service = (EmployeeService)con.getBean("employeeService");
		List<String> list =  new ArrayList<String>();
		list.add("chess");
		list.add("carrom");
		
		Employee emp =  new Employee("user3",54000L,list);
		int result = service.save(emp);
		System.out.println("Record inserted "+result);
		
		
	}
}
