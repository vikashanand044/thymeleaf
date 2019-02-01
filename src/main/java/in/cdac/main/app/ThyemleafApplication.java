package in.cdac.main.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"in.cdac.main"})
@EntityScan({"in.cdac.main.entities"})

public class ThyemleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThyemleafApplication.class, args);
	}

}

