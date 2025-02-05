package rocks.zipcode.demo.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import rocks.zipcode.demo.Classroom;
import rocks.zipcode.demo.Instructors;
import rocks.zipcode.demo.Students;
@Configuration
public class ClassroomConfig {
    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
   public Classroom currentCohort(@Qualifier("instructors")Instructors instructors ,
                                  @Qualifier("students")Students students) {
        return new Classroom(instructors,students);

    }
    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(@Qualifier("instructors")Instructors instructors ,
                                    @Qualifier("previousStudents")Students students) {
        return new Classroom(instructors,students);}
}
