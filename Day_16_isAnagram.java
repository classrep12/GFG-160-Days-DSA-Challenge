class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        int[] count = new int[26];
        
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) -'a']--;
        }
        
        for(int c : count){
            if(c != 0) return false;
        }
        return true;
    }
}
