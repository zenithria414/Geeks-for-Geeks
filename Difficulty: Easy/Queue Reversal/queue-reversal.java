class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        // code here.
        Stack<Integer> s = new Stack<>();
        while(!queue.isEmpty()){
            s.push(queue.remove());
        }
        while(!s.isEmpty()){
            queue.add(s.pop());
        }
        return queue;
    }
    
}