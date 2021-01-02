package struct;

import org.junit.Test;

import java.util.Arrays;

public class NodeTest
{
    @Test
    public void test00() {
        Node<String> root = new Node<>("root");
        Node<String> node = null;
        root.addChild(new Node<>("state1").addChildren(
                Arrays.asList(node=new Node<>("state2"), new Node<>("state3"))
        ));
        root.addChild(new Node<>("state4"));
        root.addChild(new Node<>("state5").addChildren(
                Arrays.asList(new Node<>("state6"), new Node<>("state7"), new Node<>("state8"))
        ));

        System.out.println(node.getDepth());
    }
}
