import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StyleWithCssDemo  extends Application {

    @Override
    public void start(Stage stage){
        VBox layout = new VBox();

        Button button = new Button("CLICK ME");
        button.setOnAction(event->{
            System.out.println("Button is click");
        });
        layout.getChildren().add(button);

        Scene scene = new Scene(layout);

        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }


}
