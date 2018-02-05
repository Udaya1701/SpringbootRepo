package com.cts.pnrservice.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Configuration
@PropertySource("classpath:application.properties")
public class DBConfig {
	@Autowired
	Environment environment;
	
	@Bean
	DBProperties appProperties() {
		DBProperties bean = new DBProperties();
		bean.setHost(environment.getProperty("db.host"));
		bean.setPort(environment.getProperty("db.port"));
		bean.setName(environment.getProperty("db.name"));
		bean.setUsername(environment.getProperty("db.username"));
		bean.setPassword(environment.getProperty("db.password"));
		
		return bean;
	}
	
}	
