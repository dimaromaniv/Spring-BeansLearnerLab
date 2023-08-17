package rocks.zipcode.demo;

public class Person {
    private final long id;
    private String name;

    public Person(long id,String name) {
        this.id = id;
        this.name = name;
    }
    public Person(){
        this.name = null;
        this.id = 0;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
