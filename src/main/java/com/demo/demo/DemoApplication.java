package com.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.demo.controller.BookingRepository;
import com.demo.demo.controller.UserRepository;
import com.demo.demo.entity.Booking;
import com.demo.demo.entity.User;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

import java.time.Instant;
@SpringBootApplication
@EnableSwagger2
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BookingRepository bookingRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.demo.demo.controller"))
				.paths(regex("/test.*")).build();

	}

	@Override
	public void run(String... args) throws Exception {
// TODO Auto-generated method stub
//	User user1 = this.userRepository.save(new User("ganesh"));
//	User user2 = this.userRepository.save(new User("suraj"));
//	User user3 = this.userRepository.save(new User("akash"));
		

	}
	
	

}
