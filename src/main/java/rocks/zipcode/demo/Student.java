package rocks.zipcode.demo;

public class Student extends Person implements Learner {
    private double totalStudyTime = 0;


//    @Override
//    public String toString() {
//        return "Student{" +
//                "totalStudyTime=" + totalStudyTime +
//                '}';
//    }

    public Student(long id, String name) {
        super(id, name);
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }
}
