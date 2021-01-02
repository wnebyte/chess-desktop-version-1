package manual;

import model.Pos;
import model.State;
import model.graphic.King;
import model.Action;
import util.StateGenerator;

import de.saxsys.javafx.test.JfxRunner;
import javafx.scene.paint.Color;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;


@RunWith(JfxRunner.class)
public class StateTest
{
    @Test
    public void testCheckmateBlack() {
        State state = StateGenerator.checkmateBlack();
        boolean checkmate = state.checkmate(Color.BLACK);
        Assert.assertTrue(checkmate);
    }

    @Test
    public void testEmpty() {
        Pos POS_START = new Pos('A', 1);
        Pos POS_END   = new Pos('A', 2);

        State state = new State(new ArrayList<>(){{add(new King(Color.WHITE, POS_START));}},
                new ArrayList<>(){{add(new King(Color.BLACK, new Pos('A', 8)));}});

        boolean isEmpty0 = state.isEmpty(POS_END);
        state.update(new Action(POS_START, POS_END));
        boolean isEmpty1 = state.isEmpty(POS_END);
        Assert.assertTrue(isEmpty0);
        Assert.assertFalse(isEmpty1);
    }

    @Test
    public void testCopy() {
        State state = StateGenerator.checkmateBlack();
        State copy = State.copyOf(state);
        Assert.assertNotSame(state, copy);
    }
}
