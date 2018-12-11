package thangnd15.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thangnd15.dao.StudentDAO;
import thangnd15.entity.Student;
import thangnd15.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudentList() {

		List<Student> students = studentService.getStudentList();
		return students;
	}

	public boolean saveStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
