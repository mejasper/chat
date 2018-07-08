import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FxFXMLController
{
    @FXML
    // The reference of inputText will be injected by the FXML loader
    private TextField inputText;

    // The reference of outputText will be injected by the FXML loader
    @FXML
    private TextArea outputText;

    @FXML
    private Button heslig;

    @FXML
    private URL location;

    @FXML
    private ResourceBundle resources;

    // Add a public no-args constructor
    public FxFXMLController()
    {
    }

    @FXML
    private void initialize()
    {
    }

    @FXML
    private void printOutput()
    {
        outputText.setText(inputText.getText());
        heslig.setText("Clear");
    }

    @FXML
    private void lmao(){
        outputText.setText("");
        heslig.setText("Cleared");
    }
    @FXML
    private void handleButtonAction() throws IOException {
        System.out.println("You clicked me!");
        Stage stage = (Stage) heslig.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("main/ressources/test.fxml"));

        stage.setTitle("Doomsday");
        stage.setScene(new Scene(root, 300, 275));
    }
}