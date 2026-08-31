import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Displays the Duke GUI using FXML.
 */
public class Main extends Application {
    private final Duke duke = new Duke();

    /**
     * Loads and displays the FXML chat interface.
     *
     * @param stage primary application stage
     */
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane root = fxmlLoader.load();
            stage.setScene(new Scene(root));
            fxmlLoader.<MainWindow>getController().setDuke(duke);
            stage.show();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
