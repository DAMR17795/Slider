package com.example.slider;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class SliderController {
    @FXML
    private Slider slider;

    @FXML
    private Text numero;

    @FXML
    protected void updateText(MouseEvent event) {
        numero.setText(String.valueOf((int)slider.getValue()));
    }
}