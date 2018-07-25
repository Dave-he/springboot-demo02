package com.heyx.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class Demo02Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo02Application.class, args);
	}


	/**
	 * 视图解析器，ViewResolver ，my
	 * @return
	 */
	@Bean
	public ViewResolver myViewResolver(){
		return new MyViewResolver();
	}

	private static class MyViewResolver implements ViewResolver{

		@Override
		public View resolveViewName(String s, Locale locale) throws Exception {
			return null;
		}
	}

}
