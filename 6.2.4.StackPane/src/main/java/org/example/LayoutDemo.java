package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LayoutDemo  extends Application {

    @Override
    public void start(Stage stage){
        StackPane layout = new StackPane();
        String lableStr = "Hello";
        Button button1 = new Button("[        ]");
        Label label = new Label("Hello");

        label.setOpacity(0.5);

        // order matter
        layout.getChildren().add(label);
        layout.getChildren().add(button1);

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();


    }

}
