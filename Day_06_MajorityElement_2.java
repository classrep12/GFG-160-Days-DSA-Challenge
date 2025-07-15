class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        Arrays.sort(arr);
        int i=0;
        
        while(i<n){
            int count =1;
            while(i+count<n && arr[i] == arr[i+count]){
                count++;
            }
            
            if(count>n/3){
                result.add(arr[i]);
            }
            i+=count;
            
        }
        return result;
    }
}
