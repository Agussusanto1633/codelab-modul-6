package org.example.modul6;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane loginForm = new GridPane();
        loginForm.setAlignment(Pos.CENTER);
        loginForm.setHgap(10);
        loginForm.setVgap(10);
        loginForm.setPadding(new Insets(25, 25, 25, 25));

        Label lblUserName = new Label("User Name:");
        TextField txtUserName = new TextField();
        Label lblPassword = new Label("Password:");
        PasswordField txtPassword = new PasswordField();
        Button btnSignIn = new Button("Sign in");
        btnSignIn.setOnAction(event -> {
            if (txtUserName.getText().equals("adit") && txtPassword.getText().equals("password")) {
                showSuccessForm(primaryStage);
            } else {
                Label lblError = new Label("Password Atau Username Salah");
                lblError.setTextFill(Color.RED);
                loginForm.add(lblError, 0, 2);
            }
        });
        loginForm.add(lblUserName, 0, 0);
        loginForm.add(txtUserName, 1, 0);
        loginForm.add(lblPassword, 0, 1);
        loginForm.add(txtPassword, 1, 1);
        loginForm.add(btnSignIn, 1, 2);

        Scene scene = new Scene(loginForm, 300, 200);
        primaryStage.setTitle("Form Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void showSuccessForm(Stage primaryStage) {
        // Create the success form grid pane
        GridPane successForm = new GridPane();
        successForm.setAlignment(Pos.CENTER);
        successForm.setHgap(10);
        successForm.setVgap(10);
        successForm.setPadding(new Insets(25, 25, 25, 25));
        Label lblMessage = new Label("Halo Radan");
        Button btnBack = new Button("Kembali");
        btnBack.setOnAction(event -> {

            primaryStage.close();
            start(primaryStage);
        });
        successForm.add(lblMessage, 0, 0);
        successForm.add(btnBack, 0, 1);
        Scene scene = new Scene(successForm, 300, 100);
        primaryStage.setTitle("Form 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}