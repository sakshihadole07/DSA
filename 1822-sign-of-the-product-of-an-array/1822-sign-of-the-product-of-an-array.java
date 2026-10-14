class Solution {
    public int arraySign(int[] nums) {
        int count =0;
        for(int n:nums){
        if(n==0) return 0;
        if(n<0) count++;
        }
        return count % 2 == 0 ? 1 : -1;
    }
}