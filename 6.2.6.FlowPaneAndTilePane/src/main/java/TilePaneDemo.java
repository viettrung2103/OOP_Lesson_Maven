import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneDemo extends Application {

    @Override
    public void start(Stage stage){
        TilePane layout = new TilePane();
        Button[] buttons = new Button[50];

        for (int i = 0; i< 50; i++){
            buttons[i] = new Button(""+ (i+1));
            layout.getChildren().add(buttons[i]);
        }

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();

    }
}
