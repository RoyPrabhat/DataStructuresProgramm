package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class DFSTree {
    private Node root;

    public static void main(String[] args)
    {
        DFSTree tree = new DFSTree();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("IN ODER");
        tree.DFSInOrderTreeTraversal(tree.root);

        System.out.println("PRE ODER");
        tree.DFSPreOrderTreeTraversal(tree.root);

        System.out.println("POST ODER");
        tree.DFSPostOrderTreeTraversal(tree.root);

    }

    private void DFSInOrderTreeTraversal(Node root) {
        if(root == null){
            return;
        }

        DFSInOrderTreeTraversal(root.left);
        System.out.print(root.key + " ");
        DFSInOrderTreeTraversal(root.right);
    }

    private void DFSPreOrderTreeTraversal(Node root) {
        if(root == null){
            return;
        }

        System.out.print(root.key + " ");
        DFSPreOrderTreeTraversal(root.left);
        DFSPreOrderTreeTraversal(root.right);
    }

    private void DFSPostOrderTreeTraversal(Node root) {
        if(root == null){
            return;
        }
        DFSPostOrderTreeTraversal(root.left);
        DFSPostOrderTreeTraversal(root.right);
        System.out.print(root.key + " ");
    }


}
