package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	/**
	 * localhost:8001/encrypt   加密
	 * 	body -> raw - 123456 -> 1c60b68671821a6f875de39674d7cc621ea5c47928495f7908d83a7add9ab06d
	 * localhost:8001/decrypt	解密
	 *  body -> raw - 1c60b68671821a6f875de39674d7cc621ea5c47928495f7908d83a7add9ab06d -> 123456
	 *  修改远程仓库加密内容：password={cipher}1c60b68671821a6f875de39674d7cc621ea5c47928495f7908d83a7add9ab06d
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
