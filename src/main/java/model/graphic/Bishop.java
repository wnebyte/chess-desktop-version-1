package model.graphic;

import javafx.scene.paint.Color;
import model.Pos;
import model.State;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends ChessPiece
{
    private final static FontAwesomeSolid ICON = FontAwesomeSolid.CHESS_BISHOP;

    private final static int VALUE = 3;

    public Bishop(final Color color)
    {
        super(Bishop.ICON, color);
    }

    public Bishop(final Color color, final Pos pos)
    {
        super(color, pos);
    }

    @Override
    public List<Pos> moves(final State board) {
        return new ArrayList<>() {
            {
                // POS X-AXIS & POS Y-AXIS
                int x = 1;
                int y = 1;
                boolean isEmpty = true;
                while (x <= 8 && y <= 8 && isEmpty) {
                    Pos pos = new Pos(getPos(), x, y);
                    if (board.withinBounds(pos) && (((isEmpty)=board.isEmpty(pos)) || board.hasEnemy(pos, getColor())))
                        add(pos);
                    else
                        break;
                    x++;
                    y++;
                }

                // POS X-AXIS & NEG Y-AXIS
                x = 1;
                y = -1;
                isEmpty = true;
                while (x <= 8 && -8 <= y && isEmpty) {
                    Pos pos = new Pos(getPos(), x, y);
                    if (board.withinBounds(pos) && (((isEmpty)=board.isEmpty(pos)) || board.hasEnemy(pos, getColor())))
                        add(pos);
                    else {
                        break;
                    }
                    x++;
                    y--;
                }

                // NEG X-AXIS & POS Y-AXIS
                x = -1;
                y = 1;
                isEmpty = true;
                while (-8 <= x && y <= 8 && isEmpty) {
                    Pos pos = new Pos(getPos(), x, y);
                    if (board.withinBounds(pos) && (((isEmpty)=board.isEmpty(pos)) || board.hasEnemy(pos, getColor())))
                        add(pos);
                    else
                        break;
                    x--;
                    y++;
                }

                // NEG X-AXIS & NEG Y-AXIS
                x = -1;
                y = -1;
                isEmpty = true;
                while (-8 <= x && -8 <= y && isEmpty) {
                    Pos pos = new Pos(getPos(), x, y);
                    if (board.withinBounds(pos) && (((isEmpty)=board.isEmpty(pos)) || board.hasEnemy(pos, getColor())))
                        add(pos);
                    else
                        break;
                    x--;
                    y--;
                }
            }
        };
    }

    @Override
    public long value()
    {
        return Bishop.VALUE;
    }

    @Override
    public ChessPiece clone() throws CloneNotSupportedException
    {
        ChessPiece clone = super.clone();
        if (clone == this)
        {
            return new Bishop(this.getColor(), this.getPos().clone());
        }
        return clone;
    }

}
