package model.minmax;

import model.Pos;

public class Action
{
    private final Pos posStart;

    private final Pos posEnd;

    public Action(final Pos posStart, final Pos posEnd)
    {
        this.posStart = posStart;
        this.posEnd = posEnd;
    }

    public Pos getPosStart() {
        return posStart;
    }

    public Pos getPosEnd() {
        return posEnd;
    }
}
