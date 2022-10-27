package pre_002.stackOverFlow_Clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StackOverFlowCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(StackOverFlowCloneApplication.class, args);
	}

}
