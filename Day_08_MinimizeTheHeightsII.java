class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0]; // initial difference
        
        int smallest = arr[0]+k;
        int largest = arr[n-1]-k;
        
        for(int i=0; i<n-1; i++){
            int minH = Math.min(smallest, arr[i+1]-k);
            int maxH = Math.max(largest, arr[i]+k);
            
            if(minH <0){
                continue;
            }
            
            ans = Math.min(ans, maxH-minH);
        }
        return ans;
    }
}
