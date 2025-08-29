package com.luv2code.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	/*
	 * define bean for CommandLineRunner app
	 * 
	 * from Spring Boot Framework
	 * executed after the Spring Beans have been loaded
	 * 
	 * inject the student DAO to perform CRUD operations
	 */
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		// java 8 lambda expression
		return runner -> {
			// allow IDE to generate the method
			// createStudent(studentDAO);

			createMultipleStudents(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating 3 student objects...");
		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Bonita", "Applebum", "bonita@luv2code.com");
		Student tempStudent3 = new Student("Bruno", "Mars", "bruno@luv2code.com");

		// save the student objects
		System.out.println("Saving the student object...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {

	// create the student object using the "new" operator
	System.out.println("Creating new student object...");
	Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");

	// save the student object
	System.out.println("Saving the student object...");
	studentDAO.save(tempStudent);

	// display id of the saved student
	System.out.println("Saved student. Generated id: " + tempStudent.getId());

	}
}