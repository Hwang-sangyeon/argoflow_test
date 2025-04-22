package test.gradle.spring_webapp_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringWebapp01Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebapp01Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringWebapp01Application.class);
	}

}
