// User function Template for Java

class Solution {
    static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    static void reverse(Stack<Integer> s) {
        // add your code here
        if(s.isEmpty()) return;
        int top = s.pop();
        reverse(s);
        pushAtBottom(s,top);
        
    }
}