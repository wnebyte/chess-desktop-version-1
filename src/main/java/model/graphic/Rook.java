package model.graphic;

import javafx.scene.paint.Color;
import model.Pos;
import model.State;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;

import java.util.ArrayList;
import java.util.List;

public class Rook extends ChessPiece
{
    private final static int VALUE = 5;

    private final static FontAwesomeSolid ICON = FontAwesomeSolid.CHESS_ROOK;

    public Rook(final Color color) {
        super(Rook.ICON, color);
    }

    public Rook(final Color color, final Pos pos) {
        super(color, pos);
    }

    @Override
    public List<Pos> moves(final State board) {
        return new ArrayList<>() {
            {
                // POS X-AXIS & CONST Y-AXIS
                int x = 1;
                int y = 0;
                boolean isEmpty = true;
                while (x <= 8 && isEmpty) {
                    Pos pos = new Pos(getPos(), x, y);
                    if (board.withinBounds(pos) && (((isEmpty)=board.isEmpty(pos)) || board.hasEnemy(pos, getColor())))
                    {
                        add(pos);
                    }
                    else {
                        break;
                    }
                    x++;
                }

                // NEG X-AXIS & CONST Y-AXIS
                x = -1;
                y = 0;
                isEmpty = true;
                while (x >= -8 && isEmpty) {
                    Pos pos = new Pos(getPos(), x, y);
                    if (board.withinBounds(pos) && (((isEmpty)=board.isEmpty(pos)) || board.hasEnemy(pos, getColor())))
                    {
                        add(pos);
                    }
                    else {
                        break;
                    }
                    x--;
                }

                // CONST X-AXIS & POS Y-AXIS
                x = 0;
                y = 1;
                isEmpty = true;
                while (y <= 8 && isEmpty) {
                    Pos pos = new Pos(getPos(), x, y);
                    if (board.withinBounds(pos) && (((isEmpty)=board.isEmpty(pos)) || board.hasEnemy(pos, getColor())))
                    {
                        add(pos);
                    }
                    else {
                        break;
                    }
                    y++;
                }

                // CONST X-AXIS & NEG Y-AXIS
                x = 0;
                y = -1;
                isEmpty = true;
                while (-8 <= y && isEmpty) {
                    Pos pos = new Pos(getPos(), x, y);
                    if (board.withinBounds(pos) && (((isEmpty)=board.isEmpty(pos)) || board.hasEnemy(pos, getColor())))
                    {
                        add(pos);
                    }
                    else {
                        break;
                    }
                    y--;
                }
            }
        };
    }

    @Override
    public long value()
    {
        return Rook.VALUE;
    }

    @Override
    public ChessPiece clone() throws CloneNotSupportedException
    {
        ChessPiece clone = super.clone();
        if (clone == this) {
            return new Rook(this.getColor(), this.getPos().clone());
        }
        return clone;
    }
}
