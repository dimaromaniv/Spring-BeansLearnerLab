package rocks.zipcode.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class Alumni {
//    @Autowired
//    @Qualifier("previousCohort")
    Students students;
//    //
//    @Autowired
//    @Qualifier("instructors")
    Instructors instructors;

    //    @Bean
//    @DependsOn("previousCohort")
    public Alumni() {
    }

    @Autowired
    public Alumni(@Qualifier("previousCohort") Classroom classroom) {
        this.students = classroom.getStudents();
        this.instructors = classroom.getInstructors();
    }

    @PostConstruct
    private void executeBootcamp() {
        int numberOfInstructors = instructors.size();
        int numberOfStudents = students.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        instructors.forEach(i -> i.lecture(students, numberOfHoursPerInstructor));
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}

