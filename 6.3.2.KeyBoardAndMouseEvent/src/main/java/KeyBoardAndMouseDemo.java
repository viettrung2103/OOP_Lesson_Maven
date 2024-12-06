import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class KeyBoardAndMouseDemo extends Application {

    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.RED);
        gc.fillOval(10, 10, 10, 20);

        canvas.setOnKeyPressed(event -> {
            KeyCode keyCode = event.getCode();
            System.out.println("Key pressed: " + keyCode);
        });

        canvas.setOnMouseMoved(event -> {
                    double x = event.getX();
                    double y = event.getY();
                    System.out.println("Mouse moved to (" + x + "," + y + ")");
                }
        );

        canvas.setFocusTraversable(true);

        StackPane layout = new StackPane(canvas);
        Scene scene = new Scene(layout, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
