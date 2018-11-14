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

	/**
	 * Log4j
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CsopttEurekaMainApplication.class);

	/**
	 * 配置中心拉取的properties文件中的config.name属性的值
	 */
	@Value("${config.name}")
	private String configName;

	/**
	 * 初始化
	 */
	private static CsopttEurekaMainApplication application;

	/**
	 * 初始化
	 */
	@PostConstruct
	private void init() {
		application = this;
	}

	public static void main(String[] args) {
		// 显示拉取的配置文件的配置名称
		try {
			LOGGER.info(application.configName);
		} catch (Exception e) {
			LOGGER.error("拉取配置文件失败", e);
		}
		SpringApplication.run(CsopttEurekaMainApplication.class, args);
	}
}
