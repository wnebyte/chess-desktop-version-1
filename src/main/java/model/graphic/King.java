package model.graphic;

import javafx.scene.paint.Color;
import model.Pos;
import model.State;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;

import java.util.ArrayList;
import java.util.List;

public class King extends ChessPiece
{
    private final static FontAwesomeSolid ICON = FontAwesomeSolid.CHESS_KING;

    private final static int VALUE = 100;

    public King(final Color color) {
        super(King.ICON, color);
    }

    public King(final Color color, final Pos pos) {
        super(color, pos);
    }

    @Override
    public List<Pos> moves(final State board)
    {
        return new ArrayList<>() {
            {
                // POS X-AXIS & CONST Y-AXIS
                Pos pos1 = new Pos(getPos(), 1, 0);
                if (board.withinBounds(pos1) && (board.isEmpty(pos1) || board.hasEnemy(pos1, getColor())))
                    add(pos1);

                // NEG X-AXIS & CONST Y-AXIS
                Pos pos2 = new Pos(getPos(), -1, 0);
                if (board.withinBounds(pos2) && (board.isEmpty(pos1) || board.hasEnemy(pos2, getColor())))
                    add(pos2);

                // CONST X-AXIS & POS Y-AXIS
                Pos pos3 = new Pos(getPos(), 0, 1);
                if (board.withinBounds(pos3) && (board.isEmpty(pos3) || board.hasEnemy(pos3, getColor())))
                    add(pos3);

                // CONST X-AXIS & NEG Y-AXIS
                Pos pos4 = new Pos(getPos(), 0, -1);
                if (board.withinBounds(pos4) && (board.isEmpty(pos4) || board.hasEnemy(pos4, getColor())))
                    add(pos4);

                // POS X-AXIS & POS Y-AXIS
                Pos pos5 = new Pos(getPos(), 1, 1);
                if (board.withinBounds(pos5) && (board.isEmpty(pos5) || board.hasEnemy(pos5, getColor())))
                    add(pos5);

                // POS X-AXIS & NEG Y-AXIS
                Pos pos6 = new Pos(getPos(), 1, -1);
                if (board.withinBounds(pos6) && (board.isEmpty(pos6) || board.hasEnemy(pos6, getColor())))
                    add(pos6);

                // NEG X-AXIS & POS Y-AXIS
                Pos pos7 = new Pos(getPos(), -1, 1);
                if (board.withinBounds(pos7) && (board.isEmpty(pos7) || board.hasEnemy(pos7, getColor())))
                    add(pos7);

                // NEG X-AXIS & NEG Y-AXIS
                Pos pos8 = new Pos(getPos(), -1, -1);
                if (board.withinBounds(pos8) && (board.isEmpty(pos8) || board.hasEnemy(pos8, getColor())))
                    add(pos8);
            }
        };
    }

    @Override
    public long value()
    {
        return King.VALUE;
    }

    @Override
    public ChessPiece clone() throws CloneNotSupportedException
    {
        ChessPiece clone = super.clone();
        if (clone == this) {
            return new King(this.getColor(), this.getPos().clone());
        }
        return clone;
    }
}
