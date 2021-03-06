package staff.profi.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "staff.profi")
@EnableJpaRepositories(basePackages = "staff.profi.repository")
@EntityScan(basePackages = "staff.profi.entity")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
