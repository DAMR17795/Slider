package com.example.slider;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SliderVertical extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 600, 250);
        stage.setScene(scene);
        stage.setTitle("Slider Wiki");
        stage.show();

        //Titulo EjemploSlider
        Text scenetitle = new Text("Ejemplo de Slider");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        //Creacion de Slider
        Slider slider = new Slider();
        slider.setPrefSize(600, 200);

        //Valor minimo de Slider
        slider.setMin(0);

        //Valor maximo de Slider
        slider.setMax(100);

        //Valor del Slider actual
        slider.setValue(50);

        //Mostrar valor numerico en Slider (etiqueta numerica)
        slider.setShowTickLabels(true);

        //Mostrar intermedios en Slider (marcas entre valores)
        slider.setShowTickMarks(true);

        //Establecer mayor unidad entre valores
        slider.setMajorTickUnit(25);

        //Establecer menor unidad entre valores
        slider.setMinorTickCount(5);

        //Establecer distancia que se mueve el cursor por la pista al hacerle click en ella
        slider.setBlockIncrement(10);

        //Mantener valor en las marcas de verificacion
        slider.setSnapToTicks(true);

        //Orientacion
        slider.setOrientation(Orientation.VERTICAL);

        //Label numerico
        Label numero = new Label("50");
        numero.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.setHalignment(numero, HPos.CENTER);
        grid.add(numero, 0,3);


        //Aniadir Slider a grid
        grid.add(slider, 0 , 1);

        //Metodo raton arrastrado

        slider.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                numero.setText(String.valueOf((int)slider.getValue()));
            }
        });

        //Metodo raton clickado

        slider.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                numero.setText(String.valueOf((int)slider.getValue()));
            }
        });
    }
}
