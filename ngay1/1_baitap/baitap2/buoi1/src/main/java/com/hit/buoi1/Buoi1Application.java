package com.hit.buoi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hit.buoi1.models.entities.Person;

@SpringBootApplication
public class Buoi1Application {
	public static void main(String[] args) {
		// Khởi động ứng dụng Spring Boot
		ApplicationContext context = SpringApplication.run(Buoi1Application.class, args);
		Person person = context.getBean(Person.class);
		person.use();
	}

}
