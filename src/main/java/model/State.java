package model;

import javafx.scene.paint.Color;
import model.graphic.*;

import java.util.ArrayList;
import java.util.List;

public class State
{
    private final List<ChessPiece> whitePieces;

    private final List<ChessPiece> blackPieces;

    /** action describes how the state came to be. */
    private Action action;

    private int utility = Integer.MIN_VALUE;

    public int getUtility()
    {
        return utility;
    }

    public void setUtility(final int utility)
    {
        this.utility = utility;
    }

    public State(final List<ChessPiece> whitePieces, final List<ChessPiece> blackPieces)
    {
        this.whitePieces = whitePieces;
        this.blackPieces = blackPieces;
    }

    public static State copyOf(final State state)
    {
        return state.copy();
    }

    public static State empty()
    {
        return new State(new ArrayList<>(), new ArrayList<>());
    }

    public boolean hasEnemy(final Pos pos, final Color color)
    {
        if (color.equals(Color.WHITE))
        {
            return getBlackPieces().stream().anyMatch(c -> c.getPos().equals(pos));
        }
        else
        {
            return getWhitePieces().stream().anyMatch(c -> c.getPos().equals(pos));
        }
    }

    public boolean isEmpty(final Pos pos)
    {
        return getWhitePieces().stream().noneMatch(c -> c.getPos().equals(pos)) &&
                getBlackPieces().stream().noneMatch(c -> c.getPos().equals(pos));
    }

    public boolean isEmpty(final Pos... positions)
    {
        for (Pos pos : positions) {
            if (!(isEmpty(pos))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Determines whether the specified color has but the opposing color in check during this state,
     * and the opposing color has no legal moves to make, or the opposing color has no king on the board.
     * @param color the color.
     * @return a boolean.
     */
    // Todo: does not always work.
    public boolean checkmate(final Color color)
    {
        if (color.equals(Color.WHITE))
        {
            return getBlackPieces().stream().noneMatch(c -> c instanceof King) ||
                    getBlackPieces().stream().allMatch(c -> c.legalMoves(this)
                            .isEmpty());
        }
        else
        {
            return getWhitePieces().stream().noneMatch(c -> c instanceof King) ||
                    getWhitePieces().stream().allMatch(c -> c.legalMoves(this)
                            .isEmpty());
        }
    }

    /** does the specified color put the opponents king in check in this state? */
    public boolean check(final Color color)
    {
        if (color.equals(Color.WHITE))
        {
            final Pos posKing = this.getBlackPieces().stream().filter(c -> c instanceof King)
                    .findFirst().orElseThrow().getPos();
            return getWhitePieces().stream().anyMatch(c -> c.moves(this).contains(posKing));
        }
        else
        {
            final Pos posKing = this.getWhitePieces().stream().filter(c -> c instanceof King)
                    .findFirst().orElseThrow().getPos();
            return getBlackPieces().stream().anyMatch(c -> c.moves(this).contains(posKing));
        }
    }

    /**
     * First removes any <code>ChessPiece</code> which has a <code>Pos</code> value equal to posNext, then further
     * modifies the <code>State</code> by changing the <code>Pos</code> value to
     * posNext for whatever <code>ChessPiece</code> has a <code>Pos</code> value equal to posPrev.
     * @return this <code>State</code>.
     */
    public final State update(final Pos posPrev, final Pos posNext)
    {
        this.getWhitePieces().removeIf(c -> c.getPos().equals(posNext));
        this.getBlackPieces().removeIf(c -> c.getPos().equals(posNext));

        for (ChessPiece c : getWhitePieces())
        {
            if (c.getPos().equals(posPrev))
            {
                if (c instanceof Pawn && Pawn.END_ZONE_WHITE.contains(posNext))
                    c = new Queen(Color.WHITE);
                c.setPos(posNext);
                this.setAction(new Action(posPrev, posNext));
                return this;
            }
        }

        for (ChessPiece c : getBlackPieces())
        {
            if (c.getPos().equals(posPrev))
            {
                if (c instanceof Pawn && Pawn.END_ZONE_BLACK.contains(posNext))
                    c = new Queen(Color.BLACK);
                c.setPos(posNext);
                this.setAction(new Action(posPrev, posNext));
                break;
            }
        }
        return this;
    }

    public State update(final ChessPiece chessPiece, final Square squareNext)
    {
        return this.update(chessPiece.getPos(), squareNext.pos());
    }

    public State update(final Action action)
    {
        return this.update(action.getPosStart(), action.getPosEnd());
    }

    private State copy()
    {
        final State copy = State.empty();

        this.getWhitePieces().forEach(c -> {
            try {
                copy.getWhitePieces().add(c.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        });

        this.getBlackPieces().forEach(c -> {
            try {
                copy.getBlackPieces().add(c.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        });

        return copy;
    }

    public List<ChessPiece> getWhitePieces()
    {
        return whitePieces;
    }

    public List<ChessPiece> getBlackPieces()
    {
        return blackPieces;
    }

    public void setAction(final Action action)
    {
        this.action = action;
    }

    public Action getAction()
    {
        return action;
    }

    public boolean withinBounds(final Pos pos)
    {
        return pos != null && 1 <= pos.getX() && pos.getX() <= 8 && 1 <= pos.getY() && pos.getY() <= 8;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof State))
            return false;
        if (o == this)
            return true;

        State state = (State) o;
        return state.getWhitePieces().equals(this.getWhitePieces()) &&
                state.getBlackPieces().equals(this.getBlackPieces());
    }
}
