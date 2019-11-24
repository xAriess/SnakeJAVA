import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Main extends Application {

    private final int COLUMNS = 16;
    private final int ROWS = 16;
    private final int HEIGHT = 400;
    private final int WIDTH = 600;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Snake");

        TilePane root = new TilePane();
        root.setPrefColumns(COLUMNS);
        root.setPrefColumns(ROWS);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        root.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));

        Ellipse ellipse = new Ellipse(100,100,100,100);
        ellipse.setFill(Color.BLUEVIOLET);

        root.getChildren().add(ellipse);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
