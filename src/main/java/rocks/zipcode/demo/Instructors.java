package rocks.zipcode.demo;

import java.util.Iterator;

public class Instructors extends People<Instructor> {

    public Instructors(Instructor...instructor) {
        super(instructor);
    }
    @Override
    public Iterator<Instructor> iterator() {
        return personList.iterator();
    }
}
