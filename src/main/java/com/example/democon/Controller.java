package com.example.democon;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField decimalNumberTextField;

    @FXML
    private ChoiceBox<String> numberSystemChoiceBox;

    @FXML
    private Button convertButton;

    @FXML
    private TextField resultTextField;

    @FXML
    private void initialize() {

        numberSystemChoiceBox.getItems().addAll("Двоичная", "Восьмеричная", "Шестнадцатеричная");
        numberSystemChoiceBox.setValue("Двоичная");

        convertButton.setOnAction(event -> convertNumber());
    }

    private void convertNumber() {
        try {
            int decimalNumber = Integer.parseInt(decimalNumberTextField.getText());


            String selectedNumberSystem = numberSystemChoiceBox.getValue();

            String result = "";
            switch (selectedNumberSystem) {
                case "Двоичная":
                    result = Integer.toBinaryString(decimalNumber);
                    break;
                case "Восьмеричная":
                    result = Integer.toOctalString(decimalNumber);
                    break;
                case "Шестнадцатеричная":
                    result = Integer.toHexString(decimalNumber);
                    break;
            }


            resultTextField.setText(result);
        } catch (NumberFormatException e) {

            resultTextField.setText("Недопустимое значение");
        }
    }
}