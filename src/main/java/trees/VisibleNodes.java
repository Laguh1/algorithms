package trees;

import java.io.*;
import java.util.*;

public class VisibleNodes {

    static class Node {
        int data;
        Node left;
        Node right;

        Node() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Add any helper functions you may need here

    int count = 0;

    int visibleNodes(Node root) {
        if (root == null) {
            return count;
        }
        if (root.left == null) {
            return visibleNodes(root.right) + 1;
        }
        if (root.left.left == null && root.left.right == null) {
            return visibleNodes(root.right) + 1;
        }

        return visibleNodes(root.left) + 1;
    }
}