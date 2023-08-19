package rocks.zipcode.demo.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import rocks.zipcode.demo.Instructor;
import rocks.zipcode.demo.Instructors;

@Configuration
public class InstructorsConfig {
    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors (){
        return new Instructors(
                new Instructor(32L, "Jean Smith"),
                new Instructor(40L, "Joy Carol"),
                new Instructor(31L, "Ryan Paulson"));
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors (){
        return new Instructors(
                new Instructor(32L, "Bigsley Killings"),
                new Instructor(40L, "John Churchill"),
                new Instructor(31L, "Bugsy Charles"));
    }

    @Primary
    @Bean (name = "instructors")
    public Instructors zcwInstructors(){
        return new Instructors(
                new Instructor(1L, "Leon Hunter"),
                new Instructor(2L, "Dolio Durant"),
                new Instructor(3L, "Kris Younger"));
    }
}
