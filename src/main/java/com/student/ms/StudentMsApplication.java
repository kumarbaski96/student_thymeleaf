package com.student.ms;

import com.student.ms.demoController.DemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })



public class StudentMsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(StudentMsApplication.class, args);
		DemoController demoController= context.getBean(DemoController.class);
		System.out.println(demoController.getPizza());
	}

}
