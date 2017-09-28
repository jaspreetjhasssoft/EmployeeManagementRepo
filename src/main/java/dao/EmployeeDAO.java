package dao;

import java.util.List;

import model.Employee;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public int save(Employee employee)
	{
		
		Session session = sessionFactory.openSession();
		Transaction t= session.beginTransaction();
		int result = (Integer)session.save(employee);
		t.commit();
		session.close();
	return result;	
		
	}
	
	public Employee findOne(int id)
	{
		
		Session session = sessionFactory.openSession();
		Employee employee = (Employee)session.get(Employee.class,id);
		session.close();
		return employee;
	}
	
	public List<Employee> findAll()
	{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Employee");
		List<Employee> employees = query.list();
		session.close();
		return employees;
	}
	
	public void update(Employee employee)
	{
		Session session = sessionFactory.openSession();
		Transaction t= session.beginTransaction();
		session.update(employee);
		t.commit();
		session.close();
	}
	
}
