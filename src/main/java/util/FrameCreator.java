package util;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class FrameCreator {

    public static final String[] LETTERS = {"A", "B", "C", "D", "E", "F", "G", "H"};
    public static final String[] NUMBERS = {"1", "2", "3", "4", "5", "6", "7", "8"};
    public static final String[] REVERSE_NUMBERS = {"8", "7", "6", "5", "4", "3", "2", "1"};

    public static StackPane createFrame(double xLayout, double yLayout, double rectWidth, double rectHeight,
                                        String c) {
        StackPane stackPane = new StackPane();
        stackPane.setLayoutX(xLayout);
        stackPane.setLayoutY(yLayout);
        Rectangle rectangle = new Rectangle(rectWidth, rectHeight);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.WHITE);
        Text text = new Text(c);
        text.setStroke(Color.BLACK);
        stackPane.getChildren().addAll(rectangle, text);
        return stackPane;
    }

    public static StackPane createCorner(double xLayout, double yLayout, double rectWidth, double rectHeight) {
        StackPane stackPane = new StackPane();
        stackPane.setLayoutX(xLayout);
        stackPane.setLayoutY(yLayout);
        Rectangle rectangle = new Rectangle(rectWidth, rectHeight);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        stackPane.getChildren().addAll(rectangle);
        return stackPane;
    }

    public static int numbersToInt(int index) {
        return Integer.parseInt(NUMBERS[index]);
    }

    public static int reverseNumbersToInt(int index) {
        return Integer.parseInt(REVERSE_NUMBERS[index]);
    }

}
