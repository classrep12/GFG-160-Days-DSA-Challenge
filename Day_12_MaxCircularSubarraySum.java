class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int TotSum =0;
        
        int maxSum = arr[0];
        int currMax =0;
        
        int minSum = arr[0];
        int currMin =0;
        
        for(int i=0; i<arr.length; i++){
            TotSum += arr[i];
            currMax = Math.max(currMax+arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMax);
            
            currMin = Math.min(currMin+arr[i], arr[i]);
            minSum = Math.min(minSum, currMin);
        }
        
        if(maxSum<0){
            return maxSum;
            
        }
        
        return Math.max(maxSum, TotSum - minSum);
    }
}
