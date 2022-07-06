package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication(scanBasePackages= {"com.model","com.repo","com.controller"})
@EntityScan("com.model")
@EnableJpaRepositories({"com.repo"})
public class SpringRestH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestH2Application.class, args);
	}

}
