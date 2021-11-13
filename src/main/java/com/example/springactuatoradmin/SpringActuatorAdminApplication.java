package com.example.springactuatoradmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication @EnableAdminServer
public class SpringActuatorAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorAdminApplication.class, args);
	}

}
