package thangnd15.dao;

import java.util.List;

import thangnd15.entity.Student;

public interface StudentDAO {
	public List<Student> getStudent();

	public boolean saveStudent(Student student);
}
