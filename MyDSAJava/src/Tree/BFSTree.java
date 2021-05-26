package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTree {
    private Node root;

    public static void main(String[] args)
    {
        BFSTree tree = new BFSTree();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);
        tree.BFSTreeTraversal(tree.root);
    }

    private void BFSTreeTraversal(Node root) {
        if(root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node n = queue.peek();
            queue.remove();

            System.out.println(n.key);

            if(n.left != null){
                queue.add(n.left);
            }

            if(n.right != null){
                queue.add(n.right);
            }

        }
    }
}
