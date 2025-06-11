class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int temp = 0;
        int left = 0;
        int right= arr.length-1;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}