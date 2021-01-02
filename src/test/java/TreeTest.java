import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Pos;
import model.State;
import model.graphic.*;
import model.minmax.Action;
import model.minmax.SearchSpace;
import struct.Node;

import java.util.ArrayList;
import java.util.List;

public class TreeTest extends Application
{
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Board.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        test00();
    }

    public void test00() {
        State state = this.checkmateBlack();
        System.out.println(state.checkmate(Color.BLACK));
        System.out.println(state.getWhitePieces().stream().filter(c -> c instanceof King)
        .findFirst().orElseThrow().legalMoves(state).size());
    }



    private State generateState()
    {
        List<ChessPiece> whitePieces = new ArrayList<>() {
            {
                add(new Pawn(Color.WHITE, new Pos('A', 6)));
                add(new King(Color.WHITE, new Pos('B', 1)));
            }
        };

        List<ChessPiece> blackPieces = new ArrayList<>() {
            {
                add(new Pawn(Color.BLACK, new Pos('H', 3)));
                add(new King(Color.BLACK, new Pos('G', 8)));
            }
        };

        return new State(whitePieces, blackPieces);
    }

    private State checkmateBlack()
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

    private State checkmateBlack2()
    {
        List<ChessPiece> whitePieces = new ArrayList<>() {
            {
                add(new King(Color.WHITE, new Pos('A', 1)));
            }
        };

        List<ChessPiece> blackPieces = new ArrayList<>() {
            {
                add(new Rook(Color.BLACK, new Pos('H', 8)));
                add(new Rook(Color.BLACK, new Pos('E', 5)));
                add(new Queen(Color.BLACK, new Pos('B', 1)));
                add(new King(Color.BLACK, new Pos('E', 7)));
                add(new Bishop(Color.BLACK, new Pos('C', 4)));
                add(new Bishop(Color.BLACK, new Pos('F', 5)));
            }
        };

        return new State(whitePieces, blackPieces);
    }

}
