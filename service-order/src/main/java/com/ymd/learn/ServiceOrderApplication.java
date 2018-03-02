package com.ymd.learn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ymd.learn.entity.Order;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceOrderApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceOrderApplication.class, args);
	}
	
	@Value("${server.port}")
	int port;
	
	@RequestMapping("/getOrder")
	public Order getOrderById(@RequestParam int id) {
		Order order = new Order();
		order.setId(id);
		order.setPort(port);
		return order;
	}
	
}
