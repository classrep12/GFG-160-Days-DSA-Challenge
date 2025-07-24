class Solution {
    public int myAtoi(String s) {
        // code here
        if (s == null || s.length() == 0) return 0;
        
        int i=0; int n= s.length();
        int sign = 1;
        long num =0;
        
        while(i<n && s.charAt(i)== ' ') i++;
        
        if (i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = (s.charAt(i)=='-')? -1: 1;
            i++;
        }
        
        boolean FoundDigit = false;
        while(i<n && Character.isDigit(s.charAt(i))){
            FoundDigit = true;
            num = num*10 + (s.charAt(i)-'0');
            
            if(sign == 1 && num>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign == -1 && -num<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        
        if(!FoundDigit) return 0;
        
        return (int)(sign * num);
        
    }
}
