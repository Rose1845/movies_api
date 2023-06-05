package com.rose.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication

public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration corsConfiguration = new CorsConfiguration();

		corsConfiguration.setAllowCredentials(false);
		corsConfiguration.setAllowedOrigins(Arrays.asList(CorsConfiguration.ALL));
		corsConfiguration.setAllowedMethods(Arrays.asList(CorsConfiguration.ALL));
		corsConfiguration.setAllowedHeaders(Arrays.asList(CorsConfiguration.ALL));
		source.registerCorsConfiguration("/**", corsConfiguration);
		source.registerCorsConfiguration("/api/v1/**", corsConfiguration);
		return new CorsFilter(source);
	}

}
