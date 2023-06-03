package com.ramon.guardiasapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class GuardiasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuardiasApiApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/profesores/*").allowedOrigins("*");
				registry.addMapping("/guardias").allowedOrigins("*");
				registry.addMapping("/login/*").allowedOrigins("*");
				registry.addMapping("/ausencia/**").allowedOrigins("*");
			}
		};
	}

}
