package sesi3;

/**
 *
 * @author Dzikry
 */
public class NomorPunggung {
    public static class People {
    public int pushUpDurationInMinute;
    public int plankDurationInMinute;
    public int runningDurationInMinute;

    People(
      int pushUpDurationInMinute, 
      int plankDurationInMinute,
      int runningDurationInMinute
    ) {
      this.pushUpDurationInMinute = pushUpDurationInMinute;
      this.plankDurationInMinute = plankDurationInMinute;
      this.runningDurationInMinute = runningDurationInMinute;
    }
  }



  public static void main(String[] args) {
    People Ucup = new People(60, 5, 5);
    getWorkoutSummary(Ucup);
  }

  public static void getWorkoutSummary(People People) {
    final double pushUpCaloriesLostPerMinute = 6.666666666666667;
    final float plankCaloriesLostPerMinute = 5;
    final float runningCaloriesLostPerMinute = 60;

    int pushUpDuration = People.pushUpDurationInMinute;
    int plankDuration = People.plankDurationInMinute;
    int runningDuration = People.runningDurationInMinute;


    System.out.println(
     "Pushup anda menghilangkan " + (float) (pushUpCaloriesLostPerMinute * pushUpDuration) + " kalori"
    );

    System.out.println(
     "Plank anda menghilangkan " + (float) (plankCaloriesLostPerMinute * plankDuration) + " kalori"
    );

    System.out.println(
     "Lari anda menghilangkan " + (float) (runningCaloriesLostPerMinute * runningDuration) + " kalori"
    );


  }
}
