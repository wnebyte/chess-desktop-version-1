package util;

import javafx.scene.paint.Color;
import model.graphic.*;

public class StateGenerator
{
    public static void checkmate(final Board board)
    {
        board.clear();
        board.get('B', 2).set(new King(Color.WHITE));
        board.get('A', 8).set(new Knight(Color.BLACK));
        board.get('H', 1).set(new Rook(Color.BLACK));
        board.get('F', 5).set(new Bishop(Color.BLACK));
        board.get('C', 8).set(new Rook(Color.BLACK));
        board.get('D', 8).set(new King(Color.BLACK));
        board.get('E', 3).set(new Queen(Color.BLACK));
        board.get('A', 6).set(new Bishop(Color.BLACK));
    }
}
