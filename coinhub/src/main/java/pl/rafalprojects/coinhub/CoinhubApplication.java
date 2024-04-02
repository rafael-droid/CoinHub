package pl.rafalprojects.coinhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan("pl.rafalprojects.coinhub.repositories")
public class CoinhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinhubApplication.class, args);
	}

}
