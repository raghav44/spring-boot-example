package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ComponentScan({"com.example","com.test.com"})
//@Configuration
//@EnableAutoConfiguration(exclude= class)
//@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		org.springframework.context.ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		MyAppConfig config = (MyAppConfig) ctx.getBean("myAppConfig");
		System.out.println(config.toString());
		System.out.println(ctx.getBean("datasource"));
	}
}
