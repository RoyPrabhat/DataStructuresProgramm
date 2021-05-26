package Tree;

public class Node {
    public Node left, right;
    public int key;
    Node(int key) {
        this.key = key;
        left = right = null;
    }
}
