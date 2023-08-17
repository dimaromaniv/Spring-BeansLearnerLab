package rocks.zipcode.demo;

public class Student implements Learner{
    private double totalStudyTime;

    public Student(double totalStudyTime){
        this.totalStudyTime = totalStudyTime;
    }
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }
}
