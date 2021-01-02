package model.minmax;

import javafx.scene.paint.Color;
import model.State;
import struct.Node;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchSpace
{
    private final Node<State> root;

    private final Max max = new Max();

    private final Min min = new Min();

    private final int TERMINAL_DEPTH = 3;

    public SearchSpace(final Node<State> root)
    {
        this.root = root;
    }

    public State decision()
    {
        this.populateTree(root);
        return this.minimax();
    }

    private boolean cutoffTest(final Node<State> node, int depth)
    {
        return TERMINAL_DEPTH <= depth ||
                node.getData().checkmate(Color.WHITE) ||
                node.getData().checkmate(Color.BLACK);
    }

    private void populateTree(final Node<State> node)
    {
        int depth = node.getDepth();

        if (cutoffTest(node, depth))
        {
            if (depth % 2 == 0) {
                this.min.minimax(node);
            }
            else {
                this.max.minimax(node);
            }
            return;
        }

        List<Node<State>> nodes = depth % 2 == 0 ? this.max.generate(node) :
                this.min.generate(node);

        for (Node<State> n : nodes)
        {
           node.addChild(n);
           populateTree(n);
        }

    }

    private State minimax()
    {
        for (int n = TERMINAL_DEPTH - 1; n > -1; n--)
        {
            for (Node<State> node : root.nthDepthNodes(n))
            {
                if (n % 2 == 0) {
                    this.max.minimax(node);
                }
                else {
                    this.min.minimax(node);
                }
            }
        }

        Collections.shuffle(root.getChildren());
        State state = root.getChildren().stream()
                .max(Comparator.comparingInt(val -> val.getData().getUtility()))
                .orElseThrow().getData();
        System.out.printf("posF: %s, posT: %s%n",
                state.getAction().getPosStart(), state.getAction().getPosEnd());
        return state;
    }

    public Node<State> getRoot()
    {
        return root;
    }
}
