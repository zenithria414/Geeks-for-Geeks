class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> res = new ArrayList<>();
        
        q.add(0);
        
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                res.add(curr);
                visited[curr] = true;
                
                for(int i=0; i<adj.get(curr).size(); i++){
                    q.add(adj.get(curr).get(i));
                }
            }
        }
        return res;
    }
}