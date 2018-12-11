package thangnd15.entity;

import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="student_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer studentId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="dob")
	private Date dob;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="studentId")
	private School school;
	
	@ManyToMany(fetch= FetchType.LAZY, cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(name="student_join_course", 
				joinColumns=@JoinColumn(name="student_id"),
				inverseJoinColumns=@JoinColumn(name="course_id"))
	@JsonIgnore
	private List<Course> courses;
	
	public Student() {
	}
	
	public Student(String firstName, String lastName, Date dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course course) {
		if (courses == null) {
			courses = new ArrayList<Course>();
		}
		
		courses.add(course);
	}
	
}
