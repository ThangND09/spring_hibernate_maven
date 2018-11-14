 
USE dbdemo;

-- insert data to school table
INSERT INTO school(name, location) VALUES('Vinh Univercity', 'Vinh Nghe An');
INSERT INTO school(name, location) VALUES('Ha Noi Univercity', 'Ha Noi');
INSERT INTO school(name, location) VALUES('Da Nang Univercity', 'Da Nang');

-- insert data to student table
INSERT INTO student(first_name, last_name, dob, school_id) VALUES('Nguyen', 'Thang', '1992-01-21', 1);
INSERT INTO student(first_name, last_name, dob, school_id) VALUES('Nguyen', 'Luan', '1992-12-23', 1);
INSERT INTO student(first_name, last_name, dob, school_id) VALUES('Phan', 'Phu', '1992-11-10', 1);

INSERT INTO student(first_name, last_name, dob, school_id) VALUES('Phan', 'Linh', '1994-10-21', 2);
INSERT INTO student(first_name, last_name, dob, school_id) VALUES('Nguyen', 'Anh', '1994-12-29', 2);
INSERT INTO student(first_name, last_name, dob, school_id) VALUES('Phan', 'Phu', '1992-05-15', 2);

INSERT INTO student(first_name, last_name, dob, school_id) VALUES('Pham', 'Chau', '1992-11-16', 3);
INSERT INTO student(first_name, last_name, dob, school_id) VALUES('Cu Thi', 'Tra My', '1992-03-18', 3);
INSERT INTO student(first_name, last_name, dob, school_id) VALUES('Le', 'Tuan', '1992-02-19', 3);

-- insert data to course table
INSERT INTO course(name) VALUES('Maths');
INSERT INTO course(name) VALUES('IT sofware');
INSERT INTO course(name) VALUES('IT hardware');

-- insert data to student_join_course table
INSERT INTO student_join_course(student_id, course_id) VALUES(1, 1);
INSERT INTO student_join_course(student_id, course_id) VALUES(1, 2);
INSERT INTO student_join_course(student_id, course_id) VALUES(1, 3);

INSERT INTO student_join_course(student_id, course_id) VALUES(2, 1);
INSERT INTO student_join_course(student_id, course_id) VALUES(2, 2);

INSERT INTO student_join_course(student_id, course_id) VALUES(3, 1);
INSERT INTO student_join_course(student_id, course_id) VALUES(3, 3);

INSERT INTO student_join_course(student_id, course_id) VALUES(4, 1);
INSERT INTO student_join_course(student_id, course_id) VALUES(4, 2);
INSERT INTO student_join_course(student_id, course_id) VALUES(4, 3);

INSERT INTO student_join_course(student_id, course_id) VALUES(5, 1);
INSERT INTO student_join_course(student_id, course_id) VALUES(5, 2);
INSERT INTO student_join_course(student_id, course_id) VALUES(5, 3);

INSERT INTO student_join_course(student_id, course_id) VALUES(6, 1);
INSERT INTO student_join_course(student_id, course_id) VALUES(6, 2);
INSERT INTO student_join_course(student_id, course_id) VALUES(6, 3);

INSERT INTO student_join_course(student_id, course_id) VALUES(7, 1);
INSERT INTO student_join_course(student_id, course_id) VALUES(7, 2);
INSERT INTO student_join_course(student_id, course_id) VALUES(7, 3);

INSERT INTO student_join_course(student_id, course_id) VALUES(8, 1);
INSERT INTO student_join_course(student_id, course_id) VALUES(8, 2);
INSERT INTO student_join_course(student_id, course_id) VALUES(8, 3);

INSERT INTO student_join_course(student_id, course_id) VALUES(9, 1);
INSERT INTO student_join_course(student_id, course_id) VALUES(9, 2);
INSERT INTO student_join_course(student_id, course_id) VALUES(9, 3);

-- insert data to description table
INSERT INTO description(course_id, description) VALUES(1, 'It is Maths');
INSERT INTO description(course_id, description) VALUES(2, 'It is It software');
INSERT INTO description(course_id, description) VALUES(3, 'It is It hardware');


















