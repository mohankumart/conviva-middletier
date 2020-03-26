package com.test.conviva;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ConvivaApplication {

	@Value("${cross.origin}")
	private String crossOrigin;

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins(ConvivaApplication.this.crossOrigin)
						.allowedMethods(CorsConfiguration.ALL);
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ConvivaApplication.class, args);
	}

}
