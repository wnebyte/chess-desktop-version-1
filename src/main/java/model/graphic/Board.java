package model.graphic;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import model.Pos;
import model.State;
import model.Action;
import util.FrameCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Board extends Group
{
    /** shorthand reference to class's Node Squares. */
    private final List<Square> squares = new ArrayList<>();

    /** shorthand reference to class's potentially queued Node Square. */
    private Square queued = null;

    private final List<Square> legal = new ArrayList<>();

    /** constructor creates the board, and assigns values to the class's fields. */
    public Board()
    {
        final int size = 75;
        final double padding = size / 2.0;
        boolean white = true;

        for (int row = 0; row < 8; row++)
        {
            final String NUM = FrameCreator.REVERSE_NUMBERS[row];
            getChildren().add(FrameCreator.createFrame(0, padding + size * row,
                    padding, size, NUM));

            for (int col = 0; col < 8; col++)
            {
                final String LETTER = FrameCreator.LETTERS[col];
                getChildren().add(FrameCreator.createFrame(padding + col * size, 0,
                        size, padding, LETTER));

                white = !white;
                Square square = new Square(size, white ? Color.WHITE : Color.BLACK,
                        FrameCreator.numbersToInt(col), FrameCreator.reverseNumbersToInt(row));
                square.setLayoutX(padding + col * size);
                square.setLayoutY(padding + row * size);
                Text text = new Text(NUM + LETTER);
                text.setFill(Color.PURPLE);
                square.getChildren().add(text);
                getChildren().add(square);
                squares.add(square);

                getChildren().add(FrameCreator.createFrame(padding + size * 8, padding + size * col,
                        padding, size, ""));
            }
            white = !white;

            getChildren().add(FrameCreator.createFrame(padding + size * row, padding + size * 8,
                    size, padding, ""));
        }

    }

    public void update(final Action action)
    {
        Square squareFrom = this.get(action.getPosStart());
        Square squareTo   = this.get(action.getPosEnd());

        ChessPiece c = squareFrom.removeChessPiece();
        squareTo.set(c);

        if (c instanceof Pawn &&
                (c.getColor().equals(Color.WHITE) && Pawn.END_ZONE_WHITE.contains(squareTo.pos()) ||
                        c.getColor().equals(Color.BLACK) && Pawn.END_ZONE_BLACK.contains(squareTo.pos())))
        {
            squareTo.set(new Queen(c.getColor()));
        }
    }

    public void clear()
    {
        this.getChildren().forEach(node -> {
            if (node instanceof Square)
            {
                Square square = (Square) node;
                if (!square.isEmpty())
                    square.removeChessPiece();
            }
        });
    }

    public void queue(final Square square) {
        if (isQueued() && square.equals(queued)) {
            deque();
        }
        else {
            deque();
            square.queue();
            queued = square;
            queueLegal();
        }
    }

    private void queueLegal()
    {
        if (this.isQueued())
        {
            this.getQueued().getChessPiece().legalMoves(this.toState())
                    .forEach(pos -> {
                        Square square = this.get(pos);
                        square.setFill(Color.GRAY);
                        legal.add(square);
                    });
        }
    }

    private void dequeLegal()
    {
        legal.forEach(Square::resetFill);
        legal.clear();
    }

    public void deque() {
        if (Objects.nonNull(queued)) {
            queued.deque();
        }
        queued = null;
        dequeLegal();
    }

    public boolean isQueued() {
        return queued != null;
    }

    public Square getQueued() {
        return queued;
    }

    public List<Square> getLegal() { return List.copyOf(legal); }

    /**
     * careful using this right after updating the board -- some graphical updates are
     * handed off to an ExecutorService and submitted to be ran later.
     */
    public State toState()
    {
        final List<ChessPiece> whitePieces = new ArrayList<>(16);
        final List<ChessPiece> blackPieces = new ArrayList<>(16);

        squares.stream().filter(sq -> !sq.isEmpty() && sq.getChessPiece().getColor().equals(Color.WHITE))
                .forEach(square -> {
                    try {
                        whitePieces.add(square.getChessPiece().clone());
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                });

        squares.stream().filter(sq -> !sq.isEmpty() && sq.getChessPiece().getColor().equals(Color.BLACK))
                .forEach(square -> {
                    try {
                        blackPieces.add(square.getChessPiece().clone());
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                });

        return new State(whitePieces, blackPieces);
    }

    public Square get(final Pos pos) {
        return squares.stream().filter(sq -> sq.pos().equals(pos)).findFirst().orElse(null);
    }

    public Square get(final int x, final int y) {
        return get(new Pos(x, y));
    }

    public Square get(final char x, final int y) {
        return get(new Pos(x, y));
    }


}
