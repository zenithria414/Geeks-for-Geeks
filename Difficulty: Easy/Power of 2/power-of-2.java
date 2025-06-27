class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        int logValue = (int)(Math.log(n)/Math.log(2));  //2^x = n
        return (Math.pow(2,logValue) == n);
    }
}