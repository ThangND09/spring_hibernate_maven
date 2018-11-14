package thangnd15.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import thangnd15.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<Student> getStudent() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Student> theQuery = 
				currentSession.createQuery("from Student", Student.class);
		
//		Student student = currentSession.get(Student.class, 35);
		
		// execute query and get result list
		List<Student> students = theQuery.getResultList();
				
		// return the results		
		return students;
	}

	public boolean saveStudent(Student student) {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Integer id = (Integer) currentSession.save(student);
		
		return id > 0 ? true : false;
	}
	
}
