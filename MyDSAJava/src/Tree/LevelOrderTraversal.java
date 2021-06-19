package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String[] args)
    {
        Node tree = new Node(1);

        tree.left= new Node(2);
        tree.right= new Node(3);

        tree.left.left= new Node(4);
        tree.left.right= new Node(5);

        tree.right.left= new Node(6);
        tree.right.right= new Node(7);

        tree.right.right.left= new Node(8);
        tree.right.right.right= new Node(9);

        levelOrderTraversal(tree);
        int height = findHeight(tree);
        System.out.println("Height " + height);

    }

    private static int findHeight(Node root) {
        if(root == null){
            return 0;
        }
        int leftSubTreeHeight = findHeight(root.left);
        int rightSubTreeHeight = findHeight(root.left);
        if(leftSubTreeHeight > rightSubTreeHeight){
            return leftSubTreeHeight + 1;
        } else {
            return rightSubTreeHeight +1;
        }
    }

    private static void levelOrderTraversal(Node root) {
        if(root ==  null){
            return;
        }
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        Node temp = null;
        while (!nodes.isEmpty()){
            temp = nodes.peek();
            System.out.println(temp.key);
            nodes.remove();
            if(temp.left != null){
                nodes.add(temp.left);
            }
            if(temp.right != null){
                nodes.add(temp.right);
            }
        }
    }
}
