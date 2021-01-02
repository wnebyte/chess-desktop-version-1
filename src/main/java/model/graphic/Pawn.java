package model.graphic;

import javafx.scene.paint.Color;
import model.Pos;
import model.State;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class represents a Pawn.
 */
public class Pawn extends ChessPiece
{
    public final static List<Pos> INIT_POS_WHITE =
            Arrays.asList(new Pos('A',2), new Pos('B', 2), new Pos('C', 2), new Pos('D', 2),
                    new Pos('E', 2), new Pos('F', 2), new Pos('G', 2), new Pos('H', 2));

    public final static List<Pos> END_ZONE_WHITE =
            Arrays.asList(new Pos('A', 8), new Pos('B', 8), new Pos('C', 8), new Pos('D', 8),
                    new Pos('E', 8), new Pos('F', 8), new Pos('G', 8), new Pos('H', 8));

    public final static List<Pos> INIT_BLACK_POS =
            Arrays.asList(new Pos(1,7), new Pos(2, 7), new Pos(3, 7), new Pos(4, 7),
                    new Pos(5, 7), new Pos(6, 7), new Pos(7 ,7), new Pos(8, 7));

    public final static List<Pos> END_ZONE_BLACK =
            Arrays.asList(new Pos('A', 1), new Pos('B', 1), new Pos('C', 1), new Pos('D', 1),
                    new Pos('E', 1), new Pos('F', 1), new Pos('G', 1), new Pos('H', 1));

    private final static FontAwesomeSolid ICON = FontAwesomeSolid.CHESS_PAWN;

    private final static int VALUE = 1;

    public Pawn(final Color color) {
        super(Pawn.ICON, color);
    }

    public Pawn(final Color color, final Pos pos) {
        super(color, pos);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Pos> moves(final State board)
    {
        return new ArrayList<>() {
            {
                if (getColor() == Color.WHITE)
                {
                    // CONST X-AXIS & POS Y-AXIS
                    Pos pos1 = new Pos(getPos(), 0, 1);
                    if (board.withinBounds(pos1) && board.isEmpty(pos1))
                        add(pos1);

                    if (INIT_POS_WHITE.contains(getPos()))
                    {
                        Pos pos2 = new Pos(getPos(), 0, 2);
                        if (board.withinBounds(pos2) && board.isEmpty(pos1, pos2))
                            add(pos2);
                    }

                    // POS X-AXIS & POS Y-AXIS #CAPTURE MOVE
                    Pos pos3 = new Pos(getPos(), 1, 1);
                    if (board.withinBounds(pos3) && board.hasEnemy(pos3, getColor()))
                        add(pos3);

                    // NEG X-AXIS & POS Y-AXIS #CAPTURE MOVE
                    Pos pos4 = new Pos(getPos(), -1, 1);
                    if (board.withinBounds(pos4) && board.hasEnemy(pos4, getColor()))
                        add(pos4);
                }

                if (getColor() == Color.BLACK)
                {
                    // CONST X-AXIS & NEG Y-AXIS
                    Pos pos1 = new Pos(getPos(), 0, -1);
                    if (board.withinBounds(pos1) && board.isEmpty(pos1))
                        add(pos1);

                    if (INIT_BLACK_POS.contains(getPos()))
                    {
                        Pos pos2 = new Pos(getPos(), 0, -2);
                        if (board.withinBounds(pos2) && board.isEmpty(pos1, pos2))
                            add(pos2);
                    }

                    // POS X-AXIS & NEG Y-AXIS #CAPTURE MOVE
                    Pos pos3 = new Pos(getPos(), 1, -1);
                    if (board.withinBounds(pos3) && board.hasEnemy(pos3, getColor()))
                        add(pos3);

                    // NEG X-AXIS & NEG Y-AXIS #CAPTURE MOVE
                    Pos pos4 = new Pos(getPos(), -1, -1);
                    if (board.withinBounds(pos4) && board.hasEnemy(pos4, getColor()))
                        add(pos4);
                }
            }
        };
    }

    public boolean inEndZone()
    {
        return this.getColor().equals(Color.WHITE) ?
                END_ZONE_WHITE.contains(this.getPos()) : END_ZONE_BLACK.contains(this.getPos());
    }

    @Override
    public long value()
    {
        return Pawn.VALUE;
    }

    @Override
    public ChessPiece clone() throws CloneNotSupportedException
    {
        ChessPiece clone = super.clone();
        if (clone == this) {
            return new Pawn(this.getColor(), this.getPos().clone());
        }
        return clone;
    }

}
