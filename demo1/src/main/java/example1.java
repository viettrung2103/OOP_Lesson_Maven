import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class example1 extends Application {

    public void start(Stage window) {
        Label text = new Label("Hello World!");
        Scene view = new Scene(text);
        // can provide container to the scene
        // a container contain component and a seperate scene
        window.setTitle("My Greeting Application");
        window.setScene(view);
        window.show();
        //window is the stage
        //
    }
}