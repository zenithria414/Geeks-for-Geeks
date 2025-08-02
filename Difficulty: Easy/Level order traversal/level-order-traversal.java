/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        q.add(root);
        q.add(null);
        ArrayList<Integer> current = new ArrayList<>();
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                res.add(current);
                current = new ArrayList<>();
                if(q.isEmpty()) break;
                else q.add(null);
            }
            else{
                current.add(currNode.data);
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
            }
        }
        return res;
    }
}