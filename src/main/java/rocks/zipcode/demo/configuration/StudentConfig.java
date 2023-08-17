package rocks.zipcode.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rocks.zipcode.demo.Students;

@Configuration
public class StudentConfig {
    @Bean(name = "students")
    public Students currentStudents() {
        return new Students();
    }
}
