package com.csoptt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 * 作为Eureka注册中心服务端
 */
@SpringBootApplication
@EnableEurekaServer
public class CsopttEurekaMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsopttEurekaMainApplication.class, args);
	}
}
