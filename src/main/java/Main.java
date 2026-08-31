import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Displays the JavaFX tutorial application.
 */
public class Main extends Application {

    /**
     * Shows the tutorial's initial Hello World window.
     *
     * @param stage primary application stage
     */
    @Override
    public void start(Stage stage) {
        Label helloWorld = new Label("Hello World!");
        Scene scene = new Scene(helloWorld);
        stage.setScene(scene);
        stage.show();
    }
}
