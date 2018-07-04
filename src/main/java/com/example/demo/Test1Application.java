package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@ComponentScan({"controller"})
@EntityScan("model")
@EnableJpaRepositories("repository")
public class Test1Application extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}
}
