import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneLayoutDemo extends Application {

    @Override
    public void start(Stage stage){
        AnchorPane layout = new AnchorPane();

        Button button1 = new Button("TOP LEFT");
        Button button2 = new Button("TOP RIGHT");
        Button button3 = new Button("BOTTOM LEFT");
        Button button4 = new Button("BOTTOM RIGHT");

        layout.getChildren().add(button1);
        layout.getChildren().add(button2);
        layout.getChildren().add(button3);
        layout.getChildren().add(button4);

        AnchorPane.setTopAnchor(button1,10.0);
        AnchorPane.setLeftAnchor(button1,10.0);

        AnchorPane.setTopAnchor(button2,10.0);
        AnchorPane.setRightAnchor(button2,10.0);

        AnchorPane.setBottomAnchor(button3,10.0);
        AnchorPane.setLeftAnchor(button3,10.0);

        AnchorPane.setBottomAnchor(button4,10.0);
        AnchorPane.setRightAnchor(button4,10.0);

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();
    }
}
