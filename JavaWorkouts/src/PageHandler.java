public class PageHandler {
    public String handleMainPageInput(String userInput, ScreenHandler myScreenHandler) {
        switch (userInput) {
            case "1":
                String userWorkoutNameInput = System.console().readLine("Enter name of Workout: ");
                myScreenHandler.addWorkout(userWorkoutNameInput);
                myScreenHandler.showWorkoutListPage();
                return "workoutListPage";
            case "2":
                myScreenHandler.showWorkoutListPage();
                return "workoutListPage";
            default:
                return "mainPage";
        }
    }

    public String handleWorkoutListPageInput(String userInput, ScreenHandler myScreenHandler) {
        switch (userInput) {
            case "0":
                myScreenHandler.showMainPage();
                return "mainPage";
            default:

                if (Utilities.isInt(((userInput)))) {
                    int userInputInt = Integer.parseInt(userInput);
                    if (myScreenHandler.numberOfWorkouts() >= userInputInt) {
                        myScreenHandler.selectCurrentWorkoutPage(userInputInt);
                        myScreenHandler.showCurrentWorkoutPage();
                        return "workoutPage";
                    }
                }
                return "workoutListPage";
        }
    }

    public String handleWorkoutPageInput(String userInput, ScreenHandler myScreenHandler) {
        switch (userInput) {
            case "0":
                myScreenHandler.showWorkoutListPage();
                return "workoutListPage";
            case "1":
                String userExerciseInput = System.console().readLine("Enter name of exercise: ");
                myScreenHandler.addExercise(userExerciseInput);
                myScreenHandler.showCurrentWorkoutPage();
                return "workoutPage";
            case "2":
                myScreenHandler.removeLastExercise();
                myScreenHandler.showCurrentWorkoutPage();
                return "workoutPage";
            default:
                return "workoutPage";
        }
    }
}