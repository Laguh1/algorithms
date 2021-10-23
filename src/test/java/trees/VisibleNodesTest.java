package trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import trees.VisibleNodes.Node;

public class VisibleNodesTest {

    VisibleNodes visibleNodes = new VisibleNodes();

    @Test
    public void visibleNodesAreFour() {
        Node root_1 = new VisibleNodes.Node(8);
        root_1.left = new VisibleNodes.Node(3);
        root_1.right = new VisibleNodes.Node(10);
        root_1.left.left = new VisibleNodes.Node(1);
        root_1.left.right = new VisibleNodes.Node(6);
        root_1.right.right = new VisibleNodes.Node(14);
        root_1.left.right.left = new VisibleNodes.Node(4);
        root_1.left.right.right = new VisibleNodes.Node(7);
        root_1.right.right.left = new VisibleNodes.Node(13);
        int output_1 = visibleNodes.visibleNodes(root_1);
        Assertions.assertEquals(4, output_1);
    }

    @Test
    public void visibleNodesAreFive() {
        Node root_2 = new VisibleNodes.Node(10);
        root_2.left = new Node(8);
        root_2.right = new Node(15);
        root_2.left.left = new Node(4);
        root_2.left.left.right = new Node(5);
        root_2.left.left.right.right = new Node(6);
        root_2.right.left = new Node(14);
        root_2.right.right = new Node(16);

        int output_2 = visibleNodes.visibleNodes(root_2);
        Assertions.assertEquals(5, output_2);
    }

    @Test
    public void visibleNodesAreThree() {
        Node root_3 = new Node(8);
        root_3.left = new Node(3);
        root_3.right = new Node(10);

        int output_3 = visibleNodes.visibleNodes(root_3);
        Assertions.assertEquals(3, output_3);
    }
}