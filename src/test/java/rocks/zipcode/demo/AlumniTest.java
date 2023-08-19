package rocks.zipcode.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import rocks.zipcode.demo.Students;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class AlumniTest {

    @Autowired

    Alumni alumni;

    @Test
    void executeBootcamp() {
        Integer size = alumni.getStudents().size();
        Student nameOfStudent = alumni.getStudents().findById(30L);
        Double actual = nameOfStudent.getTotalStudyTime();
        Double expected = 1200.0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHostLecturePerInstructor() {
        double hoursPerInstructor = alumni.numberOfHoursPerInstructor();

        double hoursPer = alumni.getNumberOfHoursToTeachEachStudents();
        System.out.println(hoursPer);
        Instructor instructor = alumni.getInstructors().findById(1L);
        double actual = alumni.numberOfHoursPerInstructor() / alumni.getInstructors().size();
        double expected = 400.0;
        Assert.assertEquals(expected,actual,00.1);

    }


}