package com.ymd.learn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ymd.learn.entity.User;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceUserApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceUserApplication.class, args);
	}
	
	@Value("${server.port}")
	int port;
	
	@RequestMapping("/getUser")
	public User getUserById(@RequestParam int id) {
		User user = new User();
		user.setAge(33);
		user.setName("michael");
		user.setPort(port);
		user.setId(id);
		return user;
	}
	
	
}
