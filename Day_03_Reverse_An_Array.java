class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int left =0;
        int right =arr.length - 1;
        int temp;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
    }
}
