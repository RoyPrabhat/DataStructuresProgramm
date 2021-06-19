package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftView {
    private Node input1;
    private Node input2;
    private Node input3;

    public static void main(String[] args) {
        PrintLeftView tree = new PrintLeftView();
        tree.input1 = new Node(4);
        tree.input1.left = new Node(5);
        tree.input1.right = new Node(2);
        tree.input1.right.left = new Node(3);
        tree.input1.right.right = new Node(1);
        tree.input1.right.left.left = new Node(6);
        tree.input1.right.left.right = new Node(7);

        tree.input2 = new Node(1);
        tree.input2.left = new Node(2);
        tree.input2.right = new Node(3);
        tree.input2.left.left = new Node(4);
        tree.input2.left.right = new Node(5);
        tree.input2.right.right = new Node(6);


        tree.input3 = new Node(1);
        tree.input3.left = new Node(2);
        tree.input3.right = new Node(3);
        tree.input3.left.right = new Node(4);
        tree.input3.left.right.right = new Node(5);
        tree.input3.left.right.right.right = new Node(6);

        tree.leftViewTraversal(tree.input3);
    }

    private void leftViewTraversal(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                Node tempNode = nodes.poll();
                if (i == 0) {
                    System.out.println("LEFT NODE = " + tempNode.key);
                }
                if (tempNode.left != null) {
                    nodes.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    nodes.add(tempNode.right);
                }

            }
        }
    }
}
