package model.graphic;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import model.Pos;
import model.State;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;
import org.kordamp.ikonli.javafx.FontIcon;

import java.util.List;

public abstract class ChessPiece extends Label implements Cloneable
{
    private final FontIcon icon;

    private final Color color;

    private Pos pos;

    protected ChessPiece(final FontAwesomeSolid font, final Color color) {
        this.icon = FontIcon.of(font, 34, color);
        this.icon.setStroke(color.equals(Color.WHITE) ? Color.BLACK : Color.WHITE);
        this.setGraphic(icon);
        this.color = color;
        this.pos = null;
    }

    protected ChessPiece(final FontAwesomeSolid font, final Color color, final Pos pos)
    {
        this.icon = FontIcon.of(font, 34, color);
        this.icon.setStroke(color.equals(Color.WHITE) ? Color.BLACK : Color.WHITE);
        this.setGraphic(icon);
        this.color = color;
        this.pos = pos;
    }

    /** Called by Clone. */
    protected ChessPiece(final Color color, final Pos pos)
    {
        this.icon = null;
        this.color = color;
        this.pos = pos;
    }

    public abstract List<Pos> moves(final State board);

    public List<Pos> legalMoves(final State board)
    {
        List<Pos> moves = this.moves(board);
        moves.removeIf(pos -> State.copyOf(board).update(this.getPos(), pos)
                .check(this.getColor().equals(Color.WHITE) ? Color.BLACK : Color.WHITE));
        return moves;
    }

    public abstract long value();

    public Color getColor() {
        return color;
    }

    public Pos getPos() {
        return pos;
    }

    public void setPos(final Pos pos)
    {
        this.pos = pos;
    }

    @Override
    public ChessPiece clone() throws CloneNotSupportedException
    {
        return (ChessPiece) super.clone();
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof ChessPiece))
            return false;
        if (o == this)
            return true;

        ChessPiece chessPiece = (ChessPiece) o;
        return chessPiece.getColor().equals(this.getColor()) &&
                chessPiece.getPos().equals(this.getPos()) &&
                chessPiece.value() == this.value() &&
                chessPiece.getClass().equals(this.getClass());
    }
}
