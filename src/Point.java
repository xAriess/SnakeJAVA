import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class Point {
    private int x;
    private int y;
    private Color color;

    Point(int x, int y){
        this(x, y, Color.BLUE);
    }

    Point(int x, int y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }
    void drawPoint(Pane root){
        int real_x = Main.TILE_X_SIZE * this.x;
        int real_y = Main.TILE_Y_SIZE * this.y;
        Ellipse ellipse = new Ellipse(real_x, real_y, Main.TILE_X_SIZE/2.0, Main.TILE_Y_SIZE/2.0);
        ellipse.setFill(this.color);
        root.getChildren().add(ellipse);
    }
}
