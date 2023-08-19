package rocks.zipcode.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rocks.zipcode.demo.Student;
import rocks.zipcode.demo.Students;

@Configuration
public class StudentConfig {
    @Bean(name = "students")
    public Students currentStudents() {

        return new Students(new Student(6L, "Dee"),
                new Student(7L, "Zach"),
                new Student(8L, "Jen"));
    }
    @Bean(name = "previousStudents" )
    public Students previousStudents() {
        return new Students( new Student(28L, "Jack"),
                new Student(29L, "Josh"),
                new Student(30L, "James")
                );
    }

}
