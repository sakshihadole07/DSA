class Solution {
    public boolean validPalindrome(String s) {
        int left=0; 
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return ispal(s,left+1,right)||ispal(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }   
    private boolean ispal(String s,int left, int right){
       
        while(left<right){
         if(s.charAt(left) != s.charAt(right)){ 
         //if(s.charAt(left) != s.charAt(right))
             return false;
            } 
            left++; 
            right--;
        }
        return true;
    }
        
} 