package model.minmax;

import model.State;
import struct.Node;

import java.util.List;

public abstract class Search
{
    protected abstract List<Node<State>> generate(final Node<State> node);
}
