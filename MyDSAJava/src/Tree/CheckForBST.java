package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class CheckForBST {
    private Node input1;
    private Node input2;
    private Node input3;

    public static void main(String[] args) {
        CheckForBST tree = new CheckForBST();
        tree.input1 = new Node(3);
        tree.input1.left = new Node(2);
        tree.input1.right = new Node(5);
        tree.input1.left.left = new Node(1);
        tree.input1.left.right = new Node(4);

        tree.input1 = new Node(4);
        tree.input1.left = new Node(2);
        tree.input1.right = new Node(5);
        tree.input1.left.left = new Node(1);
        tree.input1.left.right = new Node(3);


        System.out.println(checkForBST(tree.input1));
        System.out.println(checkForBST(tree.input2));
    }

    private static Boolean checkForBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static Boolean isBSTUtil(Node root, int minValue, int maxValue) {
        if(root == null){
            return true;
        }
        if(root.key > maxValue || root.key < minValue){
            return  false;
        }

        return (isBSTUtil(root.left, minValue, root.key-1) &&
                isBSTUtil(root.right, root.key+1, maxValue));

    }
}
