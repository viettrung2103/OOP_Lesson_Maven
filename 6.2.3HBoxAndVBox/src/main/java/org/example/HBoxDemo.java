package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxDemo extends Application {

    @Override
    public  void start(Stage stage){
        HBox layout = new HBox();
        Button[] buttons = new Button[12];
        for (int i = 0; i< 12; i++){
            buttons[i] = new Button(""+(i+1));
            layout.getChildren().add(buttons[i]);
        }

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();

    }
}
