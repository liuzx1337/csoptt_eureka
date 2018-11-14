package com.csoptt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import javax.annotation.PostConstruct;

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
