package sample.registration_form;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import sample.model.User;
import sample.model.UserDao;
import sample.service.AlertService;

public class RegistrationFormController {

  public TextField usernameField;
  public TextField nameField;
  public TextField surnameField;
  public TextField emailField;
  public TextField passwordField;
  public TextField passwordConfirmationField;

  public Label usernameErrorLabel;
  public Label nameErrorLabel;
  public Label surnameErrorLabel;
  public Label emailErrorLabel;
  public Label passwordErrorLabel;
  public Label passwordConfirmationErrorLabel;


  public void registerHandler(ActionEvent actionEvent) {

    boolean valid = isNotEmpty(usernameField, true, usernameErrorLabel);
    valid = isNotEmpty(nameField, valid, nameErrorLabel) && valid;
    valid = isNotEmpty(surnameField, valid, surnameErrorLabel) && valid;
    valid = isNotEmpty(emailField, valid, emailErrorLabel) && valid;
    valid = isNotEmpty(passwordField, valid, passwordErrorLabel) && valid;
    valid = isNotEmpty(passwordConfirmationField, valid, passwordConfirmationErrorLabel) && valid;

    if (valid) {
      UserDao.add(new User(
          usernameField.getText(),
          nameField.getText(),
          surnameField.getText(),
          emailField.getText(),
          passwordField.getText()
      ));
    }
    System.out.println(UserDao.existsByUsername(usernameField.getText()));
  }

  private boolean isNotEmpty(TextField field, boolean showAlert, Label errorLabel) {
    if (field.getText().isEmpty()) {
      errorLabel.setVisible(true);
      errorLabel.setText("Field is empty");

      if (showAlert) {
        AlertService.showAlert(
            AlertType.ERROR,
            "Registration Failed",
            "Field is empty",
            field.getScene().getWindow());
      }
    }
    return !field.getText().isEmpty();
  }

  public void onMouseOverButton(MouseEvent mouseEvent) {
//    System.out.println("mouse over button");
//    System.out.println("x: " + mouseEvent.getSceneX());
//    System.out.println("y: " + mouseEvent.getSceneY());
  }
}
