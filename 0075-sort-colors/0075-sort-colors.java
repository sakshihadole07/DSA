class Solution {
    public void sortColors(int[] nums) {
      int low=0;
      int mid=0;
      int high=nums.length-1;
      while(mid<=high){
        if(nums[mid]==0){
            swap(nums, low,mid);
            low++;
            mid++;

        }else if(nums[mid]==2){
            swap(nums,mid,high);
            high--;

        }else{
            mid++;
        }
      }
    }
    public static void swap(int[] nums,int pos1,int pos2){
        int temp=nums[pos1];
        nums[pos1]=nums[pos2];
        nums[pos2]=temp;
    }
}