package model.minmax;

import javafx.scene.paint.Color;
import model.graphic.ChessPiece;
import model.Pos;
import model.State;
import struct.Node;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Max extends Search
{
    private final Sort sort = new Sort();

    protected List<Node<State>> generate(final Node<State> node)
    {
        if (node == null)
            return new ArrayList<>(0);

        final List<Node<State>> children = new ArrayList<>(20);

        for (ChessPiece c : node.getData().getBlackPieces())
        {
            for (Pos pos : c.moves(node.getData()))
            {
                final State state = State.copyOf(node.getData()).update(c.getPos(), pos);

                if (!state.check(Color.WHITE))
                {
                    children.add(new Node<>(state));
                }
            }
        }

        return children;
    }

    protected void minimax(final Node<State> node)
    {
        if (node.getChildren().isEmpty())
        {
            node.getData().setUtility(this.utility(node.getData()));
        }
        else
        {
            node.getData().setUtility(
                    node.getChildren().stream().max(Comparator.comparingInt(val -> val.getData()
                            .getUtility())).orElseThrow()
                            .getData().getUtility()
            );
        }
    }
    
    protected Node<State> max(final List<Node<State>> nodes)
    {
        this.sort(nodes);
        return nodes.stream().max(this.sort).orElseThrow();
    }

    protected List<Node<State>> max(final List<Node<State>> nodes, final int constant)
    {
        this.sort(nodes);
        return trim(nodes, constant);
    }

    private List<Node<State>> trim(final List<Node<State>> nodes, final int constant)
    {
        if (nodes != null && constant < nodes.size()) {
            nodes.subList(0, nodes.size() - constant).clear();
        }
        return nodes;
    }

    private void sort(final List<Node<State>> nodes)
    {
        if (nodes != null && 0 < nodes.size())
            nodes.sort(sort);
    }

    public int utility(final State state)
    {
        int value = 0;

        if (state != null)
        {
            for (ChessPiece c : state.getWhitePieces())
            {
                value -= c.value();
            }

            for (ChessPiece c : state.getBlackPieces())
            {
                value += c.value();
            }
        }

        return value;
    }

    private class Sort implements Comparator<Node<State>>
    {
        @Override
        public int compare(Node<State> state1, Node<State> state2)
        {
            if (state1 != null && state2 != null)
                return utility(state1.getData()) - utility(state2.getData());
            return 0;
        }
    }
}
