class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
        int pivotidx = partition(arr,low,high);
        quickSort(arr,low,pivotidx-1);
        quickSort(arr,pivotidx+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int i = low-1;
        int pivot = arr[high];
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        
        return i;
    }
}