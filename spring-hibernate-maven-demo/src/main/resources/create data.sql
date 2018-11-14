CREATE DATABASE IF NOT EXISTS dbdemo;
 
USE dbdemo;

CREATE TABLE school(
   school_id int auto_increment primary key,
   name varchar(50) not null,
   location varchar(200) not null
) ENGINE=InnoDB;

CREATE TABLE student(
   student_id int auto_increment primary key,
   first_name varchar(20) not null,
   last_name varchar(20) not null,
   dob Date,
   school_id Int,
   FOREIGN KEY student(school_id)
   REFERENCES school(school_id)
) ENGINE=InnoDB;
 
CREATE TABLE course(
   course_id int auto_increment primary key,
   name varchar(255) not null
)ENGINE=InnoDB;

CREATE TABLE student_join_course(
   student_id int Not null,
   course_id int not null,
   primary key (student_id, course_id),
   CONSTRAINT `FK_STUDENT`
   FOREIGN KEY student_join_course(student_id)
   REFERENCES student(student_id),
   CONSTRAINT `FK_COURSE`
   FOREIGN KEY student_join_course(course_id)
   REFERENCES course(course_id)
)ENGINE=InnoDB;

CREATE TABLE description(
   id int auto_increment primary key,
   course_id int not null,
   description varchar(255),
   FOREIGN KEY discription(course_id)
   REFERENCES course(course_id)
)ENGINE=InnoDB;
