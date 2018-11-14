package thangnd15.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import thangnd15.entity.Course;
import thangnd15.entity.Description;
import thangnd15.entity.School;
import thangnd15.entity.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(thangnd15.entity.Student.class)
				.addAnnotatedClass(thangnd15.entity.Course.class)
				.addAnnotatedClass(thangnd15.entity.Description.class)
				.addAnnotatedClass(thangnd15.entity.School.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		
		
		try {			
			System.out.println("Start !!!");
			
			session.beginTransaction();
			
			
			// get Student
			Query query = session.createQuery("from Student");
			
			List<Student> students = query.list();
			
			System.out.println(students);
			
//			// get School
//			Query query2 = session.createQuery("from School");
//			
//			List<School> schools = query2.list();
//			
//			System.out.println(schools);
//			
//			// get Course
//			Query query3 = session.createQuery("from Course");
//			
//			List<Course> courses = query.list();
//			
//			System.out.println(courses);
//			
//			// get Description
//			Query query4 = session.createQuery("from Description");
//			
//			List<Description> descriptions = query.list();
//			
//			System.out.println(descriptions);
						
			// ===============================
			
			session.getTransaction().commit();
			
			System.out.println("End !!!");
		}
		finally {
			session.close();
			
			factory.close();
		}
		
	}

}
