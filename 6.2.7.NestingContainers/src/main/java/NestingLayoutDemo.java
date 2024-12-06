import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NestingLayoutDemo  extends Application {

    @Override
    public void start(Stage stage){
        BorderPane layout = new BorderPane();

        HBox top = new HBox();
        top.getChildren().add(new Button("File"));
        top.getChildren().add(new Button("Edit"));
        top.getChildren().add(new Button("View"));

        VBox left = new VBox();
        left.getChildren().add(new Button("Left A"));
        left.getChildren().add(new Button("Left B"));
        left.getChildren().add(new Button("Left C"));

        VBox right = new VBox();
        right.getChildren().add(new Button("Right D"));
        right.getChildren().add(new Button("Right E"));
        right.getChildren().add(new Button("Right F"));

        HBox bottom = new HBox();
        Button[] buttons = new Button[6];

        for (int i = 0; i < 6; i++){
            buttons[i] = new Button(""+(i+1));
            bottom.getChildren().add(buttons[i]);
        }



        StackPane center = new StackPane();
        center.getChildren().add(new Button("            "));
        Label label = new Label("Center Button");
        label.setOpacity(0.5);
        center.getChildren().add(label);

        top.setAlignment(Pos.CENTER);
        bottom.setAlignment(Pos.CENTER);

        layout.setTop(top);
        layout.setBottom(bottom);
        layout.setRight(right);
        layout.setLeft(left);
        layout.setCenter(center);

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();
    }
}
