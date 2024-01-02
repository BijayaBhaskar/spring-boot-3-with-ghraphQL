package com.lwb.springbootgraphql;

import com.lwb.springbootgraphql.entity.Student;
import com.lwb.springbootgraphql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootGraphqlApplication implements CommandLineRunner {

	@Autowired
	StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student s1 = new Student();
		s1.setName("Rahul");
		s1.setClassName("Standard 1");
		s1.setSection("A");
		s1.setcTName("Radhika Sharma");
		repository.save(s1);

		Student s2 = new Student();
		s2.setName("Raj");
		s2.setClassName("Standard 2");
		s2.setSection("B");
		s2.setcTName("Ramakant Mishra");
		repository.save(s2);

		Student s3 = new Student();
		s3.setName("Bhaskar");
		s3.setClassName("Standard 3");
		s3.setSection("D");
		s3.setcTName("Radhika Sharma");
		repository.save(s3);


		Student s4 = new Student();
		s4.setName("Mukesh Das");
		s4.setClassName("Standard 1");
		s4.setSection("D");
		s4.setcTName("Rajesh Sharma");
		repository.save(s4);

		Student s5 = new Student();
		s5.setName("Ambika");
		s5.setClassName("Standard 5");
		s5.setSection("A");
		s5.setcTName("Ramakant Mishra");
		repository.save(s5);

	}
}
