package LabourHiring;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.Objects;

public class logIn extends Application {
    public static Stage primaryStage1;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage1 = stage;
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("logIn.fxml")));
        Scene scene = new Scene(root);
       // primaryStage.setFullScreen(true);
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        launch(args);
    }
}