package rocks.zipcode.demo.configuration;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import rocks.zipcode.demo.Classroom;
import rocks.zipcode.demo.Instructor;
import rocks.zipcode.demo.Instructors;
import rocks.zipcode.demo.Students;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

@RunWith(SpringRunner.class)
public class ClassroomConfigTest {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Test
    public void currentCohortSizeTest() {
        Integer actualSt = currentCohort.getStudents().size();
        Integer actualInstr = currentCohort.getInstructors().size();
        Integer actual = actualInstr+actualSt;
        Integer expected = 6;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCurrentCohortFindInstructorNameNotNull() {
        Instructors instructors = currentCohort.getInstructors();
        String actual = instructors.findById(2L).getName();
        String expected = "Dolio Durant";
        Assert.assertEquals(actual,expected);
    }


    @Test
    public void testHostLecture() {
        //given
        Instructor host = currentCohort.getInstructors().findById(1L);
        Double expected = 15.0;
        //when
        currentCohort.hostLecture(host, 45.0);
        Double actual = currentCohort.getStudents().findById(6L).getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentCohortFindStudentName(){
        String actual = currentCohort.getStudents().findById(6L).getName();
        String expected = "Dee";
        Assert.assertEquals(actual,expected);
    }
}