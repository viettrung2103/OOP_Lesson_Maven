import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MultipleComponentsApplication extends Application {
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        Button topButton = new Button("NORTH");
        Button rightButton = new Button("EAST");
        Button bottomButton = new Button("SOUTH");
        Button leftButton = new Button("WEST");
        Button centerButton = new Button("CENTER");

        layout.setTop(topButton);
        layout.setRight(rightButton);
        layout.setBottom(bottomButton);
        layout.setLeft(leftButton);
        layout.setCenter(centerButton);
        layout.setAlignment(topButton, Pos.CENTER);
        layout.setAlignment(bottomButton, Pos.CENTER);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }


}
