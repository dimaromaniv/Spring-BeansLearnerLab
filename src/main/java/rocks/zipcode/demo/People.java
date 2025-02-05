package rocks.zipcode.demo;

import java.util.Arrays;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;

    }

    public People(PersonType... p) {
        this.personList = Arrays.asList(p);
    }


    public void add(PersonType personType) {
        personList.add(personType);
    }

    public void remove(Long id) {
        PersonType temp = findById(id);
        if (personList != null) {
            personList.remove(temp);
        }
    }

    public Integer size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(PersonType... personTypes) {
        for (PersonType person : personTypes) {
            personList.add(person);
        }
    }

    public PersonType findById(long id) {
        for (PersonType p : personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

//    @Override
//    public String toStringFor() {
//        for (PersonType p : personList)
//        System.out.println(p.getName().toString());
//
//        return null;
//    }

    public List<PersonType> findAll() {
        return this.personList;
    }
}
