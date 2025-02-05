package rocks.zipcode.demo.configuration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.DependsOn;
import org.springframework.test.context.junit4.SpringRunner;
import rocks.zipcode.demo.Instructors;
import rocks.zipcode.demo.Student;
import rocks.zipcode.demo.Students;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorsConfigTest {

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors usaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors ukInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors zipInstructors;

    @org.junit.Test
    public void testUsInstructorsFindById(){
        String actual = usaInstructors.findById(40L).getName();
        String expected = "Joy Carol";
        Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testUkInstructorsFindById(){
        String actual = ukInstructors.findById(40L).getName();
        String expected = "John Churchill";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testZcwInstructorsFindById(){
        String actual = zipInstructors.findById(2L).getName();
        String expected = "Dolio Durant";
        Assert.assertEquals(expected, actual);

    }
}