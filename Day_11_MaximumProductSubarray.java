class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int maxProduct = arr[0];
        
        int prefix =1; 
        int suffix =1;
        
        for(int i=0; i<n; i++){
            prefix *= arr[i];
            suffix *= arr[n-1-i];
            
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
            
            if(prefix==0){
                prefix =1;
            }
            if(suffix==0){
                suffix =1;
            }
        }
        return maxProduct;
    }
}
