package view;

import controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import utils.Direction;


public class GraphicsDemo extends Application {
    private static final int CELL_SIZE = 20;

    private Canvas canvas;
    private GraphicsContext gc;
    private Controller controller;


    @Override
    public void start(Stage stage) {
        controller = new Controller(this);
        int gridSize = controller.getGridSize();
        int canvasSize = gridSize * CELL_SIZE;

        canvas = new Canvas(canvasSize, canvasSize);
        gc = canvas.getGraphicsContext2D();

        canvas.setFocusTraversable(true);
        canvas.setOnKeyPressed(keyEvent -> {
            KeyCode keycode = keyEvent.getCode();
            Direction direction = getDirectionFromKeyCode(keycode);
            if (direction != null) {
                controller.handleMove(direction);
            }
        });

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, canvasSize, canvasSize);
        stage.setTitle("Graphics Demo");
        stage.setScene(scene);
        stage.show();

        //show the ball ini pos
        this.updateCanvas(controller.getPlayerX(), controller.getPlayerY());
    }

    public Direction getDirectionFromKeyCode(KeyCode keycode) {
        switch (keycode) {
            case UP -> {
                return Direction.UP;
            }
            case DOWN -> {
                return Direction.DOWN;
            }
            case RIGHT -> {
                return Direction.RIGHT;
            }
            case LEFT -> {
                return Direction.LEFT;
            }
            default -> {
                return null;
            }
        }
    }

    public void updateCanvas(int playerX, int playerY) {
        int gridSize = controller.getGridSize();
        int canvasSize = gridSize * CELL_SIZE;
        gc.clearRect(0, 0, canvasSize, canvasSize);

        gc.setFill(Color.BLUE);
        int x = playerX * CELL_SIZE;
        int y = playerY * CELL_SIZE;
        gc.fillRect(x, y, CELL_SIZE, CELL_SIZE);
    }


}
