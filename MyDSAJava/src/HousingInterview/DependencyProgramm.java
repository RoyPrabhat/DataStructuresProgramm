//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//class Node{
//    String startTask, EndTask;
//    Node(String firstTask, String secondTask){
//        startTask = firstTask;
//        EndTask = secondTask;
//    }
//}
//
//class TreeNode {
//    String nodeValue;
//    TreeNode right;
//    TreeNode(String key){
//        nodeValue = key;
//        right = null;
//    }
//}
//
//public class DependencyProgramm {
//    public static void main(String[] args){
//
//        ArrayList<Node> nodesList = new ArrayList<>();
//        nodesList.add(new Node("b","c"));
//        nodesList.add(new Node("a","b"));
//        nodesList.add(new Node("c","d"));
//        nodesList.add(new Node("d","e"));
//        findFinalDependency(nodesList);
//    }
//
//    private static void findFinalDependency(ArrayList<Node> nodesList) {
//        HashMap<String, Integer> nodeCount = new HashMap<>();
//
//        int inputSize = nodesList.size();
//        String firstNode = "";
//
//        for(int i = 0; i < inputSize; i ++){
//            if(nodeCount.containsKey(nodesList.get(i).startTask)){
//                int count = nodeCount.get(i);
//                nodeCount.put(nodesList.get(i).startTask, ++count);
//            } else{
//                nodeCount.put(nodesList.get(i).startTask, 1);
//            }
//
//            if(nodeCount.containsKey(nodesList.get(i).EndTask)) {
//                int count = nodeCount.get(i);
//                nodeCount.put(nodesList.get(i).EndTask, ++count);
//            } else {
//                nodeCount.put(nodesList.get(i).EndTask, 1);
//            }
//        }
//
//        for (Map.Entry<String,Integer> entry : nodeCount.entrySet()){
//            if(entry.getValue() == 1){
//                firstNode = entry.getKey();
//                break;
//            }
//        }
//
//        TreeNode root = new TreeNode(firstNode);
//        insertNode(nodesList, root);
//    }
//
//    private static void insertNode(ArrayList<Node> nodesList, TreeNode root) {
//        root.right = findRightNode(nodesList);
//
//    }
//
//    private static TreeNode findRightNode(ArrayList<Node> nodesList) {
//
//    }
//}
//
