package LabourHiring;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class signInController implements Initializable {

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



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        choiceBox.getItems().addAll(items);

    }
}
