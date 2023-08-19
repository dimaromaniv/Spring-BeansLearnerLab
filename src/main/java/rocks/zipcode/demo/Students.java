package rocks.zipcode.demo;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People<Student> {


    public Students(Student... student) {
        super(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return personList.iterator();
    }
}
