// User function Template for Java
import java.util.*;
import java.math.BigInteger;
class Solution {
    public static BigInteger calcFactorial(int n){
        if(n ==0 || n== 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(calcFactorial(n - 1));
    }
    public static ArrayList<Integer> factorial(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
         BigInteger num = calcFactorial(n);

        for (char c : num.toString().toCharArray()) {
            arr.add(c - '0'); 
        }

        return arr;
    }
}