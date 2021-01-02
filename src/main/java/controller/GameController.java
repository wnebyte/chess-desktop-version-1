package controller;

import model.*;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import model.graphic.*;
import model.minmax.Action;
import model.minmax.SearchSpace;
import org.kordamp.ikonli.Ikon;
import util.GUIUtils;
import util.StateGenerator;

import java.util.List;

public class GameController
{
    @FXML
    private Board board;

    private boolean lock = false;

    public void initialize() {
        StateGenerator.checkmate(this.board);
        board.setOnMouseClicked(this::event);
    }

    /**
     *
     */
    @FXML
    private void event(final MouseEvent event) {
        final Node node = event.getPickResult().getIntersectedNode().getParent();

        if (node instanceof Square) {
            Square square = (Square) node;
            try {
                if (!lock) {
                    lock = true;
                    this.ply(square);
                }
            } finally {
                lock = false;
            }
        } else if (node instanceof ChessPiece) {
            assert node.getParent() instanceof Square;
            Square square = (Square) node.getParent();
            try {
                if (!lock) {
                    lock = true;
                    this.ply(square);
                }
            } finally {
                lock = false;
            }
        } else if (node instanceof Ikon) {
            assert node.getParent().getParent() instanceof Square;
            Square square = (Square) node.getParent().getParent();
            try {
                if (!lock) {
                    lock = true;
                    this.ply(square);
                }
            } finally {
                lock = false;
            }
        }
    }

    /**
     *
     */
    private void ply(final Square square) {
        if (!square.isEmpty() && square.getChessPiece().getColor().equals(Color.WHITE))
        {
            board.queue(square);
        }

        else if (board.isQueued() && (square.isEmpty() || square.getChessPiece().getColor().equals(Color.BLACK)))
        {
            State state = board.toState();
            List<Pos> moves = board.getQueued().getChessPiece().moves(state);

            if (moves.contains(square.pos()))
            {
                if (state.update(board.getQueued().getChessPiece(), square).check(Color.BLACK))
                {
                    square.setStroke(Color.RED, 750);
                    return;
                }

                board.update(new Action(board.getQueued().pos(), square.pos()));
                board.deque();

                if (state.checkmate(Color.WHITE))
                {
                    System.out.println("CHECKMATE WHITE!");
                    this.end();
                }
                else
                    GUIUtils.runAsync(() -> this.response(state));
            }
        }
    }

    public void response(final State state) {
        Timer timer = new Timer();
        timer.start();
        SearchSpace searchSpace = new SearchSpace(new struct.Node<>(state));
        State newState = searchSpace.decision();
        timer.stop();

        try {
            long RESPONSE_WAIT = 3000;
            Thread.sleep(timer.getTime() < RESPONSE_WAIT ? (RESPONSE_WAIT - timer.getTime()) : 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            board.update(newState.action());
            if (newState.checkmate(Color.BLACK)) {
                System.out.println("CHECKMATE BLACK!");
                this.end();
            }
        }
    }

    private void end() {
        this.board.onMouseClickedProperty().set(null);
    }

    private void initBoard()
    {
        int x = 1;
        int y1 = 2;
        int y2 = 7;

        while (x <= 8) {
            board.get(x, y1).set(new Pawn(Color.WHITE));
            board.get(x, y2).set(new Pawn(Color.BLACK));
            x++;
        }

        board.get('A', 1).set(new Rook(Color.WHITE));
        board.get('B', 1).set(new Knight(Color.WHITE));
        board.get('C', 1).set(new Bishop(Color.WHITE));
        board.get('D', 1).set(new Queen(Color.WHITE));
        board.get('E', 1).set(new King(Color.WHITE));
        board.get('F', 1).set(new Bishop(Color.WHITE));
        board.get('G', 1).set(new Knight(Color.WHITE));
        board.get('H', 1).set(new Rook(Color.WHITE));

        board.get('A', 8).set(new Rook(Color.BLACK));
        board.get('B', 8).set(new Knight(Color.BLACK));
        board.get('C', 8).set(new Bishop(Color.BLACK));
        board.get('D', 8).set(new Queen(Color.BLACK));
        board.get('E', 8).set(new King(Color.BLACK));
        board.get('F', 8).set(new Bishop(Color.BLACK));
        board.get('G', 8).set(new Knight(Color.BLACK));
        board.get('H', 8).set(new Rook(Color.BLACK));

    }
}
