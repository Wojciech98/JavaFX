package sample.hbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.vbox.VboxExample;

public class HboxExample extends Application{

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("hbox.fxml"));
    primaryStage.setScene(new Scene(root, 600, 400));
    primaryStage.setTitle("HBox example");
    primaryStage.show();
  }
}
