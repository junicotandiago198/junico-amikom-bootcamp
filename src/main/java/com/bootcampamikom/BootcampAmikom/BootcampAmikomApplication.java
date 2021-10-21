package com.bootcampamikom.BootcampAmikom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.bootcampamikom.BootcampAmikom"})
public class BootcampAmikomApplication {

	public static void main(String[] args) {
            SpringApplication.run(BootcampAmikomApplication.class, args);
	}
}
