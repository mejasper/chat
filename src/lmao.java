
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class lmao extends Application {

    public static void main(String[] args) {
        Application.launch(lmao.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main/ressources/test.fxml"));

        stage.setTitle("Doomsday");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
