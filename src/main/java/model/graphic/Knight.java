package model.graphic;

import javafx.scene.paint.Color;
import model.Pos;
import model.State;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;

import java.util.ArrayList;
import java.util.List;

public class Knight extends ChessPiece
{
    private final static int VALUE = 3;

    private final static FontAwesomeSolid ICON = FontAwesomeSolid.CHESS_KNIGHT;

    public Knight(final Color color) {
        super(Knight.ICON, color);
    }

    public Knight(final Color color, final Pos pos)
    {
        super(color, pos);
    }


    @Override
    public List<Pos> moves(final State board) {
        return new ArrayList<>() {
            {
                // POS X-AXIS & POS Y-AXIS
                Pos pos1 = new Pos(getPos(), 1, 2);
                if (board.withinBounds(pos1) && (board.isEmpty(pos1) || board.hasEnemy(pos1, getColor())))
                    add(pos1);

                Pos pos2 = new Pos(getPos(), 2, 1);
                if (board.withinBounds(pos2) && (board.isEmpty(pos2) || board.hasEnemy(pos2, getColor())))
                    add(pos2);

                // POS X-AXIS & NEG Y-AXIS
                Pos pos3 = new Pos(getPos(), 1, -2);
                if (board.withinBounds(pos3) && (board.isEmpty(pos3) || board.hasEnemy(pos3, getColor())))
                    add(pos3);

                Pos pos4 = new Pos(getPos(), 2, -1);
                if (board.withinBounds(pos4) && (board.isEmpty(pos4) || board.hasEnemy(pos4, getColor())))
                    add(pos4);

                // NEG X-AXIS & POS Y-AXIS
                Pos pos5 = new Pos(getPos(), -1, 2);
                if (board.withinBounds(pos5) && (board.isEmpty(pos5) || board.hasEnemy(pos5, getColor())))
                    add(pos5);

                Pos pos6 = new Pos(getPos(), -2, 1);
                if (board.withinBounds(pos6) && (board.isEmpty(pos6) || board.hasEnemy(pos6, getColor())))
                    add(pos6);

                // NEG X-AXIS & NEG Y-AXIS
                Pos pos7 = new Pos(getPos(), -1, -2);
                if (board.withinBounds(pos7) && (board.isEmpty(pos7) || board.hasEnemy(pos7, getColor())))
                    add(pos7);

                Pos pos8 = new Pos(getPos(), -2, -1);
                if (board.withinBounds(pos8) && (board.isEmpty(pos8) || board.hasEnemy(pos8, getColor())))
                    add(pos8);
            }
        };
    }

    @Override
    public long value() {
        return Knight.VALUE;
    }

    public ChessPiece clone() throws CloneNotSupportedException
    {
        ChessPiece clone = super.clone();
        if (clone == this) {
            return new Knight(this.getColor(), this.getPos().clone());
        }
        return clone;
    }
}
