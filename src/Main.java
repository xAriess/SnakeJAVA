import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Main extends Application {

    final static int COLUMNS = 24;
    final static int ROWS = 16;
    final static int HEIGHT = 400;
    final static int WIDTH = 600;
    static final int TILE_X_SIZE = WIDTH/COLUMNS;
    static final int TILE_Y_SIZE = HEIGHT/ROWS;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Snake");

        Pane root = new Pane();

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        root.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));

        Snake snake = new Snake();
        snake.drawSnake(root);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
