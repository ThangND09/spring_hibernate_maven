package thangnd15.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thangnd15.dao.StudentDAO;
import thangnd15.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;

	@Transactional
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		
		List<Student> students =  studentDAO.getStudent();
		
		return students;
	}

	@Transactional
	public boolean saveStudent(Student student) {
		// TODO Auto-generated method stub
		
		boolean isSaveOk = studentDAO.saveStudent(student);
		
		return isSaveOk;
	}

}
