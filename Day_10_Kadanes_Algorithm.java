class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxSum = arr[0];
        int sum =arr[0];
        
        for(int i=1; i<arr.length; i++){
            sum = Math.max(arr[i], arr[i]+sum);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
