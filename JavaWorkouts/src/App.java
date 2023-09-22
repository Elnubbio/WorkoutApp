
public class App {

    public static void main(String[] args) throws Exception {
        ScreenHandler myScreenHandler = new ScreenHandler();
        PageHandler myPageHandler = new PageHandler();

        myScreenHandler.showMainPage();
        String pageState = "mainPage";

        while (true) {
            String userInput = System.console().readLine(">");
            switch (pageState) {
                case "mainPage":
                    pageState = myPageHandler.handleMainPageInput(userInput, myScreenHandler);
                    break;
                case "workoutListPage":
                    pageState = myPageHandler.handleWorkoutListPageInput(userInput, myScreenHandler);
                    break;
                case "workoutPage":
                    pageState = myPageHandler.handleWorkoutPageInput(userInput, myScreenHandler);
                    break;
                default:
            }
        }

    }
}

// TODO save and read file
// TODO Introduce Enums