package rocks.zipcode.demo;

public interface Teacher  {

   public void teach(Learner learner,double numberOfHours
   );

   public void lecture(Iterable<? extends Learner> learners,double numberOfHours);
}
