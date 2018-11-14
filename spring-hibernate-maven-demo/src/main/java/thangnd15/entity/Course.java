package thangnd15.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	@Column(name="course_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer course_id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="course")
	private Description description;
	
	@ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch= FetchType.LAZY)
	@JoinTable(name="student_join_course",
			 	joinColumns=@JoinColumn(name="course_id"),
			 	inverseJoinColumns=@JoinColumn(name="student_id"))
	private List<Student> students;
	
	public Course() {
	}
	
	public Course(String name) {
		this.name = name;
	}
	
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Description getDescriptions() {
		return description;
	}

	public void setDescriptions(Description description) {
		this.description = description;
	}
	
	public void addStudent(Student student) {
		if (students == null) {
			students = new ArrayList<Student>();
		}
		
		students.add(student);
	}
	
}
