package LabourHiring;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class loginController {

    @FXML
    private Button CancelButton;

    @FXML
    private Button SignUp;

    @FXML
    private TextField UserPassward;

    @FXML
    private ImageView emailIcon;

    @FXML
    private Button login;

    @FXML
    private ImageView passIcon;

    @FXML
    private TextField userEmail;

    @FXML
    void OnActionButton(ActionEvent event) {

    }

    @FXML
    void onActionLoginButton(ActionEvent event) {

    }

    @FXML
    void onActionSignupButton(ActionEvent event) {
        blackSignInPage();
    }
    void blackSignInPage() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signIn.fxml"));
            Parent root = fxmlLoader.load();
            signInController SignInController = fxmlLoader.getController();
            SignUp.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
