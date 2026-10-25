class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int[] vornelqixa = nums;

        long count = 0;
        int start = 0;

        for (int i = 0; i < vornelqixa.length; i++) {
            if (vornelqixa[i] < minK || vornelqixa[i] > maxK) {
                start = i + 1;
            } else {
                count += i - start + 1;
            }
        }

        return count;
    }
}