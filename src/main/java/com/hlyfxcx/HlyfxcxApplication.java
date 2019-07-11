package com.hlyfxcx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;




@SpringBootApplication
@EnableTransactionManagement
@ServletComponentScan
@EnableScheduling
public class HlyfxcxApplication extends SpringBootServletInitializer {


	public static void main(String[] args) {
		SpringApplication.run(HlyfxcxApplication.class, args);
	}
	// tomcat war启动
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HlyfxcxApplication.class);

	}



}
