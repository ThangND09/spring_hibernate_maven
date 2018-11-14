package thangnd15.service;

import java.util.List;

import thangnd15.entity.Student;

public interface StudentService {
	
	public List<Student> getStudentList();

	public boolean saveStudent(Student student);
}
