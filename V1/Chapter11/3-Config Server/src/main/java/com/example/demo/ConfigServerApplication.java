package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	/**
	 * http://localhost:8001/config/pro
	 * http://localhost:8001/config/dev
	 *
	 * http://localhost:8001/config-pro.properties
	 * http://localhost:8001/config-dev.properties
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
