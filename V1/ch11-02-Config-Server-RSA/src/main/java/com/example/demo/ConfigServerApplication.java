package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	/**
	 * not ok
	 * keytool -genkeypair -alias "alias test" -keypass "keypass" -keyalg "RSA" -storepass "storepass" -keystore rsa.jks
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
