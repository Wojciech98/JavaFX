package sample.vbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VboxExample extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("vbox.fxml"));
    primaryStage.setScene(new Scene(root, 600, 400));
    primaryStage.setTitle("Vbox example");
    primaryStage.show();
  }
}
