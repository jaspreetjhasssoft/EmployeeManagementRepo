package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;


@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EmpID")
	private int id;
	@Column(name="EmpName")
	private String name;
	@Column(name="EmpSalary")
	private Long salary;
	@ElementCollection
	@JoinTable(name="EmployeeHobbies",joinColumns={@JoinColumn(name="EmpID")})
	private List<String> hobbies = new ArrayList<String>();
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String name, Long salary, List<String> hobbies) {
	
		this.name = name;
		this.salary = salary;
		this.hobbies = hobbies;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	
	
			
	

}
