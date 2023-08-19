package rocks.zipcode.demo;

public class Instructor extends Person implements Teacher {
    public Instructor(long id, String name) {

        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int counter = 0;
        for (Learner learner : learners) {
            counter++;
        }
        double numberOfHoursPerLearner = 0.0;

        try {
            if (counter != 0) {
                numberOfHoursPerLearner = numberOfHours / counter;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        double finalNumberOfHoursPerLearner = numberOfHoursPerLearner;
        learners.forEach(learner -> learner.learn(finalNumberOfHoursPerLearner));
    }


}
