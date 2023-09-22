import java.util.ArrayList;

public class ScreenHandler {
    private ArrayList<Workout> workoutList = new ArrayList<>();
    private Workout currentWorkout;

    class Exercise {
        String title;

        public Exercise(String name) {
            this.title = name;
        }
    }

    class Workout {
        String title;
        ArrayList<Exercise> exerciseList;

        public Workout(String name) {
            this.title = name;
            exerciseList = new ArrayList<Exercise>();
        }
    }

    public ScreenHandler() {
        Workout exampleWorkout = new Workout("Example Workout");
        exampleWorkout.exerciseList.add(new Exercise("Example Exercise 1"));
        exampleWorkout.exerciseList.add(new Exercise("Example Exercise 2"));
        workoutList.add(exampleWorkout);
    }

    public void showMainPage() {
        System.out.println("[1] New Workout");
        System.out.println("[2] Workout List");
    }

    public void showWorkoutListPage() {
        System.out.println("[0] Go to main page \n");
        for (int i = 0; i < workoutList.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + workoutList.get(i).title);
        }
    }

    public int numberOfWorkouts() {
        return workoutList.size();
    }

    public void selectCurrentWorkoutPage(int userInputInt) {
        currentWorkout = workoutList.get(userInputInt - 1);
    }

    public void showCurrentWorkoutPage() {
        System.out.println("[0] Go to workout list page \n");
        System.out.println(currentWorkout.title);
        System.out.println("________________________");
        for (int i = 0; i < currentWorkout.exerciseList.size(); i++) {
            System.out.println(currentWorkout.exerciseList.get(i).title);
        }
        System.out.println("[1] Add Exercise");
        System.out.println("[2] Remove Last Exercise");
    }

    public void removeLastExercise() {
        if (currentWorkout.exerciseList.size() > 0) {
            currentWorkout.exerciseList.remove(currentWorkout.exerciseList.size() - 1);
        }
    }

    public void addExercise(String exerciseName) {
        currentWorkout.exerciseList.add(new Exercise(exerciseName));
    }

    public void addWorkout(String workoutName) {
        workoutList.add(new Workout(workoutName));
    }
}
