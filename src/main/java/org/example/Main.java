package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Button boton = new Button("Haz clic aquí");

        boton.setOnAction(event -> System.out.println("Boton pulsado"));

        stage.setScene(new Scene(boton, 300, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
