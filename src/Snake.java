import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Snake {
    ArrayList<Point> body = new ArrayList<>();

    Snake(){
        body.add(new Point(8,8, Color.GREEN));
        body.add(new Point(9,8));
        body.add(new Point(10,8));
        body.add(new Point(11,8));
    }
    void drawSnake(Pane root){
        for (Point p : body){
            p.drawPoint(root);
        }
    }
}
