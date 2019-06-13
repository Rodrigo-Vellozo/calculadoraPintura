package br.com.devmedia.calculadoraPintura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class CalculadoraPinturaApplication{

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraPinturaApplication.class, args);
	}

}
