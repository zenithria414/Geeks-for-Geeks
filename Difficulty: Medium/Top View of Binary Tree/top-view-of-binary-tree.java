/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    
    public static class Info{
        int hd;
        Node node;

        Info(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Queue<Info> q = new LinkedList<>();
        Map<Integer, Node> map = new HashMap<>();

        q.add(new Info(0, root));
        q.add(null);
        int min = 0, max = 0;

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.hd - 1, curr.node.left));
                    min = Math.min(min, curr.hd - 1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.hd + 1, curr.node.right));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for(int i = min; i <= max; i++){
            res.add(map.get(i).data);
        }
        return res;
    }
}