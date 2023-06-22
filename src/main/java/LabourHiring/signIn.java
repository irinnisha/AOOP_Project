package LabourHiring;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.util.Objects;

public class signIn extends Application {
    public  static  Stage primaryStage;
    @Override
    public void start(Stage stage) throws Exception {
            primaryStage = stage;
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("signIn.fxml")));
            Scene scene = new Scene(root);
            stage.setTitle("Sign Up Page");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {

        launch(args);
        }
}
