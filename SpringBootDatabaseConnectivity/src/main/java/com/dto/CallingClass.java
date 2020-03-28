package com.dto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CallingClass {

	public static void main(String[] args) {
		SpringApplication.run(CallingClass.class, args);
		/*ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext-main.xml");
		CarController objController=(CarController) context.getBean("controller");
*/
	}

}
