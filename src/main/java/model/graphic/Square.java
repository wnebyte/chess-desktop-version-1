package model.graphic;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import model.Pos;
import util.GUIUtils;

public class Square extends StackPane
{
    private final Pos pos;

    private final Rectangle rectangle;

    private final Paint FILL;

    private final static Color STROKE = Color.BLACK;

    private final static double STROKE_WIDTH = 2.0;

    private final static Color STROKE_QUEUED = Color.LIGHTGREEN;

    private final static double STROKE_WIDTH_QUEUED = 3.0;

    public Square(final int size, final Color color, int x, int y)
    {
        this.pos = new Pos(x, y);
        rectangle = new Rectangle(size, size);
        rectangle.setFill(color);
        rectangle.setStroke(STROKE);
        rectangle.setStrokeWidth(STROKE_WIDTH);
        this.FILL = color;
        this.getChildren().add(rectangle);
    }

    /**
     * Sets the values for stroke, and stroke width to display a highlighting effect around the <code>Square</code>.
     */
    public void queue()
    {
        GUIUtils.runSafe(() -> {
            rectangle.setStroke(STROKE_QUEUED);
            rectangle.setStrokeWidth(STROKE_WIDTH_QUEUED);
        });
    }

    /**
     * Resets the stroke, and stroke width to their default values.
     */
    public void deque()
    {
        GUIUtils.runSafe(() -> {
            this.rectangle.setStroke(STROKE);
            this.rectangle.setStrokeWidth(STROKE_WIDTH);
        });
    }

    /**
     * Sets the stroke to be the specified color and with a larger width for the specified amount of ms.
     * @param color the color.
     * @param timeout the amount of time in ms.
     */
    public void setStroke(final Color color, long timeout)
    {
        GUIUtils.runAsync(() -> {
            this.rectangle.setStroke(color);
            this.rectangle.setStrokeWidth(STROKE_WIDTH);
            try {
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                this.deque();
            }
        });
    }

    public void setFill(final Color color)
    {
        GUIUtils.runSafe(() -> this.rectangle.setFill(color));
    }

    public void resetFill()
    {
        GUIUtils.runSafe(() -> this.rectangle.setFill(FILL));
    }

    public void set(final ChessPiece chessPiece)
    {
        this.removeChessPiece();
        GUIUtils.runSafe(() -> {
            chessPiece.setPos(this.pos);
            this.getChildren().add(chessPiece);
        });
    }

    protected ChessPiece removeChessPiece()
    {
        ChessPiece chessPiece = this.getChessPiece();
        GUIUtils.runSafe(() -> {if (chessPiece != null) this.getChildren().remove(chessPiece);});
        return chessPiece;
    }

    /** returns the reference to this square's potential chessPiece. */
    public ChessPiece getChessPiece()
    {
        return (ChessPiece) getChildren().stream().filter(node -> node instanceof ChessPiece).findFirst()
                .orElse(null);
    }

    /** determines whether this square's chessPiece reference is null. */
    public boolean isEmpty()
    {
        return getChildren().stream().noneMatch(node -> node instanceof ChessPiece);
    }

    /** returns the position of this square within the board. */
    public Pos pos() {
        return pos;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Square))
            return false;

        Square square = (Square) o;
        return square.pos.equals(this.pos) && square.rectangle.equals(this.rectangle);
    }

    @Override
    public int hashCode() {
        int result = 31;
        return 12 + 77 + (int)Math.round(this.pos.getX()) +
                (int)Math.round(this.pos.getY()) + (int)Math.round(this.rectangle.getWidth()) + result;
    }
}
