package com.student.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })



public class StudentMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMsApplication.class, args);
	}

}
