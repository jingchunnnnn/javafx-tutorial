import javafx.application.Application;

/**
 * Launches the JavaFX application without extending Application itself.
 */
public class Launcher {

    /**
     * Starts the JavaFX runtime.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}
