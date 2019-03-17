package sample.registration_form;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegistrationForm extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("registration_form.fxml"));
    primaryStage.setScene(new Scene(root, 600, 400));
    primaryStage.setTitle("Application");
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
