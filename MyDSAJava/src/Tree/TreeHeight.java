package Tree;

import com.sun.source.tree.BinaryTree;

public class TreeHeight {
    private Node root;

    public static void main(String[] args)
    {
        TreeHeight tree = new TreeHeight();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int depth = tree.maxDepth(tree.root);
        System.out.println("Height of tree is : " + depth);
    }

    private int maxDepth(Node root) {
        if(root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if(leftDepth > rightDepth){
            return leftDepth+1;
        } else {
            return rightDepth +1;
        }
    }
}
