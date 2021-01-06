package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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
            put('a', 1); put('A', 1);
            put('b', 2); put('B', 2);
            put('c', 3); put('C', 3);
            put('d', 4); put('D', 4);
            put('e', 5); put('E', 5);
            put('f', 6); put('F', 6);
            put('g', 7); put('G', 7);
            put('h', 8); put('H', 8);
        }
    };

    public Pos(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public Pos(final char x, final int y) {
        if (!table.containsKey(x))
            throw new IllegalArgumentException(
                    "x is not a valid char"
            );

        this.x = table.get(x);
        this.y = y;
    }

    public Pos(final Pos pos, final int relX, final int relY)
    {
        if (Objects.isNull(pos))
            throw new IllegalArgumentException(
                    "pos may not be null"
            );

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
        if (o == this)
            return true;

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
        String x = String.valueOf(this.x);

        for (Map.Entry<Character, Integer> entry : table.entrySet())
        {
            if (entry.getValue() == this.x)
            {
                x = String.valueOf(entry.getKey());
                break;
            }
        }

        return String.format("[%s, %d]", x, this.y);
    }
}
