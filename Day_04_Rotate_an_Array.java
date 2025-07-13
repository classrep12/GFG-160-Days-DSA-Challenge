class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        if(arr == null ||n==0 || d==0|| d%n==0) return;
        d = d%n;
        int temp[] = new int[d];
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        
        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];
        }
        
        for(int i=0; i<d; i++){
            arr[n-d+i] = temp[i];
        }
    }
}
