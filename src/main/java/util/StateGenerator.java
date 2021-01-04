package util;

import javafx.scene.paint.Color;
import model.Pos;
import model.State;
import model.graphic.*;

import java.util.ArrayList;
import java.util.List;

public class StateGenerator
{

    public static void lonelyWhitePawn(final Board board)
    {
        board.get('H', 1).set(new King(Color.WHITE));
        board.get('H', 8).set(new King(Color.BLACK));
        board.get('D', 2).set(new Pawn(Color.WHITE));
    }

    public static void checkmateBlack(final Board board)
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

    public static State checkmateBlack()
    {
        List<ChessPiece> whitePieces = new ArrayList<>() {
            {
                add(new King(Color.WHITE, new Pos('C', 1)));
            }
        };

        List<ChessPiece> blackPieces = new ArrayList<>() {
            {
                add(new Rook(Color.BLACK, new Pos('H', 1)));
                add(new Rook(Color.BLACK, new Pos('E', 2)));
                add(new Queen(Color.BLACK, new Pos('H', 4)));
                add(new King(Color.BLACK, new Pos('D', 8)));
                add(new Bishop(Color.BLACK, new Pos('B', 5)));
                add(new Bishop(Color.BLACK, new Pos('D', 1)));
            }
        };

        return new State(whitePieces, blackPieces);
    }

}
