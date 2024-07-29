package one.digitalinovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Projeto Spring Boot via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * -Spring Data JPA
 * -Spring Web
 * -H2 Database
 * -OpenFeign
 *
 * @author LORRANY
 */
@ComponentScan
@EnableFeignClients
@SpringBootApplication(scanBasePackages = "one.digitalinovation.gof")
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
