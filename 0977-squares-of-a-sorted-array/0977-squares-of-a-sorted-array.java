class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int left=0;
        int right=nums.length-1;
        int index=result.length-1;
        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
            result[index]=nums[left]*nums[left];
            left++;
            }else{
            result[index]=nums[right]*nums[right];
            right--;
            }
            index--;
        }
        return result;
    }
}