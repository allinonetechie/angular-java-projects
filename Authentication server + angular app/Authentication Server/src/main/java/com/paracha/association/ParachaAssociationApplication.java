package com.paracha.association;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
@ComponentScan
public class ParachaAssociationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParachaAssociationApplication.class, args);
	}

}
