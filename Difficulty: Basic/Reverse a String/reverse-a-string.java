// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        String res = "";
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            res += ch;
        }
        return res;
    }
}