package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

public class ConfigClientApplication {

	/**
	 * http://localhost:8007/actuator/bus-refresh/ 刷新配置
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
