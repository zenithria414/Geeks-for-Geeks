class Solution {
    void conquer(int arr[], int si, int mid, int ei){
        int[] merged = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }
        
        while(idx1<=mid ){
                merged[x++] = arr[idx1++];
        }
        
        while(idx2<=ei ){
                merged[x++] = arr[idx2++];
        }
        
        for(int i=0, j=si; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) return;
        int mid = l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        conquer(arr,l,mid,r);
    }
}