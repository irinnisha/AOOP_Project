package LabourHiring;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.sql.Connection;
import javafx.scene.control.PasswordField;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class loginController {

    @FXML
    private Button CancelButton;

    @FXML
    private Button SignUp;

    @FXML
    private TextField UserPassword;

    @FXML
    private ImageView emailIcon;

    @FXML
    private Button login;

    @FXML
    private ImageView passIcon;

    @FXML
    private TextField userEmail;

    @FXML
    private Label message_label;

    @FXML
    void OnActionButton(ActionEvent event) {
        userEmail.setText("");
        UserPassword.setText("");

    }

    @FXML
    void onActionLoginButton(ActionEvent event) {

        //checking if email/password field is empty
        if (userEmail.getText().isBlank() == false && UserPassword.getText().isBlank() == false) {
            validate_login();
        } else {
            message_label.setText("Enter Username and Password");
        }


    }


    //To check name+pass match
    public void validate_login() {

        //connecting DB using DatabaseConnection class
        DatabaseConnection connect_project = new DatabaseConnection();
        Connection connect_database = connect_project.getConnection();


        String check = "SELECT count(1) FROM Admin WHERE email='" + userEmail.getText() + "' AND password='" + UserPassword.getText() + "'";

        try {

            Statement statement = connect_database.createStatement();
            ResultSet queryResult = statement.executeQuery(check);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    message_label.setText("Welcome!");
                } else {
                    message_label.setText("Invalid Login. Please try again.");
                }

            }
        }catch(Exception e){
                    e.printStackTrace();
                }

            }


            @FXML
            void onActionSignupButton (ActionEvent event){

        blackSignInPage();
            }
            void blackSignInPage () {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signIn.fxml"));
                    Parent root = fxmlLoader.load();
                  SignUp.getScene().setRoot(root);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }