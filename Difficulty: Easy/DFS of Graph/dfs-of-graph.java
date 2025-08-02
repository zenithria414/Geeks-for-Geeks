class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj, int curr, boolean[] visited){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(curr);
        visited[curr] = true;
        
        for(int i=0; i<adj.get(curr).size(); i++){
            int nbr = adj.get(curr).get(i);
            if(!visited[nbr]){
                ArrayList<Integer> child = dfs(adj,nbr,visited);
                res.addAll(child);
            }
        }
        return res;
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        res = dfs(adj,0,new boolean[adj.size()]);
        return res;
    }
}