package model;

import java.util.HashMap;

/**
 * Class represents the position of a {@link model.graphic.Square}, and or
 * {@link model.graphic.ChessPiece} within their {@link model.graphic.Board} parent.
 */
public class Pos implements Cloneable
{
    private final int x;

    private final int y;

    private final static HashMap<Character, Integer> table = new HashMap<>()
    {
        {
            put('A', 1);put('B', 2);put('C', 3);put('D', 4);
            put('E', 5);put('F', 6);put('G', 7);put('H', 8);
        }
    };

    public Pos(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public Pos(final char x, final int y) {
        this.x = table.get(x);
        this.y = y;
    }

    public Pos(final Pos pos, final int relX, final int relY) {
        this.x = pos.getX() + relX;
        this.y = pos.getY() + relY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (!( o instanceof Pos))
            return false;

        Pos pos = (Pos) o;
        return pos.x == this.x && pos.y == this.y;
    }

    @Override
    public int hashCode() {
        int result = 27;
        return 45 + this.x + 33 + this.y + result;
    }

    @Override
    public Pos clone() throws CloneNotSupportedException {
        Pos clone = (Pos) super.clone();
        return new Pos(this.x, this.y);
    }

    @Override
    public String toString() {
        return String.format("(%s, %d)", table.entrySet().stream()
                .filter(kv -> kv.getValue() == x).findFirst().orElseThrow().getKey(), y);
    }
}
