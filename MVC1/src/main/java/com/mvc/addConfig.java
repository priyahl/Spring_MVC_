package com.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.mvc"})
public class addConfig {
	@Bean
public InternalResourceViewResolver viewResolver() {
	InternalResourceViewResolver i=new InternalResourceViewResolver();
			i.setPrefix("/WEB-INF/");
			i.setSuffix(".jsp");
			return i;
}
}
