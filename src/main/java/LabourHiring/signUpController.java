package LabourHiring;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class signUpController implements Initializable {

    @FXML
    private Button backButton;

    @FXML
    private ImageView backgroundPicture;

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private Label createAccountLabel;

    @FXML
    private Button signUpButton;

    @FXML
    private ImageView signUpLogo;

    @FXML
    private ImageView userEmailLogo;

    @FXML
    private TextField userEmailTextfield;

    @FXML
    private ImageView userNameLogo;

    @FXML
    private TextField userNameTextfield;

    @FXML
    private ImageView userPassLogo;

    @FXML
    private TextField userPassTextfield;

    @FXML
    private Label welcomeMessageLable;

    private String [] items = {"Admin","Worker","User"};

    @FXML
    void onActionNameField(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)){
           userEmailTextfield.requestFocus();
        }

    }
    public void onActionPassField(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)){
            signUpButton.requestFocus();
        }

    }

    public void onActionEmailField(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)){
            userPassTextfield.requestFocus();
        }
    }

    @FXML
    void onActionBackButton(ActionEvent event) throws IOException {
        FXMLScene scene = FXMLScene.load("logIn.fxml");
        Parent root = scene.root;
        backButton.getScene().setRoot(root);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        choiceBox.getItems().addAll(items);

    }

}
