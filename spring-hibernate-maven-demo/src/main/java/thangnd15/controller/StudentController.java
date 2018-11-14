package thangnd15.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import thangnd15.dao.StudentDAO;
import thangnd15.entity.Student;
import thangnd15.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public String getStudent(Model model) {
		
		List<Student> students = studentService.getStudentList();
		
		model.addAttribute("students", students);
		
		return "student";
		
	}
	
	@RequestMapping("/showFormForStudent")
	public String showFormForStudent(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "student-form";
		
	}
	
	@RequestMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		if (studentService.saveStudent(student)) {
			return "redirect:/students/list";
		}
		
		return "redirect:/students/showFormForStudent";
		
	}
	
}
