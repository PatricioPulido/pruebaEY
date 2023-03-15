/*
 * Author: Oscar Pinto S.
 * Cargo: Arquitecto en Software
 * Vida Camara S.A.
 * Create Date: 31-01-2019
 */

package cl.ey.pruebaEY;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan(basePackages = {"cl.ey.pruebaEY"})
@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		
		Class<?>[] configClasses = {ApiApplication.class, Swagger2Config.class};
		
		SpringApplication.run(configClasses, args);
	}
}
