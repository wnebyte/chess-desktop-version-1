package manual.struct;

import org.junit.Assert;
import org.junit.Test;
import struct.Node;

import java.util.Arrays;

public class NodeTest
{
    @Test
    public void testDepth() {
        Node<String> root = new Node<>("root");
        Node<String> node1;
        Node<String> node2;

        root.addChild(node1=new Node<>("state1").addChildren(
                Arrays.asList(new Node<>("state2"), new Node<>("state3"))
        ));
        root.addChild(new Node<>("state4"));
        root.addChild(new Node<>("state5").addChildren(
                Arrays.asList(node2=new Node<>("state6"),
                        new Node<>("state7"), new Node<>("state8"))
        ));

        Assert.assertEquals(0, root.getDepth());
        Assert.assertEquals(1, node1.getDepth());
        Assert.assertEquals(2, node2.getDepth());
    }
}
