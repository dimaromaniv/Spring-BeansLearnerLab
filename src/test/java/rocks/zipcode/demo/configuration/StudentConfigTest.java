package rocks.zipcode.demo.configuration;

//import com.example.demo.models.Student;
//import com.example.demo.models.Students;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.DependsOn;
import org.springframework.test.context.junit4.SpringRunner;
import rocks.zipcode.demo.Student;
import rocks.zipcode.demo.Students;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {
    @Autowired
    @Qualifier("students")
    Students currentStudents;
    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Test
    public void testCurrentStudentsFindById(){
        Student s = currentStudents.findById(6L);
        String actual  = s.getName();
        String expected = "Dee";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSize(){
        Integer expected = currentStudents.size();
        Integer actual = 3;
        Assert.assertEquals(expected,actual);}

    @Test
    public void testCurrentStudentsLearn(){
        for (Student s : currentStudents){
            s.learn(3.0);
        }

        Double actual = currentStudents.findById(6L).getTotalStudyTime();
        Double expected = 3.0;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testPreviousStudentsFindById(){
        Student s = previousStudents.findById(28L);
        String actual  = s.getName();
        String expected = "Jack";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testPreviousSize(){
        Integer expected = previousStudents.size();
        Integer actual = 3;
        Assert.assertEquals(expected,actual);}

    @Test
    public void testPreviousStudentsLearn(){
        for (Student s : previousStudents){
            s.learn(3.0);
        }

        Double actual = previousStudents.findById(28L).getTotalStudyTime();
        Double expected = 1203.0;
        Assert.assertEquals(expected, actual);

    }




}